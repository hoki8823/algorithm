package backjoon;

import java.util.Scanner;

public class q_10869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int[] result= {a+b,a-b,a*b,a/b,a%b};
		
		for(int i : result)
			System.out.println(i);
	}
}
