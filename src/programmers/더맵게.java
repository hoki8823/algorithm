package programmers;

import java.util.PriorityQueue;

public class 더맵게 {
	public int solution(int[] scoville, int K) {
        int answer = 0;

        //우선순위 큐
        //내림차순 PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
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
        
        //이거 뭔가 간지남. 써먹자
        return que.peek() >= K ? answer : -1;
    }
}
