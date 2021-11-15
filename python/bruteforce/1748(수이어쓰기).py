import sys
sys.stdin=open("input.txt", "r")

n=input()
ans=0
for i in range(len(n)):
    if i == len(n)-1:
        ans+=(int(n)-(10**i)+1)*len(n)
        break
    ans+=9*(10**i)*(i+1)

print(ans)

