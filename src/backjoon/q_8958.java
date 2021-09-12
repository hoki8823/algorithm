package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] arr = new String[count];
		
		for(int i=0;i<count;i++)
			arr[i]=br.readLine();
		
		int sum;
		int plus;
		for(int i=0;i<count;i++) {
			sum = 0;
			plus = 0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O')
					plus++;
				else
					plus = 0;
				sum += plus;
			}
			System.out.println(sum);
		}
		
	}

}
