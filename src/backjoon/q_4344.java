package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int a =Integer.parseInt(st.nextToken());
			int[] score = new int[a];
			for(int j=0;j<a;j++)
				score[j]=Integer.parseInt(st.nextToken());
			double sum = 0;
			for(int k : score)
				sum+=k;
			double avg = sum/a;
			int overPlayer = 0;
			for(int h : score) 
				overPlayer = avg<h?overPlayer+1:overPlayer;
			double rs = (double)overPlayer/a*100;
			System.out.println(String.format("%.3f",rs)+"%");
		}

	}

}
