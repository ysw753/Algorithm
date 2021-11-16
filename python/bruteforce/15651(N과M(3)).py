import sys
sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())

ans=[0]*n
def DFS(L):
    if L==m:
        for i in range(m):
            print(ans[i],end=' ')
        print()
    else:
        for i in range(n):
            ans[L]=i+1
            DFS(L+1)
DFS(0)