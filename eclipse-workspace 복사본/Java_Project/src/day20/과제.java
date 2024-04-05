package day20;

import java.util.ArrayList;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		// 스트림으로 출력
		/* 여행사 상품
		 * 여행비용은 15세 이상 100만원, 15세 미만 50만원
		 * 고객 3명이 패키지여행을 떠난다고 했을 경우
		 * 1.비용계산 2. 고객명단 검색
		 * 고객 클래스를 생성하고 ArrayList로 고객관리
		 * 
		 * 예시 > 고객정보 -> 고객명단
		 * 이름 : 이순신 나이: 40 비용:100
		 * 아름 : 신사임당 나이:35 , 비용:100
		 * 이름 : 홍길동 나이 : 10 비용 50
		 * 총 여행 경비 250
		 * 
		 * 20대 이상 고객명단 => 이름순으로 정렬
		 * 이름 : 신사임당,나이:35,비용:100
		 * 이름: 이순신 , 나이:40 , 비용 : 100
		 * 
		 * 
		 * */
		
		ArrayList <Customer> list = new ArrayList<>();
		
		list.add(new Customer("이순신",40,100));
		list.add(new Customer("신사임당",35,100));
		list.add(new Customer("홍길동",10,50));
		
		
		System.out.println("---고객 정보---");
		list.stream().forEach(n -> System.out.println(n));
		
		int sum = list.stream().mapToInt(n -> n.getM()).sum();
		
		System.out.println("총 여행경비 : " + sum);
		
		
		System.out.println("---20세 이상 고객 정보---");
		list.stream().filter(n -> n.getAge()>=20)
		.sorted(new Comparator<Customer> () {
			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		}).
		forEach(n -> System.out.println(n));
		

	}

}
