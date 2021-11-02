import sys
import heapq

n=int(input())
h=[]
for _ in range(n):
    heapq.heappush(h,int(input()))
total=0
while h:
    if len(h)==1:
        break
    tmp=heapq.heappop(h)
    tmp+=heapq.heappop(h)
    heapq.heappush(h,tmp)
    total+=tmp
print(total)
