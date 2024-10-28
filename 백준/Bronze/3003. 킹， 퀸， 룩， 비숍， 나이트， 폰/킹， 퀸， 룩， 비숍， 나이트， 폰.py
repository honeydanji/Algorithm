# 킹 1 퀸 1 룩 2 비숍 2 나이트 2 폰 8

ch = list(map(int, input().split()))
nomal = [1, 1, 2, 2, 2, 8]
fix = []

for i in range(len(nomal)):
    if nomal[i] == ch[i]:
        fix.append(0)        
    else:
        fix.append(nomal[i]-ch[i])

print(' '.join(map(str, fix)))