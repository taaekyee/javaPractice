package javaPractice;

import java.util.Calendar;

public class prac8_Calendar {

	public static void main(String[] args) {
		//지역화를 고려한 클래스
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0~11월
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //24시
		System.out.println(cal.get(Calendar.HOUR)); //12시
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5);
		System.out.println();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0~11월
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //24시
		System.out.println(cal.get(Calendar.HOUR)); //12시
		System.out.println(cal.get(Calendar.MINUTE));
		
	}
}
