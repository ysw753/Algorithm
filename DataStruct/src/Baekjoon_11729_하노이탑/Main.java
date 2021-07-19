package Baekjoon_11729_하노이탑;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int to, from, tmp;
		
		int cnt = 1;
		for(int i =0 ;i<N;i++)
		{
			cnt*=2;
		}
		bw.write((int)(cnt-1)+"\n");
		hanoitop(N,1,2,3);
		
		bw.flush();
		bw.close();
		
	}

	private static void hanoitop(int n, int from, int tmp, int to) throws IOException {
		if(n==1)
			bw.write(from + " " + to + "\n");
		else {
			hanoitop(n-1,from,to,tmp);
			bw.write(from + " " + to + "\n");
			hanoitop(n-1,tmp,from,to);
		}
			
				
		
	}

}
