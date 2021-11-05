import sys
sys.stdin=open("input.txt", "r")

while True:
    s = sys.stdin.readline()
    up,lo,num,space=0,0,0,0
    if not s:
        break
    for x in s:
        if x.isupper():
            up+=1
        elif x.islower():
            lo+=1
        elif x.isdecimal():
            num+=1
        elif x==' ':
            space+=1
    print(lo,up,num,space, end=" ")
    print()
