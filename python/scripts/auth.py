"""
Shared HackerRank session / authentication helpers.
"""

import os
import pathlib
import requests
from dotenv import load_dotenv

REPO_ROOT = pathlib.Path(__file__).resolve().parents[2]
load_dotenv(REPO_ROOT / '.env')

USERNAME = os.environ['HR_USERNAME']
PASSWORD = os.environ['HR_PASSWORD']
REMEMBER_TOKEN = os.environ.get('HR_REMEMBER_TOKEN', '')
BROWSER_SESSION = os.environ.get('HR_SESSION', '')
BROWSER_CSRF = os.environ.get('HR_CSRF', '')

BROWSER_HEADERS = {
    'User-Agent': (
        'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) '
        'AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36'
    ),
    'Accept': 'application/json',
    'Accept-Language': 'en-US,en;q=0.9',
    'Origin': 'https://www.hackerrank.com',
}


def get_session() -> requests.Session:
    """Return an authenticated HackerRank session with CSRF token set.

    For most endpoints (e.g. compile_tests, challenge data) this uses the
    standard API login flow (username + password → CSRF token).

    For the /submissions endpoint, use get_browser_session() instead, which
    requires HR_SESSION and HR_CSRF to be set in .env (copy from browser
    DevTools after logging in).
    """
    session = requests.Session()
    session.headers.update(BROWSER_HEADERS)

    if REMEMBER_TOKEN:
        session.cookies.set('remember_hacker_token', REMEMBER_TOKEN, domain='.hackerrank.com')

    # GET dashboard to establish a session cookie
    session.get('https://www.hackerrank.com/dashboard', headers={
        **BROWSER_HEADERS,
        'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8',
    })

    # POST credentials — returns CSRF for compile_tests / read endpoints
    resp = session.post(
        'https://www.hackerrank.com/auth/login',
        json={
            'login': USERNAME,
            'password': PASSWORD,
            'remember_me': True,
            'fallback': False,
        },
    )
    resp.raise_for_status()
    data = resp.json()

    if not data.get('status'):
        raise RuntimeError(f"Login failed: {data.get('errors') or data}")

    session.headers['X-CSRF-Token'] = data['csrf_token']
    session.cookies.set('hrc_l_i', 'T', domain='www.hackerrank.com')
    return session


def get_browser_session() -> requests.Session:
    """Return a session using the browser-captured _hrank_session + CSRF token.

    This is required for the /submissions endpoint which enforces stronger
    session validation. Copy HR_SESSION and HR_CSRF from browser DevTools:

        1. Open DevTools → Application → Cookies → www.hackerrank.com
        2. Copy _hrank_session value → HR_SESSION in .env
        3. Open any network request → Request Headers → x-csrf-token
        4. Copy that value → HR_CSRF in .env

    These typically stay valid for days to weeks.
    """
    if not BROWSER_SESSION or not BROWSER_CSRF:
        raise RuntimeError(
            'HR_SESSION and HR_CSRF must be set in .env for submissions.\n'
            'Copy them from browser DevTools (see auth.py docstring).'
        )

    session = requests.Session()
    session.headers.update(BROWSER_HEADERS)
    session.headers['X-CSRF-Token'] = BROWSER_CSRF
    session.cookies.set('_hrank_session', BROWSER_SESSION, domain='www.hackerrank.com')
    session.cookies.set('hrc_l_i', 'T', domain='www.hackerrank.com')
    if REMEMBER_TOKEN:
        session.cookies.set('remember_hacker_token', REMEMBER_TOKEN, domain='.hackerrank.com')
    return session
