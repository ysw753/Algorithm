import sys
sys.stdin=open("input.txt", "r")
n=int(input())
a=list(map(int,input().split()))

for i in range(n-1,0,-1):
    if a[i-1]<a[i]:
        for j in range(n-1,0,-1):
            if a[i-1]<a[j]:
                a[i-1],a[j]=a[j],a[i-1]
                a=a[:i]+sorted(a[i:])
                print(*a)
                sys.exit(0)
else:
    print(-1)


