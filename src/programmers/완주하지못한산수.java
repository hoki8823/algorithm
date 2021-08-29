package programmers;
import java.util.HashMap;

public class 완주하지못한산수 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // HashMap<key ,value>
        HashMap<String, Integer> hm = new HashMap<>();
        
        //동명이인 처리
        for (String player : participant) 
            hm.put(player, hm.getOrDefault(player,0) + 1);
        
        //완주한사람 value값 0처리
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
