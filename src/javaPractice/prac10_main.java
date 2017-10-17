package javaPractice;

import java.lang.reflect.Method;

public class prac10_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac10_useAnnotation hello = new prac10_useAnnotation();
		
		//getClass : 해당 인스턴스를 만들 때 사용한 클래스의 정보를 리턴
		//getDeclaredMethods : 인자에 대한 메소드의 정보를 가져옴
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			
			//얻어낸 method가 prac10_annotation를 적용하고 있는가
			if(method.isAnnotationPresent(prac10_annotation.class)){
				for(int i = 0;i<10;i++){
					hello.hello();
				}
			}else{
				hello.hello();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
