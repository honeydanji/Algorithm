import sys
import collections

n = int(input())

num = [int(sys.stdin.readline()) for _ in range(n)]

print(round(sum(num) / n))

num.sort()
print(num[len(num) // 2])

cnt = collections.Counter(num)
cnt1 = cnt.most_common(2)
if n == 1:
    print(num[0])
elif cnt1[0][1] == cnt1[1][1]:
    print(cnt1[1][0])
else:
    print(cnt1[0][0])

if n == 1:
    print(0)
else:
    if num[0] < 0:
        if num[-1] < 0:
            print(abs(num[0]) - abs(num[-1]))
        else:
            print(abs(num[0]) + abs(num[-1]))
    else:
        print(abs(num[-1]) - abs(num[0]))