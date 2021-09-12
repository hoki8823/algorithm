package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[3];
		int[] answer = new int[10];
		int rs;
		for(int i=0;i<3;i++)
			num[i] = Integer.parseInt(br.readLine());
		rs = num[0]*num[1]*num[2];

		while(rs!=0) {
			answer[rs%10]++;
			rs=rs/10;
		}
		for(int i=0;i<10;i++)
			System.out.println(answer[i]);
	}

}
