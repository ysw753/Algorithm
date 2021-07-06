package BaekJoon_1260_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	
	
	static ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
	static boolean[] visited;
	static int n,m,v;
	static void dfs(int node) {
		visited[node]=true;
		graph.get(node).sort(Comparator.naturalOrder());
		System.out.print(node + " ");
		
		for(int i=0; i<graph.get(node).size();i++) {
			int y = graph.get(node).get(i);
			if(!visited[y])
			{
				dfs(y);
			}
		}
	}
	static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(node);
		visited[node]=true;
		while(!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x+" ");
			for(int i=0; i<graph.get(x).size();i++)
			{
				int y= graph.get(x).get(i);
				if(!visited[y])
				{
					q.offer(y);
					visited[y]=true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());

		
		
		visited=new boolean[n+1];
		for(int i=0;i<n+1;i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i=0;i<m;i++) {
			String edge = br.readLine();
			StringTokenizer st1 = new StringTokenizer(edge," ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());

			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		
		dfs(v);
		System.out.println();
		for(int i =0; i<n+1;i++)
		{
			visited[i]=false;
		}
		bfs(v);
		
		
	}

}
