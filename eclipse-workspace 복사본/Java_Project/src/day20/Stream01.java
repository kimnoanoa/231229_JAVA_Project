package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		// Stream(스트림)
		/* - 실제 입력 / 출력이 표현된 데이터의 이상화된 흐름
		 * - 스트림은 자료에 대한 스트림을 생성하여 연산
		 * - 그 연산을 다 수행하면 스트림은 소모됨.
		 * - 스트림 연산은 기존 자료에 변경을 유발하지 않음.
		 * - 스트림은 기존 자료를 복사하여 복사본을 연산에 사용함
		 * - 중간연산과 최종연산으로 구분됨.
		 * - 중간연산은 메서드를 이어서 사용할 수 있음.
		 *   - distinct() : 중복제거 , filter() : 조건에 맞는값만 다음스트림으로 넘김
		 *     limit() : 스트림 일부 자르기 , skip() : 스트림 일부를 건너뜀, peek() : 작업수행 , sorted() : 정렬
		 * - 최종연산은 마지막에만 가능.
		 *   - forEach(),count(),sum(),allMatch() : 스트림요소가 전부 일치하는지
		 *     anyMatch() : 하나라도 일치하는지, toArray() : 배열로 전환 , collect(): 스트림
		 * 
		 * */
		
		int [] arr = {1,2,3,4,5,6,7,8};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			
		}
		System.out.println(sum);
		System.out.println("---스트림을 이용한 합계---");
		
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		
		System.out.println("---스트림 count---");
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		System.out.println("---스트림 average()---");
		OptionalDouble avg = Arrays.stream(arr).average();
		
		System.out.println(avg);
		
		//arr값 중 5이상의 값만 합계
		System.out.println("---arr값 중 5이상의 값만 합계---");
		int s5 = Arrays.stream(arr).filter(n -> n>=5).sum();
		System.out.println(s5);
		
		// 점수 배열을 생성한 후 70점 이상만 합계와 평균
		// 가장 높은 점수 출력
		int arr2[] = {60,66,78,82,94,95,100,72,58,43};
		
		int a = Arrays.stream(arr2).filter(n -> n >= 70).sum();
		System.out.println("70점 이상의 합계 : " + a);
		
		OptionalDouble avg2 = Arrays.stream(arr2).filter(n-> n>=70).average();
		System.out.println("70점 이상의 평균 : " + avg2);
		
		OptionalInt b = Arrays.stream(arr2).max();
		System.out.println("가장 높은 점수 : " + b);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(6);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(7);
		
		System.out.println("----list 를 Stream 으로 구성-----");
		list.stream().forEach(n-> System.out.print(n + " "));
		
		System.out.println();
		
		System.out.println("------중복제거(distinct)------");
		list.stream().distinct().forEach(n-> System.out.print(n + " "));
		
		System.out.println();
		
		System.out.println("------정렬(sorted())-----");
		list.stream().distinct().sorted().forEach(n-> System.out.print(n + " ")); //중복제거후 정렬
		
		System.out.println();
		
		
		System.out.println("---스트림 객체 생성----");
		Stream<Integer> s1 = Stream.of(10,20,40,50,60,30,90);
		System.out.println("-----인티저 스트림 합계-----");
		// map : 스트림변환에 사용하는 중간연산
		int s = s1.mapToInt(n-> n.intValue()).sum();
		System.out.println(s);
		s1.forEach(n-> System.out.print(n + " "));

	}

}
