package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		for(int i=0;i<10;i++)
			num[i] = Integer.parseInt(br.readLine())%42;
		int rs = 0;
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(num[i]==num[j]) {
					rs++;
					break;
				}
			}
		}
		System.out.println(10-rs);
	}

}
