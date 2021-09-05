package programmers;

import java.util.PriorityQueue;

public class ���ʰ� {
	public int solution(int[] scoville, int K) {
        int answer = 0;

        //�켱���� ť
        //�������� PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> que = new PriorityQueue<>();
 
        for(int i : scoville) {
        	que.offer(i);
        }
        
        while(que.size() > 1 && que.peek() < K) { 
        	int a = que.poll();
        	int b = que.poll();
        	que.offer(a+(b*2));
        	answer++;
        }
        
        //�̰� ���� ������. �����
        return que.peek() >= K ? answer : -1;
    }
}
