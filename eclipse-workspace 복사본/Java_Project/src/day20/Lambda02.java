package day20;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		// map 을 구성하여 foreach를 사용하여 출력
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("김노아",100);
		map.put("김진아",90);
		map.put("김치치",85);
		map.put("김소금",65);
		map.put("뚱냥이",70);
		
		
		System.out.println(map);
		System.out.println("---------------");
		
		map.forEach((a,b) -> {
			System.out.println(a + " : " + b);
		});
		
		System.out.println("---------------");
		
		Number sum = (a,b) -> { // 함수 구현
			return a+b;
			};
			
		int hap = sum.add(50,60);
		System.out.println(hap);
		
		
		System.out.println(sum.add(100,200));	
		
		System.out.println("-----------------");
		
		Number max = (a,b) -> (a>=b)? a:b;
		System.out.println(max.add(50,20));

	}

}
//함수형 인터페이스 생성
// 메서드가 1개여야 함.
@FunctionalInterface
interface Number{
	int add(int a,int b);
//	int max(int c,int d); // 메서드 두개면 에러
}

