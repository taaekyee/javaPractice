package javaPractice;

public class prac3_StringBuffer {
	public static void main(String[] args) {
		
		//변경이 가능한 String, (Method Chaining: 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식)
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		
		//sb2에 append하고 자기 자신을 sb3에 저장
		if(sb2==sb3) System.out.println("sb2==sb3");
		
		String st2 = new StringBuffer().append("hello world").toString();
		//                                요기까지 StringBuffer/
		System.out.println(st2);
	}
}
