import sys
sys.stdin=open("input.txt", "r")

n=int(input())
a=list(map(int,input().split()))
ch=[0]*n
tmp=[]
ans=-2147000000
def DFS(L):
  global ans
  if len(tmp)==n:
    sum=0
    for i in range(n-1):
      sum+=abs(tmp[i]-tmp[i+1])
    if ans<sum:
      ans=sum
  else:
    for i in range(n):
      if ch[i]==0:
        ch[i]=1
        tmp.append(a[i])
        DFS(L+1)
        tmp.pop()
        ch[i]=0
DFS(0)
print(ans)