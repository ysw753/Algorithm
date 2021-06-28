package Dfs;

import java.util.LinkedList;

public class Main {


	static boolean visited[]=new boolean[9];
	static LinkedList<LinkedList<Integer>> graph = new LinkedList<LinkedList<Integer>>();
	
	static void dfs(int node) {
		visited[node]=true;
		System.out.print(node + " ");
		for(int i=0; i<graph.get(node).size();i++) {
			if(!(visited[graph.get(node).get(i)]))
				dfs(graph.get(node).get(i));
		}
	}
	
	public static void main(String[] args) {

		for(int i =0;i<9;i++) {
			graph.add(new LinkedList<Integer>());
		}
		
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		
		graph.get(2).add(1);
		graph.get(2).add(7);
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);
		
		graph.get(4).add(3);
		graph.get(4).add(5);
		
		graph.get(5).add(3);
		graph.get(5).add(4);
		
		graph.get(6).add(7);
		
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);
		
		graph.get(8).add(1);
		graph.get(8).add(7);
		
		dfs(1);
	}

}
