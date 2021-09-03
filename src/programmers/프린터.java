package programmers;

import java.util.*;

/*
 * Queue<Object> queue = new LinkedList<>();
 * 
 * �� �߰�
 * queue.add(); ť�� ������ �����߻�
 * queue.offer(); ť�� ������ false ����
 * 
 * �� ����
 * queue.poll(); ù��°�� ����
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

public class ������ {
	 public int solution(int[] priorities, int location) {
			/*
			 * int answer = 0; Queue<Printer> q = new LinkedList<>();
			 * 
			 * for(int i=0;i<priorities.length;i++) { q.offer(new Printer(i,priorities[i]));
			 * }
			 * 
			 * while(!q.isEmpty()) { boolean flag = false; //peek(); ù��°�� ���� int com =
			 * q.peek().prior; for(Printer p : q) { if(com < p.prior) { flag = true; } }
			 * if(flag) { q.offer(q.poll()); }else { //���� ���ڰ� �� Ŭ ��� if(q.poll().location ==
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
