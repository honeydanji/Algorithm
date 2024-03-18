import sys

n = int(input())


def my_arund(num:float) -> int:
    if num - int(num) >= 0.5:
        return int(num) + 1
    else:
        return int(num)

if n == 0:
    print(0)
else:
    data = []

    for i in range(0, n):
        data.append(int(sys.stdin.readline()))

    ave = my_arund(n * 0.15)

    data = sorted(data)
    sel_data = data[ave:len(data)-ave]

    result = sum(sel_data) / len(sel_data)

    print(my_arund(result))
