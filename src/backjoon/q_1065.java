package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1065 {

	public static int s(int num) {
		int cnt = 0;
		
		if(num<100)
			return num;
		else {
			//100이상부터는 99개 기본시작
			cnt = 99;
			for(int i=100;i<=num;i++) {
				if(num==1000)
					num=999;
				int h=i/100;
				int t=(i/10)%10;
				int o=i%10;
				if((h-t)==(t-o))
					cnt++;
			}
			
		}
		return cnt;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(s(num));
	
	}

}
