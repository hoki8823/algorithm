package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
	public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();
        for(int i : prices) {
        	que.offer(i);
        }
     
        while(!que.isEmpty()) {
        	int time = 0;
        	int a = que.poll();        
        	
        	for(int b : que) {
        		if(a>b) {
        			time++;
        			break;
        		}else if(a<=b){
        			time++;
        		}
        	}
			result.offer(time);
        }
        
    	int i = 0;
        for(int c : result) {
        	answer[i] = c;
        	System.out.println(answer[i]);
        	i++;
        }
        return answer;
    }
	
	
	public int[] solution1(int[] prices) {
		int len = prices.length;
        int[] answer = new int[len];
        int i, j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                answer[i]++;
                if (prices[i] > prices[j])
                    break;
            }
        }
        return answer;
    }
}
