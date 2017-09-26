package javaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class prac8_Time {

	public static void main(String[] args) {
		//현재시간
		LocalDateTime timepoint = LocalDateTime.now();
		System.out.println(timepoint);
		
		//특정 날짜
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1);
		
		//특정 시간
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timepoint.toLocalDate();
		System.out.println(theDate);
		System.out.println(timepoint.getMonth()); //.getValue(): 아래와 동일한 결과
		System.out.println(timepoint.getMonthValue());
	}
}
