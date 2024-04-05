package day16;

import javax.management.RuntimeErrorException;

public class Exception06 {

	public static void main(String[] args) {
		// 메서드에서 생성된 배열 출력
		
		int start = -1, count = 5, size = -1;
		
		
		int arr[] = null;
		
		try {
			a(start,size,count);
			b(arr,start,count);
			 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	
	
	//메서드 생성
	/* 기능 : size 를 매개변수로 입력받아 size 만큼의 길이를 가지는 배열을 생성하여
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위 : 매개변수로 입력 Start(시작값) ,count(개수)
	 * 
	 * - size 가 0보다 작다면 예외
	 * - 카운트 개수가 0보다 작다면 예외
	 * 
	 * 
	 * 
	 * */
	
	public static void a(int start, int count, int size) {
		int arr[] = new int[size];
		if (size <= 0) {
			throw new RuntimeException("배열이 0보다 작습니다.");
		}
		if (count <0) {
			throw new RuntimeException("개수가 0보다 작습니다.");
		}
		for (int i = 0; i < size; i++) {
			arr[i] = (int)(Math.random()*count)+start;
			
		}
	}
	
	
	
	
	// 메서드 생성
	/* 기능 : 매개변수로 배열을 받아 랜덤값을 채우는 메서드
	 * 랜덤값의 범위 : 매개변수로 입력 Start(시작값) ,count(개수)
	 * 
	 * - 배열이 null 이면 예외발생
	 * - 배열의 길이가 0보다 작다면 예외발생
	 * 
	 * */
	
	
	public static void b(int arr[],int start, int count) {
		if(arr == null) {
			throw new RuntimeException("배열 값이 null 입니다.");
		}if(count ==0) {
			throw new RuntimeException("배열의 길이가 0입니다.");
		}
		for (int i = 0; i <arr.length; i++) {
			arr[i] = (int)(Math.random()*count)+start;
		}

}
}
