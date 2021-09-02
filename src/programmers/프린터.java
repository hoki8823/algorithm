package programmers;

import java.util.*;

/*
 * Queue<Object> queue = new LinkedList<>();
 * 
 * 값 추가
 * queue.add();
 * queue.offer();
 * 
 * 값 삭제
 * queue.poll(); 
 * queue.remove(); 첫번째값 제거
 */
class Printer {
	int location;
	int prior;
	
	Printer(int location,int prior) {
		this.location = location;
		this.prior = prior;
	}
}

public class 프린터 {
	 public int solution(int[] priorities, int location) {
	        int answer = 0;
	        Queue<Printer> q = new LinkedList<>();
	        
	        for(int i=0;i<priorities.length;i++) {
	        	q.offer(new Printer(i,priorities[i]));
	        }
	        
	        while(!q.isEmpty()) {
	        	boolean flag = false;
	        	//peek(); 첫번째값 참조
	        	int com = q.peek().prior;
	        	for(Printer p : q) {
	        		if(com < p.prior) {
	        			flag = true;
	        		}
	        	}
	        	if(flag) {
	        		q.offer(q.poll());
	        	}else {	//앞의 숫자가 더 클 경우
	        		if(q.poll().location == location) {
	        			answer = priorities.length - q.size();
	        		}
	        	}
	        }
	        return answer;
	 }
}
