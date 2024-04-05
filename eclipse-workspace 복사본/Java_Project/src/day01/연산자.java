package day01;

public class 연산자 {

	public static void main(String[] args) {
		
		// 대입연산자 : = += -= ...
		// = 을 기준으로 오른쪽에 있는 값을 왼쪽 변수에 저장
		// a = b;
		// 1 = a; ( 왼쪽값이 변수가 아니면 성립불가능)
		// a += 1 -> a = a+1
		
		int a = 10;
		int b = 5;
		a = b;
		System.out.println(a);
		a += 10;
		System.out.println(a);
		
		// 증감 연산자 ++ (1증가) , -- (1감소)
		a++;
		System.out.println(a);
		System.out.println(a++); //출력 후 1증가
		System.out.println(++a); //1증가 후 출력
		
		// 산술 연산자 : + - * / %
		// 나누기(/)
		// 정수 / 정수 = 정수 (10/3 =3)
		// 정수 / 실수 = 실수
		// 실수 / 실수 = 실수
		// 실수 / 정수  = 실수
		// 값 / 0 => 예외발생 (Exception)
		// 자료형이 double / 0 -> infinity 발생
		
		System.out.println("3+2 = " + (3+2));
		System.out.println("3-2 = " + (3-2));
		System.out.println("3*2 = " + (3*2));
		System.out.println("3/2 = " + (3/2.0));
		System.out.println("3%2 = " + (3+2));
		
		// 비교 연산자 : 결과가 반드시 true or false
		/* >= (이상)  , <= (이하) , > (초과) , < (미만) , == (같다) , != (같지않다)
		 * 3 >= 5 -> false
		 * 
		 * a && b : 둘다 true 여야 true 나옴
		 * a || b : 둘 중 하나만 true 여도 true
		 * !a : ( not )a 상태 반대
		 * 
		 * */
		
		System.out.println(" 3 > 2? " + ( 3 > 2));
		System.out.println(" 3 < 2? " + ( 3 < 2));
		System.out.println(" 3 == 2? " + ( 3 == 2));
		System.out.println(" 3 != 2? " + ( 3 != 2));
		
		System.out.println("&& 연산자 : " + (3 > 2 && 4 < 3));
		System.out.println("|| 연산자 : " + (3 > 2 || 4 < 3));
		
		// 조건선택 여산자 : 3항연산자
		/* (조건식) ? true : false;
		 * 
		 * 
		 * */
		System.out.println((3 < 2)? "참입니다." : "거짓입니다.");
		
		//문제 : num 의 변수를 선언하여 값을 입력하고
		// num가 짝수인지 홀수인지 판별하시오
		// 조건선택 연산자 사용하여 출력
		
		int num = 7;
		System.out.println(num);
		System.out.println((num%2 == 1)? "홀수입니다." : "짝수입니다.");
		String result = ((num%2 == 1)? "홀수입니다." : "짝수입니다.");
		System.out.println( num + "은 " + result);
		
		
	
	
      
		
		
	}

}
