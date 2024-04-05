package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		// Map
		/* - 값을 두 개 쌍으로 저장 key/value
		 * - key 중복불가, value 중복가능
		 * - HashMap 을 가장 많이 사용
		 * 
		 * HashMap<클래스,클래스> map = new HashMap<클래스,클래스>();
		 * map 은 값이 두 개이기 때문에 향상된 for /Iterator 사용불가
		 * map 의 key만을 set으로 구성한 후 출력 가능
		 * 
		 * list, set => add() : 추가
		 * map => put() : 추가
		 * getKey(), getValue() // 추출 가능
		 * 
		 * 
		 * */
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("apple",2000);
		map.put("banana",3000);
		map.put("orange",1000);
		map.put("peach",4000);
		map.put("kiwi",3000);
		
		System.out.println(map);
		System.out.println(map.keySet()); // key만 별도로 set구성
		System.out.println(map.values()); // value 만 구성
		
		//get("key") => value
		System.out.println(map.get("apple")); 
		
		// remove() => key 에 대한 값을 삭제하면서 value를 리턴
		System.out.println(map.remove("apple"));
		
		System.out.println(map);
		System.out.println(map.remove("a")); // null 리턴
		System.out.println(map.remove("banana",3000)); // key, value 둘다주면  true,false 로 리턴
		
		System.out.println(map);
		
		// 향상 for
		for (String key : map.keySet()) { // keySet 만 빼와야함
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("-------------------");
		
		//Iterator
		Iterator<String> it = map.keySet().iterator();
		int sum = 0;
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
			sum += map.get(key);
		}
		
		System.out.println(" 합계 : " + sum);

	}

}
