package Baekjoon_1758_kangho;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int peopleNum= Integer.parseInt(br.readLine());
		int tipArr[]= new int[peopleNum];
		
		for(int i = 0; i<peopleNum;i++)
		{
			tipArr[i]= Integer.parseInt(br.readLine());
		}
		Arrays.sort(tipArr);
		
		int score=1;
		long tip=0;
		for(int i = peopleNum-1; i>=0;i--)
		{
			if((tipArr[i]-(score-1))>=0) 
			{
				tip+=tipArr[i]-(score-1);
			}
			score++;
		}
		System.out.print(tip);
	}

}
