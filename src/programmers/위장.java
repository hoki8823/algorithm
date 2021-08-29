package programmers;
import java.util.HashMap;
import java.util.Map;

public class 위장 {
	public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++) {
        	//같은 종류는 value+1
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        
        
        //answer *= (옷 가지 수 + 안입을경우)
        for(int i : map.values()) {
        	answer *= (i+1);
        }
        
        //모두 안입는 경우는 제외
        return answer-1;
    }
}
