package javaPractice;

import java.lang.reflect.Method;

public class prac10_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prac10_useAnnotation hello = new prac10_useAnnotation();
		
		//getClass : �ش� �ν��Ͻ��� ���� �� ����� Ŭ������ ������ ����
		//getDeclaredMethods : ���ڿ� ���� �޼ҵ��� ������ ������
		try {
			Method method = hello.getClass().getDeclaredMethod("hello");
			
			//�� method�� prac10_annotation�� �����ϰ� �ִ°�
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
