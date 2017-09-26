package javaPractice;

public class prac4_ProblemOfStringClass {
	
	public static void main(String[] args) {
		
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		//위의 문자열 더하기가 내부적으로 어떤 일이 일어날까??
		String str4 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str4);
		
		//반복문에서 반복문 수만큼 StringBuffer객체가 생성
		String str5 = "";
		for(int i=0;i<100;i++){
			str5 = str5 + "*";
		}
		System.out.println(str5);
		
		//반복문 개선
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++){
			sb.append("*");
		}
		System.out.println(sb.toString());
	}
}
