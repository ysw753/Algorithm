import sys
sys.stdin=open("input.txt", "r")

s= input()
arr=[]
for i in range(len(s)):
    arr.append(s[i:])
arr.sort()
for x in arr:
    print(x)