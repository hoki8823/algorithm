package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int max = -1000000;
		int min = 1000000;
		for(int i=0;i<count;i++) {
			int num = Integer.parseInt(st.nextToken());
			max = max<num?num:max;
			min = min>num?num:min;
		}
		System.out.println(min+" "+max);
	}

}
