package backjoon;

import java.util.Scanner;

public class q_1000 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<2;i++)
			sum += scan.nextInt();
		System.out.println(sum);
	}
}
