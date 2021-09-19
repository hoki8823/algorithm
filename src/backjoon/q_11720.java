package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;
		for(int i=0;i<count;i++) {
			sum += Integer.parseInt(num.substring(i, i+1));
		}
		
		System.out.println(sum);
	}

}
