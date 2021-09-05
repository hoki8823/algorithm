package backjoon;

import java.util.Scanner;

public class q_2753 {
	public static int years(int a) {
		if((a%4) == 0 && (a%100) != 0 || (a%400) == 0)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(years(a));
	}
}
