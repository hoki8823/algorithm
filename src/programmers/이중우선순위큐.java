package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 이중우선순위큐 {
    public static int[] solution(String[] operations) {
        int[] answer = new int[2];  
        PriorityQueue<Integer> que1 = new PriorityQueue<>();
        PriorityQueue<Integer> que2 = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st;
        for(String i:operations) {
        	st = new StringTokenizer(i);
        	String symbol = st.nextToken();
        	int value = Integer.parseInt(st.nextToken());
        	if(symbol.equals("I")) {
        		que1.offer(value);
        		que2.offer(value);
        		continue;
        	}
        	if(symbol.equals("D")) {
        		if(que1.size()<1) {
        			continue;
        		}else if(value==-1) {
        			int min=que1.poll();
        			que2.remove(min);
        		}else if(value==1) {
        			int max=que2.poll();
        			que1.remove(max);
        		}
        		continue;
        	}
        }
        if(que1.size()>0) {
	        answer[0]=que2.peek();
	        answer[1]=que1.peek();
        }
        return answer;
    }
    public static void main(String[] args) {
		String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
		System.out.println(Arrays.toString(solution(operations)));
	}
}
