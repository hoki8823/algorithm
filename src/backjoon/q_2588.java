package backjoon;

import java.util.Scanner;

public class q_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();

		int[] bP = {b%10,(b%100)/10,b/100};

	
		for(int i : bP) {
			System.out.println(a*i);
		}
		System.out.println(a*b);
	}
}
