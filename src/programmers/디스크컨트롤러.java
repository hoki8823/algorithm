package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 디스크컨트롤러 {
	public int solution(int[][] jobs) {
        int answer = 0;
        int len = jobs.length;
        int time = 0;
        int idx = 0;
        Queue<int[]> que = new PriorityQueue<>((o1,o2) -> o1[1] - o2[1]);
        
        Arrays.sort(jobs, (o1,o2) -> o1[0] - o2[0]);
        
        while(idx < len || !que.isEmpty()) {
        	while(idx < len && jobs[idx][0] <= time)
        		que.offer(jobs[idx++]);
        	if(que.isEmpty())
        		time = jobs[idx][0];
        	else {
        		int[] job = que.poll();
        		answer += time - job[0] + job[1];
        		time += job[1];
        	}
        }
        return answer/len;
	}
}






/*
 * public int solution(int[][] jobs) { int answer = 0;
 * 
 * Arrays.sort(jobs,(o1,o2) -> { return Integer.compare(o1[1], o2[1]); });
 * 
 * Arrays.sort(jobs,Comparator.comparing(o1 -> o1[1]));
 * 
 * int sum = 0; int a = 0; while(jobs.length >= a) { for(int i=0;i<a;i++) { sum
 * += jobs[i][1]; if(a-1 == i) sum -= jobs[i][0]; } a++; } answer = sum/3;
 * return answer; }
 */