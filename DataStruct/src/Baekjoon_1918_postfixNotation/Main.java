package Baekjoon_1918_postfixNotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		
		String str = br.readLine();
		
		
		for(int i = 0 ;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				System.out.print(str.charAt(i));
			}
			else if(str.charAt(i)==')')
			{
				while(stack.peek()!='(')
				{
					System.out.print(stack.pop());
				}
				stack.pop();
			}
			else if(str.charAt(i)=='(')
			{
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)=='+'||str.charAt(i)=='-')
			{
				while(!stack.isEmpty()&&(stack.peek()=='*'||stack.peek()=='/'||stack.peek()=='+'||stack.peek()=='-'))
				{
					System.out.print(stack.pop());
				}
					
				stack.push(str.charAt(i));
			}
			else if(str.charAt(i)=='*'||str.charAt(i)=='/')
			{
				while(!stack.empty()&&(stack.peek()=='*'||stack.peek()=='/')) 
				{
					System.out.print(stack.pop());
				}
				stack.push(str.charAt(i));
				
			}
		}
		while(!stack.empty()) {
			System.out.print(stack.pop());
		}
		
	}

}
