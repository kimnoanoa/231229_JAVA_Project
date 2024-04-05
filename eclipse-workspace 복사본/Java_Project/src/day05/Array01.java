package day05;

public class Array01 {

	public static void main(String[] args) {
		// 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합
		/* 객체를 생성하는 키워드 => new
		 * 
		 * - 배열 선언하는 방법
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * 
		 * - 선언하고 생성(초기화)하는 방법 : 객체는 생성하면 자동초기화 됨.
		 * 타입[]배열이름 = new 타입 [길이]; //가장 많이 사용하는 방식
		 * 타입[]배열이름 = new 타입 [] {값,값,값,값}
		 * 
		 * 연습할 때 주로 사용하는 형태
		 * 타입[]배열이름 = {값,값,값,값}
		 * 
		 * - 배열의 길이는 0이상이어야 한다.
		 * - 배열의 시작 번지 (index) 는 0부터 시작
		 * 배열 [5] => 0,1,2,3,4
		 * - 배열의 길이 length(총길이) 를 이용하면 배열의 길이를 알 수 있다.
		 * 
		 * */
		
		int arr1 [];
		arr1 = new int[5]; //초기화 한 경우 (객체를 생성한 경우)
		
		int arr2[] = new int[5]; // 일반적으로 가장 많이 사용하는 경우
		
		int arr3[] = new int[] {1,2,3,4,5};
		
		int arr4[] = { 1,2,3,4,5,6,7}; // 연습용
		
		
		/*배열을 사용하는 이유
		 * -관리가 편함.
		 * -반복문을 사용할 수 있기 때문에 많은 양의 데이터를 쉽게 관리하고 사용할 수 있음
		 * 배열의 길이는 배열이름.length
		 * 배열의 index는 0부터 시작
		 * 길이가 5라면 0 1 2 3 4 
		 * 마지막 번지는 항상 길이 - 1 로 설정이 됨
		 * 
		 * */
		
		// 배열의 값을 출력
		System.out.println(arr1);
		System.out.println(arr2[0]);
		
		System.out.println("----------------------");
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		System.out.println("-----------------------");
		
		for (int i = 0; i < arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("------------------------");
		
		for (int i =0; i < arr4.length ; i++) {
			System.out.println(arr4[i]);
		}
		
		System.out.println("------------------------");
		
		
		arr3[0] = 10;
		System.out.println(arr3[0]);
		arr3[1]=20;
		
		for (int i = 0; i < arr3.length ; i++) {
			System.out.println(arr3[i]);
			
		
		}
		System.out.println("---------------------");
		
		arr1[0] =5;
		arr1[1] = 6;
		arr1[2] = 7;
		arr1[3] = 8;
		arr1[4] = 9;
		
		for (int i = 0; i < arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("---------------------");
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i+10;
			System.out.println(arr2[i]);
			}
		
		/* arr5 배열을 생성후 1~5까지의 값을 저장하고 출력
		 * 
		 * */
		
		System.out.println("---------------------");
		
		int arr5[] = {1,2,3,4,5};
		
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i+1;
			System.out.println(arr5[i]);
					
		}
			
	}

}
