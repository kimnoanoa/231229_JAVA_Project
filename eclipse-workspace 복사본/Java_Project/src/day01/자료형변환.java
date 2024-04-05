package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		// 자료형 변환  : casting
		/* 자료형 ( 변수의 타입)
		 * a = b : a의 자료형과 b의 자료형이 맞지 않는다면 오류
		 * 
		 * 자동 자료형 변환 : 생략해도 문제가 되지 않는 상황
		 * 같은 형의 크기가 큰 자료형 =  크기가 작은 자료형
		 *
		 * 명시적 자료형 변환 : 리터럴 값 앞에 ( 타입)
		 */
		
		byte a =10;
		int num = a; // 자동 자료형 변환케이스
		
		double num1 = 10.1;
		num = (int)num1; // int 쓰면 소수점 날아
		System.out.println(num);
		
		double d = 1/2.0;
		//double d = 1/(double)2;
		System.out.println(d);
		
		

	}

}
