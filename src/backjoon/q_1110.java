package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1110 {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,d,e;
		int sum=0;
		
		int T=Integer.parseInt(br.readLine());
		d=T;
		while(true) {
			if(T<10)		//주어진 값이 10이하면 앞자리 0 추가
				a=0;
			else
				a=T/10;
			
			b=T%10;
			c=a+b;
			
			if(c>=10)		//합한결과가 10이상이면 첫째자리 추출
				c%=10;
			
			e=Integer.parseInt((Integer.toString(b)+Integer.toString(c)));
			
			sum++; 
			
			if(e==d)
				break;

			T=e;
			
		}
		System.out.println(sum);
	}
}
