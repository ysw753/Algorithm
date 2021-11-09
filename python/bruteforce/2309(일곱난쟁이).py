import sys
sys.stdin=open("input.txt", "r")
a=[]
for x in range(9):
    a.append(int(input()))
tmp1=0
tmp2=0
for i in range(9):
    for j in range(i+1,9):
        if 100==sum(a)-(a[i]+a[j]):
            tmp1=a[i]
            tmp2=a[j]
a.remove(tmp1)
a.remove(tmp2)
a.sort()
for x in a:
    print(x)