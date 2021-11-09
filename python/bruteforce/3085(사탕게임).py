import sys
sys.stdin=open("input.txt","r")

n=int(input())
a=[list(input()) for _ in range(n)]
maxx=0


def Search():
    global maxx
    for i in range(n):
        cnt=1
        for j in range(n-1):
            #한 행이 모두 같을때
            if a[i][j]==a[i][j+1]:
                cnt+=1
            else:
                cnt=1
            if maxx<cnt:
                maxx=cnt

        
    for i in range(n):
        cnt=1
        for j in range(n-1):
            #한 열이 모두 같을때
            if a[j][i]==a[j+1][i]:
                cnt+=1
            else:
                cnt=1
            if maxx<cnt:
                maxx=cnt
#가로 뒤집기
for i in range(n):
    for j in range(n-1):
        tmp=a[i][j+1]
        a[i][j+1]=a[i][j]
        a[i][j]=tmp
        Search()
        tmp=a[i][j+1]
        a[i][j+1]=a[i][j]
        a[i][j]=tmp
#세로 뒤집기
for i in range(n):
    for j in range(n-1):
        tmp=a[j+1][i]
        a[j+1][i]=a[j][i]
        a[j][i]=tmp
        Search()
        tmp=a[j+1][i]
        a[j+1][i]=a[j][i]
        a[j][i]=tmp
print(maxx)
