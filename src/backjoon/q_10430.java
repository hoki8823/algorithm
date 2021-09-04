package backjoon;

import java.util.Scanner;

public class q_10430 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int[] rs= {(a+b)%c,((a%c)+(b%c))%c,(a*b)%c,((a%c)*(b%c))%c};
		
		for(int i : rs)
			System.out.println(i);
	}

}
