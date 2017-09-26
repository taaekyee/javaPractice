package javaPractice;

public class prac6_BoxExam {
	
	public static void main(String[] args) {

		//Object 타입을 사용
//		prac6_Generic box = new prac6_Generic();
//		
//		box.setObj(new Object()); //넣고
//		Object obj = box.getObj();	//가져오고
//		
//		box.setObj("hello");
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int i = (int)box.getObj();
//		System.out.println(i);
		
		//Generic 사용
		prac6_Generic<Object> box = new prac6_Generic<>(); //사용할 타입으로 객체 생성
		box.setObj(new Object());
		Object obj = box.getObj();
		
		prac6_Generic<String> box2 = new prac6_Generic<>();
		box2.setObj("hello");
		String str = box2.getObj();
		
		prac6_Generic<Integer> box3 = new prac6_Generic<>();
		box3.setObj(1);
		int i = box3.getObj();
		
	}
}
