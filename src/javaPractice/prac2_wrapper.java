package javaPractice;

public class prac2_wrapper {
	public static void main(String[] args) {
		
		//기본형 타입 (객체 x, 참조형 x)
		int i = 5;
		//객체, 참조형
		Integer i2 = new Integer(5);
		//오토박싱 : 기본타입 데이터를 객체 타입의 데이터로 자동 형변환
		Integer i3 = 5;

		//오토언박싱 객체타입의 데이터를 기본형 타입 데이터로 자동 형변환
		int i5 = i3;
		
		//예전 버전에서는 객체타입을 벗기고 기본형으로 형변환
		int i4 = i3.intValue();
	
	}
}
