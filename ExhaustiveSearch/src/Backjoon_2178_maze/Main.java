package Backjoon_2178_maze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class XY{
	int x; 
	int y;
	XY(int x, int y){
		this.x=x;
		this.y=y;
	}
}
public class Main {
	static int N,M;
	static int cnt =1;
	static boolean visited[][];
	static int arr[][];
	static int []dx= {0,0,-1,1};
	static int []dy= {1,-1,0,0};
	
	
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		 visited= new boolean[N+2][M+2];
		 arr= new int[N+2][M+2];
		
		
		for(int i =0; i<N;i++) {
			String row= br.readLine();
			for(int j=0; j<M;j++)
				arr[i+1][j+1]=row.charAt(j)-'0';
				
		}
		bfs(1,1);
		System.out.println(arr[N][M]);
		
	}
	static void bfs(int n,int m) {
		Queue<XY> q = new LinkedList<>();
		visited[n][m]=true;
		q.offer(new XY(n,m));
		
		while(!q.isEmpty()) {
			int x = q.peek().x;
			int y = q.peek().y;
			XY xy=q.poll();
			
			for(int i=0;i<4;i++)
			{
				//╩С,го,аб,©Л
				int nx = xy.x+dx[i];
				int ny= xy.y+dy[i];
				
				if(arr[nx][ny]==1 && !visited[nx][ny]) {
					visited[nx][ny]=true;
					q.offer(new XY(nx,ny));
					arr[nx][ny]=arr[xy.x][xy.y]+1;
				}
	
			}
			
		}
	}
}




























