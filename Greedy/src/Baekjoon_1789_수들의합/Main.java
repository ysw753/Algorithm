package Baekjoon_1789_수들의합;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long S = scan.nextLong();
		long i =1;
		while(i<=S)
		{
			S=S-i;
			i++;
			
		}
		if(i==S)
			System.out.println(i);
		else
			System.out.println(i-1);
		
	}

}
