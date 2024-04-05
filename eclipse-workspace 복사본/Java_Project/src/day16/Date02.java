package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear()); // 얘는 따로따로밖에 안됨.
		
		// 날짜분할2024-01-26 . 시간분할17:03:47
		String t = today.toString(); // 문자로 객체를 변환
		System.out.println(t); // 출력되는 건 위랑 똑같지만 데이터타입자체가 다름
		
//		int a = t.indexOf("T");
//		System.out.println(t.substring(0, a));
		
		String date = t.substring(0,t.indexOf("T"));
		
//		int b = t.lastIndexOf(".");
//		System.out.println(t.substring(a+1, b));
		
		String time = t.substring(t.indexOf("T")+1,t.indexOf("."));
		
		System.out.println(date);
		System.out.println(time);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		
		LocalDateTime sDate = LocalDateTime.of(1999,11,22,10,30);
		System.out.println(sDate.format(dtf));
		
		

	}

}
