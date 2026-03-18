def fib_rec(n, memo):
    if n in memo:
        return memo[n]
    if n <= 1:
        return n
    memo[n] = fib_rec(n - 1, memo) + fib_rec(n - 2, memo)
    return memo[n]


def fibonacci(n):
    return fib_rec(n, {})


n = int(input())
print(fibonacci(n))
