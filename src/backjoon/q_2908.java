package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_2908 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		a = ((a%10)*100) + (((a/10)%10)*10) + (a/100);
		b = ((b%10)*100) + (((b/10)%10)*10) + (b/100);
		
		System.out.println(a>b?a:b);
		
		//다양한 솔루션
		//1.stringbuffer의 reverse() 메서드 이용
		//2.Math.max이용
	}
}