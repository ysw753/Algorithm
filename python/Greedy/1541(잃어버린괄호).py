import sys
s=input()
a=s.split('-')
arr=[]
num=0
for x in a:
    b=x.split('+')
    tmp=0
    for y in b:
        tmp+=int(y)
    arr.append(tmp)
num+=arr[0]
for i in range(1,len(a)):
    num+=-(arr[i])
print(num)
