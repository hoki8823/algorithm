package backjoon;

import java.util.Scanner;

public class q_2562 {

	public static void main(String[] args) {
		int[] arr = new int[9];
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int place = 0;
		for(int i=0;i<9;i++) {
			arr[i] = sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
				place=i+1;
			}
		}
		System.out.println(max+"\n"+place);
	}

}
