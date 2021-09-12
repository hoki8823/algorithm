package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		double[] rs = new double[count];
		double max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());;
		for(int i=0;i<count;i++) {
			rs[i]=Integer.parseInt(st.nextToken());
			max = rs[i]>max?rs[i]:max;
		}
		double sum = 0;
		for(int i=0;i<count;i++) {
			sum += rs[i]/max*100;
		}
		System.out.println(sum/count);

	}

}
