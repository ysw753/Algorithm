package Backjoon_11727_2xnTiling2;

import java.util.Scanner;

public class Main {

	static int arr[] = new int[1001];
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i<=n;i++)
		{
			arr[i]=tiling(i);
		}
		System.out.println(arr[n]);
	}
	private static int tiling(int i) {
		if(i==1)
			return 1;
		if(i==2)
			return 3;
		if(arr[i]!=0)
			return arr[i];
		return (tiling(i-1)+tiling(i-2)*2)%10007;
	}

	
}
