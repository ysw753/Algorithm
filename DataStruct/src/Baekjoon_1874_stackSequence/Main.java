package Baekjoon_1874_stackSequence;


import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb= new StringBuilder();
		int num = scan.nextInt();
		
		
		int point=0;
		while(num-->0)
		{
			int input = scan.nextInt();
		
			if(input>point) {
				for(int i=point+1;i<=input;i++){		
					stack.push(i);
					sb.append('+').append('\n');
				}
				point=input;
			}
			else if(stack.peek()!=input) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}

}
