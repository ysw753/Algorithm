package Backjoon_1699_sumOfSquares;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int dp[] = new int[n+1];
		for(int i =0; i<=n;i++)
		{
			dp[i]=i;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j*j<=i;j++) {
				dp[i]=Math.min(dp[i],dp[i-j*j]+1);
			}
		}
		System.out.println(dp[n]);
	}
}
