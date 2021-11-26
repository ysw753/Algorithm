import sys
from typing import Deque
sys.stdin=open("input.txt", "r") 

n,m =map(int,input().split())

board = [list(map(int,input().split())) for _ in range(m)]
dis = [[0]*n for _ in range(m)]
q=Deque()
dx=[1,0,-1,0]
dy=[0,1,0,-1]


for i in range(m):
  for j in range(n):
    if board[i][j]==1:
      q.append((i,j))


while q:
  tmp= q.popleft()
  for i in range(4):
    xx= tmp[0]+dx[i]
    yy= tmp[1]+dy[i]
    if 0<=xx<m and 0<=yy<n and board[xx][yy]==0:
      board[xx][yy]=1
      dis[xx][yy]=dis[tmp[0]][tmp[1]]+1
      q.append((xx,yy))

flag=1
maxx=0
for i in range(m):
  for j in range(n):
    if board[i][j]==0:
      flag=0

if flag==1:
  for i in range(m):
    for j in range(n):
      if maxx<dis[i][j]:
        maxx=dis[i][j]
  print(maxx)
else:
  print(-1)


