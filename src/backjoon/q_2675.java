package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q_2675 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		//1.�׽�Ʈ���̽� �� �Է¹���
		int count = Integer.parseInt(br.readLine());

		//2.���ٿ� �ݺ��� ��,�ܾ ����
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			String word=st.nextToken();
			//3.for�� ���鼭 �Ѵܾ �ݺ��� ����ŭ ���
			for(int j=0;j<word.length();j++) {
				for(int y=0;y<a;y++) 
					bw.write(word.substring(j, j+1));
			}
			bw.newLine();
		}
		bw.close();
	}

}
