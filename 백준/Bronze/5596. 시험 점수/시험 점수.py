a, b, c, d = map(int, input().split())
e, f, g, h = map(int, input().split())

if (a + b + c + d) >= (e + f + g + h) :
    print(a + b + c + d)
else :
    print(e + f + g + h)