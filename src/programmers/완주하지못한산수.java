package programmers;
import java.util.HashMap;

public class �����������ѻ�� {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // HashMap<key ,value>
        HashMap<String, Integer> hm = new HashMap<>();
        
        //�������� ó��
        for (String player : participant) 
            hm.put(player, hm.getOrDefault(player,0) + 1);
        
        //�����ѻ�� value�� 0ó��
        for (String player : completion) 
            hm.put(player, hm.get(player) - 1);
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}
