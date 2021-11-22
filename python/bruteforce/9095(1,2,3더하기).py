import sys
sys.stdin=open("input.txt", "r")
n = int(input())
a = [1, 2, 3]
cnt = 0

for i in range(n):
    m = int(input())

    def DFS(sum):
        global cnt
        if m < sum:
            return
        if m == sum:
            cnt += 1
            return
        else:
            for i in range(3):
                DFS(sum+a[i])
    DFS(0)
    print(cnt)
    cnt = 0
