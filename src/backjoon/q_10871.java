package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q_10871 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int standard = Integer.parseInt(st.nextToken());

		st= new StringTokenizer(br.readLine());
		for(int i=0;i<count;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num<standard)
				bw.write(num + " ");
		}
		bw.close();
	}

}
