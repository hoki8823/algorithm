package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		
		for(int i='a';i<='z';i++) {
			int b=-1;
			for(int j=0;j<word.length();j++) {
				if(i==word.charAt(j)) {
					b=j;
					break;
				}
			}
			System.out.print(b+" ");
		}
	}

}
