package javaPractice;

public class prac3_StringBuffer {
	public static void main(String[] args) {
		
		//������ ������ String, (Method Chaining: �ڱ��ڽ��� �����Ͽ� ����ؼ� �ڽ��� �޼ҵ带 ȣ���ϴ� ���)
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello");
		
		//sb2�� append�ϰ� �ڱ� �ڽ��� sb3�� ����
		if(sb2==sb3) System.out.println("sb2==sb3");
		
		String st2 = new StringBuffer().append("hello world").toString();
		//                                ������ StringBuffer/
		System.out.println(st2);
	}
}
