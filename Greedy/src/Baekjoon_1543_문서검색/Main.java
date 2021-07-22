package Baekjoon_1543_문서검색;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String str2= scan.nextLine();
		int cnt=0;
		for(int i=0;i<str.length()-str2.length()+1;i++)
		{
			if(str.substring(i,str2.length()+i).equals(str2)) {
				cnt++;
				i+=str2.length()-1;
			}
		}
		System.out.println(cnt);
	}

}
