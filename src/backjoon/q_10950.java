package backjoon;

import java.util.Scanner;

public class q_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] rs = new int[count];
		for(int i=0;i<count;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			rs[i] = a+b;
		}
		for(int i : rs) 
			System.out.println(i);
	}

}
