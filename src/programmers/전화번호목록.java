package programmers;
import java.util.HashMap;

public class 전화번호목록 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        //모든 전화번호 해싱
        for(int i=0;i<phone_book.length;i++)
        	hm.put(phone_book[i], i);
        
        //접두어 유무확인
        for(int i=0;i<phone_book.length;i++) {
        	for(int j=1;j<phone_book[i].length();j++) {
        		if(hm.containsKey(phone_book[i].substring(0, j))) {
        			answer = false;
        			break;
        		}
        	}
        }
        return answer;
	}
}

/*
startsWith(문자열) - 특정 문자열로 시작하는지 체크
endsWith(문자열) - 특정 문자열로 끝나는지 체크

hashmap.containsKey(key) - 맵에서 인자로 보낸 키가 있으면 true 없으면 false
hashmap.containsValue(value) - 맵에서 인자로 보낸 값이 있으면 true 없으면 false

*/