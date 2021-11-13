import sys
sys.stdin=open("input.txt", "r")
t= int(input())
for i in range(t):
    m,n,x,y= map(int,input().split())
    while True:
        if x%n==y%n:
            print(x)
            break
        x+=m
        if m*n<x:
            print(-1)
            break









# for i in range(t):
#     m,n,x,y= map(int,input().split())
#     maxx=m*n
#     cnt=0
#     xx,yy=0,0
#     while True:
#         cnt+=1
#         xx+=1
#         yy+=1
#         if xx==x and yy==y:
#             answer.append(cnt)
#             break
#         if xx==m:
#             xx=0
#         if yy==n:
#             yy=0
#         if cnt>maxx:
#             cnt=-1
#             answer.append(cnt)
#             break
# for i in range(t):
#     print(answer)