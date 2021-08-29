package programmers;
import java.util.HashMap;
import java.util.Map;

public class ���� {
	public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++) {
        	//���� ������ value+1
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        
        
        //answer *= (�� ���� �� + ���������)
        for(int i : map.values()) {
        	answer *= (i+1);
        }
        
        //��� ���Դ� ���� ����
        return answer-1;
    }
}
