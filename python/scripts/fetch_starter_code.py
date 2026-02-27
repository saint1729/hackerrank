#!/usr/bin/env python3
"""
Fetch starter code from HackerRank and scaffold a solution file.

Usage:
    python3 fetch_starter_code.py <challenge-slug> [language]

Example:
    python3 fetch_starter_code.py a-very-big-sum python3
"""

import re
import sys
import pathlib
import requests
from auth import get_session, BROWSER_HEADERS as _BROWSER_HEADERS, REPO_ROOT


def fetch_starter_code(slug: str, language: str = 'python3') -> str:
    """Login, fetch the challenge template, and return the starter code."""
    session = get_session()

    url = f'https://www.hackerrank.com/rest/contests/master/challenges/{slug}'
    resp = session.get(url)
    resp.raise_for_status()

    model = resp.json().get('model', {})

    head = model.get(f'{language}_template_head', '') or ''
    body = model.get(f'{language}_template', '') or ''
    tail = model.get(f'{language}_template_tail', '') or ''

    parts = [p for p in [head, body, tail] if p.strip()]
    if parts:
        return '\n'.join(parts)
    return ''


def scaffold(slug: str, language: str = 'python3') -> pathlib.Path:
    """Fetch starter code and write it to python/<slug>/solution.py."""
    code = fetch_starter_code(slug, language)

    out_dir = REPO_ROOT / 'python' / 'problems' / slug
    out_dir.mkdir(parents=True, exist_ok=True)
    out_file = out_dir / 'solution.py'

    if out_file.exists():
        print(f'File already exists: {out_file.relative_to(REPO_ROOT)}')
        overwrite = input('Overwrite? [y/N] ').strip().lower()
        if overwrite != 'y':
            print('Skipped.')
            return out_file

    out_file.write_text(code)
    print(f'Created: {out_file.relative_to(REPO_ROOT)}')
    return out_file


if __name__ == '__main__':
    if len(sys.argv) < 2:
        print(__doc__)
        sys.exit(1)

    challenge_slug = sys.argv[1]
    lang = sys.argv[2] if len(sys.argv) > 2 else 'python3'

    scaffold(challenge_slug, lang)
