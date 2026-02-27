#!/usr/bin/env python3
"""
Run a solution against HackerRank's sample test cases.

Usage:
    python3 run_solution.py <challenge-slug> [language]

Example:
    python3 run_solution.py a-very-big-sum python3
"""

import sys
import time
import pathlib
import requests
from auth import get_browser_session, BROWSER_HEADERS as _BROWSER_HEADERS, REPO_ROOT


def submit_code(
    session: requests.Session,
    slug: str,
    code: str,
    language: str = 'python3',
    custom_testcase: bool = False,
) -> dict:
    """POST code to compile_tests and return the raw response JSON."""
    url = f'https://www.hackerrank.com/rest/contests/master/challenges/{slug}/compile_tests'
    resp = session.post(
        url,
        json={
            'code': code,
            'language': language,
            'customtestcase': custom_testcase,
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


def _is_done(model: dict) -> bool:
    """Return True when compile_tests has finished all testcases.

    The server signals completion via status_string.progress == progress_states.
    """
    ss = model.get('status_string')
    if isinstance(ss, dict):
        progress = ss.get('progress', 0)
        total = ss.get('progress_states', 0)
        return total > 0 and progress >= total
    # Fallback: if there's no status_string yet, keep waiting
    return False


def poll_result(session: requests.Session, slug: str, submission_id: int, interval: float = 1.5) -> dict:
    """Poll the compile_tests endpoint until all testcases are judged."""
    url = f'https://www.hackerrank.com/rest/contests/master/challenges/{slug}/compile_tests/{submission_id}'
    while True:
        resp = session.get(url, headers=_BROWSER_HEADERS)
        resp.raise_for_status()
        data = resp.json().get('model', {})
        if _is_done(data):
            return data
        print('  Waiting for result...', flush=True)
        time.sleep(interval)


def print_result(result: dict) -> None:
    """Pretty-print the test run result.

    The compile_tests response uses parallel arrays:
      testcase_status   — list of 1 (pass) / 0 (fail) per testcase
      testcase_message  — list of message strings per testcase
      stdin / stdout / stderr / expected_output — lists per testcase
    """
    compile_msg = result.get('compilemessage') or ''
    tc_statuses = result.get('testcase_status') or []
    tc_messages = result.get('testcase_message') or []
    stdins       = result.get('stdin') or []
    stdouts      = result.get('stdout') or []
    stderrs      = result.get('stderr') or []
    expected     = result.get('expected_output') or []

    # Overall status
    if compile_msg.strip():
        overall = 'Compilation Error'
    elif tc_statuses:
        overall = 'Accepted' if all(s == 1 for s in tc_statuses) else 'Wrong Answer'
    else:
        overall = 'Unknown'

    print(f'\nStatus : {overall}')

    if compile_msg.strip():
        print(f'\nCompile message:\n{compile_msg}')

    if tc_statuses:
        n = len(tc_statuses)
        print(f'\nTest cases ({n}):')
        for i in range(n):
            passed = tc_statuses[i] == 1
            icon = '✓' if passed else '✗'
            msg = tc_messages[i] if i < len(tc_messages) else ''
            suffix = f' — {msg}' if msg and not passed else ''
            print(f'  [{icon}] Test {i + 1}{suffix}')
            if not passed:
                if i < len(stdins) and stdins[i]:
                    print(f'       Input   : {stdins[i].strip()}')
                if i < len(expected) and expected[i]:
                    print(f'       Expected: {expected[i].strip()}')
                if i < len(stdouts) and stdouts[i]:
                    print(f'       Got     : {stdouts[i].strip()}')
                if i < len(stderrs) and stderrs[i]:
                    print(f'       Stderr  : {stderrs[i].strip()}')


def run(slug: str, language: str = 'python3') -> None:
    solution_file = REPO_ROOT / 'python' / 'problems' / slug / 'solution.py'
    if not solution_file.exists():
        print(f'Solution file not found: {solution_file.relative_to(REPO_ROOT)}')
        sys.exit(1)

    code = solution_file.read_text()
    print(f'Running: python/problems/{slug}/solution.py')

    session = get_browser_session()
    print('Submitting to compile_tests...')

    response = submit_code(session, slug, code, language)

    # Some problems return result inline; others return a submission id to poll
    model = response.get('model') or response
    submission_id = model.get('id') if isinstance(model, dict) else None

    # Always poll if we received a submission id — poll_result decides when done
    if submission_id and not _is_done(model):
        print(f'Submission ID: {submission_id}. Polling for result...')
        result = poll_result(session, slug, submission_id)
    else:
        result = model if isinstance(model, dict) else response

    print_result(result)


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    challenge_slug = sys.argv[1]
    lang = sys.argv[2] if len(sys.argv) > 2 else 'python3'
    run(challenge_slug, lang)
