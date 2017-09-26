package javaPractice;

import java.util.*;
public class prac7_Set {
	
	public static void main(String[] args) {
		
		//set은 interface 이다
		Set<String> s1 = new HashSet<>();
		
		//set내에 같은 값이 있다면 false 반환
		System.out.println(s1.add("a"));
		System.out.println(s1.add("b"));
		System.out.println(s1.add("a"));
		
		System.out.println(s1.size());
		
		//데이터를 가져올 때는 iterator를 사용
		Iterator<String> it = s1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
