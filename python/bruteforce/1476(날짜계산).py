import sys
sys.stdin=open("input.txt", "r")
e,s,m = map(int,input().split())

ea=1
sa=1
ma=1
cnt=1
while True:
    if ea==e and sa==s and ma==m:
        break
    cnt+=1
    ea+=1
    sa+=1
    ma+=1
    if ea==16:
        ea=1
    if sa==29:
        sa=1
    if ma==20:
        ma=1
    
    
    
print(cnt)


