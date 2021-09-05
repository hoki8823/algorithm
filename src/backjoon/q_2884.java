package backjoon;

import java.util.Scanner;

public class q_2884 {

	public static String alarm(int h,int m) {
		int a = h;
		int b = m-45;
		
		if(b < 0) {
			a--;
			if(a < 0)
				a = 23;
			b = 60 + b;
		}
		
		return a + " " + b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(alarm(h,m));
	}
}
