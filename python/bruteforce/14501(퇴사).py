import sys
sys.stdin=open("input.txt", "r")

n=int(input())
tarr=[]
parr=[]

for i in range(n):
  t,p = map(int,input().split())
  tarr.append(t)
  parr.append(p)
tarr.insert(0,0)
parr.insert(0,0)
maxx=-2147000000
def DFS(L,sum):
  global maxx
  if L==n+1:
    if maxx<sum:
      maxx=sum
  else:
    if L+tarr[L]<=n+1:
      DFS(L+tarr[L],sum+parr[L])
    DFS(L+1,sum)
DFS(1,0)
print(maxx)