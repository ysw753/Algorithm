package Backjoon_1946_newRecruits;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static class Person{
		int document=0;
		int interview=0;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int caseNum = scan.nextInt();
		while(caseNum-->0) {
			int personNum= scan.nextInt();
			int countArr[]=new int[personNum];
			Person person[] = new Person[personNum+1];
			
			for(int i =0; i<personNum ; i++)
			{
				int documentN= scan.nextInt();
				person[documentN]=new Person();
				person[documentN].document=documentN;
				person[documentN].interview=scan.nextInt();
			}
			int count =1;
			int temp = person[1].interview;
			for(int i=2; i<=personNum ;i++) {
				if(temp>=person[i].interview) {
						temp=person[i].interview;
						count++;
					}
				
				
			}
		
			System.out.println(count);
			
		}
	}

}
