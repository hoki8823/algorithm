package programmers;
import java.util.HashMap;

public class ��ȭ��ȣ��� {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        //��� ��ȭ��ȣ �ؽ�
        for(int i=0;i<phone_book.length;i++)
        	hm.put(phone_book[i], i);
        
        //���ξ� ����Ȯ��
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
startsWith(���ڿ�) - Ư�� ���ڿ��� �����ϴ��� üũ
endsWith(���ڿ�) - Ư�� ���ڿ��� �������� üũ

hashmap.containsKey(key) - �ʿ��� ���ڷ� ���� Ű�� ������ true ������ false
hashmap.containsValue(value) - �ʿ��� ���ڷ� ���� ���� ������ true ������ false

*/