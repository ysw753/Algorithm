import sys
sys.stdin=open("input.txt", "r")

l,c = map(int,input().split())
a=list(map(str,input().split()))
a.sort()
res=set()
tmp=[0]*l
def DFS(L,s):
  if L==l:
    strtmp=''
    for i in range(l):
      strtmp+=tmp[i]
      strtmp=''.join(sorted(strtmp))
    res.add(strtmp)
  else:
    for i in range(s,c):
      tmp[L]=a[i]
      DFS(L+1,i+1)

DFS(0,0)
res=list(res)
res.sort()

for x in res:
  c=0
  v=0
  for i in x:
    if i in 'aeiou':
      c+=1
    else:
      v+=1
  if c>=1 and v>=2:
    print(x)