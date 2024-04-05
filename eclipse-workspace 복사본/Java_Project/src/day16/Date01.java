package day16;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜/ 시간 클래스
		
		/* Date클래스 =>  Deprecated (비권장) /  Calendar 클래스
		 * Calendar : 추상클래스 ( 추상클래스는 객체를 생성할 수 없음.)
		 * 추상클래스를 구현한 객체를 이용하여 사용
		 * new 로 객체생성 불가능.
		 * getinstance() 메서드를 이용해 객체를 얻어옴.
		 * static 메서드. 클래스명.메서드명()
		 * 
		 * */
		
//		Date d = new Date();
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		System.out.println(year);
		// 월 0~11까지
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(week);
		String WeekStr = null;
			switch (week) {
			case 1:
				WeekStr = "일";
				break;
			case 2 :
				WeekStr = "월";
				break;
			case 3 :
				WeekStr = "화";
				break;
			case 4:
				WeekStr = "수";
				break;
			case 5:
				WeekStr = "목";
				break;
			case 6 :
				WeekStr = "금";
				break;
			case 7 :
				WeekStr = "토";
				break;
				default: break;
			
			}
		
		
		System.out.println(year + "-" + month + "-" + day);
		
		//hour , minute, second, am_pm
		
		
		
		int hour = c.get(Calendar.HOUR);
//		System.out.println(hour);
		int minute = c.get(Calendar.MINUTE);
//		System.out.println(minute);
		int second = c.get(Calendar.SECOND);
//		System.out.println(second);
		int ampm = c.get(Calendar.AM_PM);
		
		
		
		System.out.println("--------------------");
		
		System.out.println(year + "-" + month + "-" + day + "(" + WeekStr + ")");
		System.out.println(((ampm == 1) ? "오후" : "오전") + " " + hour + ":" + minute);
		
	}

}
