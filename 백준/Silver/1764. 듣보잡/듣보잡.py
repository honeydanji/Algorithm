import sys

n, m = map(int, sys.stdin.readline().split())

no_listen = [sys.stdin.readline().strip() for _ in range(n)]
no_see = [sys.stdin.readline().strip() for _ in range(m)]

answer = list(set(no_listen) & set(no_see))
answer.sort()

print(len(answer))
for a in answer:
    print(a)