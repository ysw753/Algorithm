package Backjoon_10845_queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static int queue[]=new int[10001];
	static int front=-1;
	static int back=-1;
	static int size;
	
	static void push(int x) {
		if(back==-1) {
			queue[++back]=x;
			front++;
		}else {
			queue[++back]=x;
		}
	}
	static int pop() {
		if(back==-1)
			return -1;
		else if(front==back&&front!=-1) {
			int num = queue[back];
			front=-1;
			back=-1;
			return num;
		}
		else {
			return queue[front++];		
		}
	}
	static int size(){
		if(back==-1)
			return 0;
		else
			return (back-front+1);
		
	}
	static int empty() {
		if(back==-1)
			return 1;
		return 0;
	}
	static int front() {
		if(back==-1)
			return -1;
		return queue[front];
	}
	static int back() {
		if(back==-1)
			return -1;
		return queue[back];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer= new BufferedWriter(new OutputStreamWriter(System.out));
		size = Integer.parseInt(reader.readLine());
		while(size>0)
		{
			String command = reader.readLine();
			
			if(command.contains("push"))
			{	
				String str[] = command.split(" ");
				push(Integer.parseInt(str[1]));
			}
			else if(command.contains("pop"))
			{
				writer.write(String.valueOf(pop())+"\n");
			}
			else if(command.contains("size"))
			{
				writer.write(String.valueOf(size())+"\n");	
			}
			else if(command.contains("empty"))
			{
				writer.write(String.valueOf(empty())+"\n");			
			}
			else if(command.contains("front"))
			{
				writer.write(String.valueOf(front())+"\n");			
			}
			else if(command.contains("back"))
			{
				writer.write(String.valueOf(back())+"\n");
			}	
			size--;
		}
		
		writer.flush();
		writer.close();
		reader.close();
		
	}

}
