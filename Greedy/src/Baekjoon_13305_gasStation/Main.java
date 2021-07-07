package Baekjoon_13305_gasStation;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		long sum= 0;
		long []oilPrice = new long[N];
		
		long []loadLength=new long[N-1];
		
		for(int i = 0; i<N-1;i++)
		{
			loadLength[i]=scan.nextLong();
		}
		for(int i = 0; i<N;i++)
		{
			oilPrice[i] =scan.nextLong();
		
		}
		long min=oilPrice[0];
		for(int i =0; i<N-1;i++) {
			if(oilPrice[i]<min) {
				min=oilPrice[i];
			}
			sum+=(loadLength[i]*min);
			
		}
	System.out.println(sum);
		
	}

}

