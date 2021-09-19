package programmers;

import java.util.*;

public class ��ɰ��� {
	public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day=-1;
        for(int i=0;i<progresses.length;i++) {
        	while(progresses[i] + (speeds[i] * day) < 100) {
        		day++;
        	}
        	dayOfend[day]++;
        }
        
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }
}
