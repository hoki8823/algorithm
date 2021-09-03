package programmers;

import java.util.*;

/*
 * Queue<Object> queue = new LinkedList<>();
 * 
 * 값 추가
 * queue.add(); 큐가 꽉차면 에러발생
 * queue.offer(); 큐가 꽉차면 false 리턴
 * 
 * 값 삭제
 * queue.poll(); 첫번째값 제거
 * queue.remove(); 
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
			/*
			 * int answer = 0; Queue<Printer> q = new LinkedList<>();
			 * 
			 * for(int i=0;i<priorities.length;i++) { q.offer(new Printer(i,priorities[i]));
			 * }
			 * 
			 * while(!q.isEmpty()) { boolean flag = false; //peek(); 첫번째값 참조 int com =
			 * q.peek().prior; for(Printer p : q) { if(com < p.prior) { flag = true; } }
			 * if(flag) { q.offer(q.poll()); }else { //앞의 숫자가 더 클 경우 if(q.poll().location ==
			 * location) { answer = priorities.length - q.size(); } } } return answer;
			 */
		 
		 int answer = 0;
	        int l = location;

	        Queue<Integer> que = new LinkedList<Integer>();
	        for(int i : priorities){
	            que.add(i);
	        }

	        Arrays.sort(priorities);
	        int size = priorities.length-1;



	        while(!que.isEmpty()){
	            Integer i = que.poll();
	            if(i == priorities[size - answer]){
	                answer++;
	                l--;
	                if(l <0)
	                    break;
	            }else{
	                que.add(i);
	                l--;
	                if(l<0)
	                    l=que.size()-1;
	            }
	        }

	        return answer;
	 }
}
