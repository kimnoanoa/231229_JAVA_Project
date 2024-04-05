package day01;

public class 변수 {

	public static void main(String[] args) {
		/* 변수 선
		 * 자료형 (타임) 변수명;
		 * 
		 * 변수 선언 + 초기화;
		 * 자료형 (타입) 변수명  = 값;
		 * */
		
		int num = 123; // 선언한 다음 초기화해준 값
		System.out.println(num);
		
		//int num = 456;  // 변수는 중복선언 불가능
		
		int num1 = 12 , num2 = 34, num3 = 56; //같은 자료형의 한줄 선언 가능
	
		System.out.println(num1);
		
		num1 = 78; // 대입연산자 : 오른쪽의 값을 왼쪽의 변수에 저장 (덮어쓴다)
		System.out.println(num1);
		
		// 8 개의 기본자료형은 지역변수 범위 (scope) {}
		
		
		int num4 = 12;
			{System.out.println(num4); // 괄호 안에서 선언된 것은 괄호 밖으로 가면 인지되지 못함
			
		}
		System.out.println(num3);
		
		// char : 한 글자만 저장 가능
		// " 문자열 " , 숫자 ,char 'a'
		// String = "문자열" / char(한 글자만 가능) = 'a' 
		
		char ch = 'a';
		System.out.println(ch);
		
		double d = 3.1;
		System.out.println(d);
		
		byte b = 1;
		System.out.println(b);
		
		boolean boo = false; // true, false로만 저장가능
		System.out.println(boo);
		
		//float, long 형은 끝에 접미사를 붙여야 인식
		// float (F,f), long (L,l)
		
		float f = 1.2f;
		System.out.println(f);
		
		long l = 11L;
		System.out.println(l);
		
		num1 = 010; // 8진수로 인식 (0~7), 8은 10을 의미함
		// 10진수 (0~9) 10은 10으로 인식
		// 16진수 (0~16) 10은 16으로 인식 0~9,ABCDEF)
		System.out.println(num1);
		
		num2 = 0x10; // 16진수로 인식
		System.out.println(num2);
		
		// + - * / % (나머지)
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1 - num2);
		
		//국어점수 kor , 영어점수 eng, 수학점수 math 를 변수로 선언하고 값을 입력하여
		//세 점수의 합을 콘솔에 출력
		
		int kor = 90;
		int eng = 100;
		int math = 80;
		System.out.println(kor + eng + math);
		int sum = kor+eng+math;
		System.out.println("합계: " +sum);
		// + : 숫자 + 숫자 = 숫자 (더하기연산자) 
		// + : 숫자 + 문자 = 문자 (연결연산자)
		System.out.println((kor + eng + math) / 3); // 정수 나누기 정수는 정수
		System.out.println("평균 :" + sum / 3.0);
		
		int a = 10;
		a += 10; // a = a +10;
		//  ++ :
		System.out.println(a);
		System.out.println(a++); // ++은 위치에 따라 값이 변
		System.out.println(a);
		
		
		

	}

}
