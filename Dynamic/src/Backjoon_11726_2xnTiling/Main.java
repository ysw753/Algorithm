package Backjoon_11726_2xnTiling;

import java.util.Scanner;

public class Main {
	static int arr[]=new int[1001];
	
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1; i<=n;i++)
		{
			arr[i]=tiling(i);
		}
		System.out.println(arr[n]);
	}
	
	
	public static int tiling(int n){
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(arr[n]!=0)
			return arr[n];
		return tiling(n-1)+tiling(n-2); 
		
	}

}
