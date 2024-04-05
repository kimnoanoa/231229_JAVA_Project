package day06;

import java.util.Scanner;

public class 과제_선생님답 {

	public static void main(String[] args) {
		//숫자를 입력받아서 입력받은 숫자를 거꾸로 출력.
		/* 11456 => 출력 출력 65411
		 * 각 자리의 합계도 출력 6+5+4+1+1 
		 * 19874 => 47891 4+7+8+9+1
		 * /, % 연산자를 이용
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		//System.out.println(num);
		int sum = 0;
		
		// num / 10 =  몫  = 다시 나누는 값으로 사용 
		// num % 10 = 나머지값을 저장 => 마지막 자리 (출력)
		
		while (num > 0) {
			int b = num % 10;
			System.out.print(b+" ");
			
			sum +=b;
			num = num /10; //정수 / 정수 => 정수 (소수점 버림)
			
			
		}
		System.out.println("합계는 " + sum);
		
		
		
		
		
		
		
		scan.close();
		
		
	}

}
