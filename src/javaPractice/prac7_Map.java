package javaPractice;

import java.util.*;
public class prac7_Map {

	public static void main(String[] args) {
		//key�� Value�� ������ ����, key�� �ߺ� �Ұ�
		Map<String, String> m = new HashMap<>();
		
		m.put("001", "a");
		m.put("002", "a");
		m.put("003", "a");
		m.put("001", "b");
		System.out.println(m.size());
		
		//key�� �ߺ��� �ȴٸ� ���
		System.out.println(m.get("001"));
		
		//key���� set�� ����
		Set<String> key = m.keySet();
		
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()){
			String k = it.next();
			System.out.println(k+" "+m.get(k));
		}
		
	}
}
