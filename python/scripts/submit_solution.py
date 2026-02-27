#!/usr/bin/env python3
"""
Submit a solution to HackerRank for official scoring.

Usage:
    python3 submit_solution.py <challenge-slug> [language]

Example:
    python3 submit_solution.py a-very-big-sum python3
"""

import sys
import time
import pathlib
import requests
from auth import get_browser_session, BROWSER_HEADERS as _BROWSER_HEADERS, REPO_ROOT


def submit(session: requests.Session, slug: str, code: str, language: str = 'python3') -> dict:
    """POST to /submissions and return the raw response JSON."""
    url = f'https://www.hackerrank.com/rest/contests/master/challenges/{slug}/submissions'
    resp = session.post(
        url,
        json={
            'code': code,
            'language': language,
            'contest_slug': 'master',
            'playlist_slug': '',
        },
        headers={
            **_BROWSER_HEADERS,
            'Content-Type': 'application/json',
            'Referer': f'https://www.hackerrank.com/challenges/{slug}/problem',
        },
    )
    resp.raise_for_status()
    return resp.json()


PENDING = {'Processing', 'Queued', None}


def poll_result(session: requests.Session, slug: str, submission_id: int, interval: float = 2.0) -> dict:
    """Poll until the submission is fully judged and return the model."""
    url = f'https://www.hackerrank.com/rest/contests/master/challenges/{slug}/submissions/{submission_id}'
    while True:
        resp = session.get(url, headers=_BROWSER_HEADERS)
        resp.raise_for_status()
        model = resp.json().get('model', {})
        if model.get('status') not in PENDING:
            return model
        print('  Judging...', flush=True)
        time.sleep(interval)


def print_result(model: dict) -> None:
    status = model.get('status') or 'Unknown'
    score = model.get('display_score') or model.get('score', 'N/A')
    max_score = model.get('max_score')

    print(f'\nStatus : {status}')
    score_str = f'{score} / {max_score}' if max_score is not None else str(score)
    print(f'Score  : {score_str}')

    compile_msg = model.get('compile_message') or ''
    if compile_msg.strip():
        print(f'\nCompile message:\n{compile_msg}')

    tc_statuses = model.get('testcase_status') or []
    tc_messages = model.get('testcase_message') or []
    is_sample   = model.get('is_sample_testcase') or []

    if tc_statuses:
        passed = sum(1 for s in tc_statuses if s == 1)
        print(f'\nTest cases: {passed}/{len(tc_statuses)} passed')
        for i, s in enumerate(tc_statuses):
            icon = '✓' if s == 1 else '✗'
            msg  = tc_messages[i] if i < len(tc_messages) else ''
            sample_tag = ' [sample]' if i < len(is_sample) and is_sample[i] else ''
            suffix = f' — {msg}' if msg and s != 1 else ''
            print(f'  [{icon}] Test {i + 1}{sample_tag}{suffix}')


def run(slug: str, language: str = 'python3') -> None:
    solution_file = REPO_ROOT / 'python' / 'problems' / slug / 'solution.py'
    if not solution_file.exists():
        print(f'Solution file not found: {solution_file.relative_to(REPO_ROOT)}')
        sys.exit(1)

    code = solution_file.read_text()
    print(f'Submitting: python/problems/{slug}/solution.py')

    session = get_browser_session()
    print('Submitting for scoring...')

    response = submit(session, slug, code, language)
    model = response.get('model', response)

    # Detect expired session
    if isinstance(model, bool) and not model:
        msg = response.get('message', '')
        if 'login' in msg.lower():
            print(
                '\nSession expired. Refresh HR_SESSION and HR_CSRF in .env:\n'
                '  1. Log in at https://www.hackerrank.com\n'
                '  2. DevTools → Application → Cookies → copy _hrank_session → HR_SESSION\n'
                '  3. DevTools → Network → any XHR request → x-csrf-token → HR_CSRF\n'
            )
        else:
            print(f'Unexpected response: {response}')
        sys.exit(1)

    submission_id = model.get('id') if isinstance(model, dict) else None

    if not submission_id:
        print(f'Unexpected response: {response}')
        sys.exit(1)

    print(f'Submission ID: {submission_id}. Polling for result...')
    result = poll_result(session, slug, submission_id)
    print_result(result)


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    challenge_slug = sys.argv[1]
    lang = sys.argv[2] if len(sys.argv) > 2 else 'python3'
    run(challenge_slug, lang)
