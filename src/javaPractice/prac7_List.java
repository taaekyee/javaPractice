package javaPractice;

import java.util.*;
public class prac7_List {

	public static void main(String[] args) {
		List<String> al = new ArrayList(); //조회가 빠름, 추가/삭제/수정이 느림
		List<String> ll = new LinkedList(); //조회가 느림, 추가/삭제/수정이 빠름
		
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al.size());
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		System.out.println(ll.size()+"\n");
		
		
		for(int i = 0; i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		for(int i = 0; i<ll.size();i++){
			System.out.println(ll.get(i));
		}
	}
}
