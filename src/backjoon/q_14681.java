package backjoon;

import java.util.Scanner;

public class q_14681 {

	public static int num(int a,int b) {
		if(a>0) {
			if(b>0)
				return 1;
			else
				return 4;
		}
		else {
			if(b>0)
				return 2;
			else
				return 3;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(num(a,b));
	}

}
