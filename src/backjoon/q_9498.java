package backjoon;

import java.util.Scanner;

public class q_9498 {
	public static String gradePart(int grade) {
		String rs;
		if(90<=grade)
			rs = "A";
		else if(80<=grade)
			rs = "B";
		else if(70<=grade)
			rs = "C";
		else if(60<=grade)
			rs = "D";
		else
			rs = "F";
		return rs;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade = sc.nextInt();
		System.out.println(gradePart(grade));
	}
}
