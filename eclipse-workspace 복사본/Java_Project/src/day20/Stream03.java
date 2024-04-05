package day20;

import java.util.ArrayList;

public class Stream03  {

	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		// add 로 5명 추가
		
		// 스트림을 이용하여 콘솔에 출력 ex) 홍길동 : 98
		
		
		ArrayList <Student> list = new ArrayList<>();
		list.add(new Student("김노아",98));
		list.add(new Student("김진아",81));
		list.add(new Student("김치치",73));
		list.add(new Student("김소금",79));
		list.add(new Student("뚱냥이",83));
		
		list.stream().forEach(n -> System.out.println(n));
		
		list.stream().forEach(n -> System.out.println(n.getName() + " : " + n.getScore()));
		
		
		//점수 합계 / 전체 인원수
		long a = list.stream().count();
		System.out.println("전체 인원수 : " + a);
		
		int sum = list.stream().mapToInt(n-> n.getScore()).sum();
		
		System.out.println("점수합계 : " + sum);
		
		
			
	
		
	}
	
	

}
