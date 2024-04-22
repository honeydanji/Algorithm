a, b = input().split(" ")

rever_a = int(a[::-1])
rever_b = int(b[::-1])

if rever_a > rever_b:
    print(rever_a)
else:
    print(rever_b)
