import sys
sys.stdin=open("input.txt", "r")

n,m=map(int,input().split())
a=[list(map(int,input().split())) for _ in range(n)]
ch=[[0]*m for _ in range(n)]
dx=[1,-1,0,0]
dy=[0,0,-1,1]
maxx=-2147000000

exceptShape=[
    [(0,0), (0,1), (0,2), (1,1)], # ㅜ
    [(1,0), (1,1), (1,2), (0,1)], # ㅗ
    [(0,0), (1,0), (2,0), (1,1)], # ㅏ
    [(1,0), (0,1), (1,1), (2,1)], # ㅓ
]
#ㅗ,ㅏ,ㅓ,ㅜ모양판별
def exceptShapef(x,y):
    global maxx
    for i in range(4):
        num=0
        for j in range(4):
            try:
                xx=x+exceptShape[i][j][0]
                yy=y+exceptShape[i][j][1]
                num+=a[xx][yy]                
            except:
                continue
            if maxx<num:
                    maxx=num

def DFS(L,x,y,sum):
    global maxx
    if L==3:
        if maxx<sum:
            maxx=sum
    else:
        for i in range(4):
            xx=x+dx[i]
            yy=y+dy[i]
            if 0<=xx<n and 0<=yy<m and ch[xx][yy]==0:
                ch[xx][yy]=1
                DFS(L+1,xx,yy,sum+a[xx][yy])
                ch[xx][yy]=0 
for i in range(n):
    for j in range(m):
        ch[i][j]=1
        DFS(0,i,j,a[i][j])
        ch[i][j]=0
        exceptShapef(i,j)

print(maxx)



    

