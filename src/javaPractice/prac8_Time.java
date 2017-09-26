package javaPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class prac8_Time {

	public static void main(String[] args) {
		//����ð�
		LocalDateTime timepoint = LocalDateTime.now();
		System.out.println(timepoint);
		
		//Ư�� ��¥
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		System.out.println(ld1);
		
		//Ư�� �ð�
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timepoint.toLocalDate();
		System.out.println(theDate);
		System.out.println(timepoint.getMonth()); //.getValue(): �Ʒ��� ������ ���
		System.out.println(timepoint.getMonthValue());
	}
}
