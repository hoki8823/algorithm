package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q_2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>i;j--) {
				bw.write(" ");
			}
			for(int k=0;k<i+1;k++)
				bw.write("*");
			bw.newLine();
		}
		bw.close();
	}

}
