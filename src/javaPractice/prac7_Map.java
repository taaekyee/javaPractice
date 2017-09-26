package javaPractice;

import java.util.*;
public class prac7_Map {

	public static void main(String[] args) {
		//key와 Value를 쌍으로 저장, key는 중복 불가
		Map<String, String> m = new HashMap<>();
		
		m.put("001", "a");
		m.put("002", "a");
		m.put("003", "a");
		m.put("001", "b");
		System.out.println(m.size());
		
		//key가 중복이 된다면 덮어씀
		System.out.println(m.get("001"));
		
		//key값을 set에 저장
		Set<String> key = m.keySet();
		
		Iterator<String> it = key.iterator();
		
		while(it.hasNext()){
			String k = it.next();
			System.out.println(k+" "+m.get(k));
		}
		
	}
}
