import sys
sys.stdin=open("input.txt", "r")

s=list(input())
bomb=list(input())
stack=[]

for x in s:
    stack.append(x)
    if len(stack)>=len(bomb):
        if stack[-(len(bomb)):]==bomb[-len(bomb):]:
            for i in range(len(bomb)): 
                stack.pop()
if len(stack)>0:
    print(''.join(stack))
else:
    print('FRULA')

