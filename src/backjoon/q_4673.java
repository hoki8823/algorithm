package backjoon;

public class q_4673 {

	public static int selfNum(int number) {
		int sum = number;
		
		while(number!=0) {
			sum+=number%10;
			number/=10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		boolean[] rs = new boolean[10001];
		for(int i=1;i<10001;i++) {
			int num=selfNum(i);
			if(num<10001)
				rs[num] = true;
		}
		
		for(int i=1;i<10001;i++) {
			if(!rs[i])
				System.out.println(i);
		}
	}

}
