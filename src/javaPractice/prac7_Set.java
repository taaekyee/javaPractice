package javaPractice;

import java.util.*;
public class prac7_Set {
	
	public static void main(String[] args) {
		
		//set�� interface �̴�
		Set<String> s1 = new HashSet<>();
		
		//set���� ���� ���� �ִٸ� false ��ȯ
		System.out.println(s1.add("a"));
		System.out.println(s1.add("b"));
		System.out.println(s1.add("a"));
		
		System.out.println(s1.size());
		
		//�����͸� ������ ���� iterator�� ���
		Iterator<String> it = s1.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
