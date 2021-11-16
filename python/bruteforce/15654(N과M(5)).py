import sys
sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
a=list(map(int,input().split()))
a.sort()
ans=[0]*n
ch=[0]*n
def DFS(L):
    if L==m:
        for i in range(m):
            print(ans[i],end=' ')
        print()
    else:
        for i in range(n):
            if ch[i]==0:
                ch[i]=1
                ans[L]=a[i]
                DFS(L+1)
                ch[i]=0

DFS(0)