package Backjoon_10828_stack;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{

	public static int top=-1;
	public static int stack[];
	public static int size;
	public static void push(int num) {
		if(top==-1)
		{
			stack=new int [size];
			stack[++top]=num;
		}else {
			stack[++top]=num;
		}
		
	}
	public static int pop() {
		if(top==-1) return -1;
		return stack[top--];
	}
	public static int size() {
		return top+1;
	}
	public static int empty() {
		if(top==-1) return 1;
		return 0;
	}
	public static int top() {
		if(top==-1) return -1;
		else return stack[top];
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
			else if(command.contains("top"))
			{
				writer.write(String.valueOf(top())+"\n");
			}	
			size--;
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
