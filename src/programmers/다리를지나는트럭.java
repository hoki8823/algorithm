package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int totalWeight = 0;
        Queue<Integer> bridgeQue = new LinkedList<>();
        Queue<Integer> readyTruckQue = new LinkedList<>();
        
        for(int i=0;i<bridge_length;i++) {
        	bridgeQue.offer(0);
        }
        
        for(int i : truck_weights) {
        	readyTruckQue.offer(i);
        }
        
        while(!bridgeQue.isEmpty()) {
        	totalWeight -= bridgeQue.peek();
        	bridgeQue.poll();
        	
        	if(readyTruckQue.isEmpty()) {
        		answer += bridge_length;
        		break;
        	}else {
        		if(totalWeight + readyTruckQue.peek() <= weight) {
        			bridgeQue.offer(readyTruckQue.peek());
        			totalWeight += readyTruckQue.peek();
        			readyTruckQue.poll();
        		}else {
        			bridgeQue.offer(0);
        		}
        	}
        	answer++;
        	System.out.println(answer);
        }
        
        return answer;
    }
}
