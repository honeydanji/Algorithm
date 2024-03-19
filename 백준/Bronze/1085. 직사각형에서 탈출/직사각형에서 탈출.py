x,y,w,h = map(int, input().split(" "))
print(min(x, y, -1*(w-x) if (w-x)<0 else (w-x) , -1*(h-y) if (h-y)<0 else (h-y)))