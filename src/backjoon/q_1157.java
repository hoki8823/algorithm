package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] word = new int[26];
		//1.toUpperCase(),toLowerCase() 메서드 확인
		String ex = br.readLine().toUpperCase();
		int max=0;
		char result='?';
		for(int i=0;i<ex.length();i++) {
			word[ex.charAt(i)-65]++;
			if(max<word[ex.charAt(i)-65]) {
				result=ex.charAt(i);
				max=word[ex.charAt(i)-65];
			}else if(max==word[ex.charAt(i)-65]) {
				result='?';
			}
		}
		System.out.println(result);
	}

}
