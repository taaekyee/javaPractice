package javaPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class prac8_Date {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(df.format(date));
		System.out.println(date.getTime());
		
		//현재 시간을 long값으로
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today-date.getTime());
	}
}
