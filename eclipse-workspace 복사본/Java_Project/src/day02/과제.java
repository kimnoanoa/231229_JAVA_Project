package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 카페에 제출
		// 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		// 2 3 + => 2 + 3 = 5
		// 5 1 - => 5 - 1 = 5
		// 연산자는 + - * / %
		// 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		// 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력해주세요.");
		int num = scan.nextInt();
		
		System.out.println("두 번째 정수를 입력해주세요.");
		int num2 = scan.nextInt();
	
		System.out.println("연산자 하나를 입력하세요.");
		char ch = scan.next().charAt(0);
		if (ch == '/' && num2 == 0) { //if ((ch == '/' || ch== '%') && num2 ==0)
			System.out.println("정수를 다시 입력하세요.");
		}else if (ch == '%' && num2 == 0) {
			System.out.println("정수를 다시 입력하세요.");
		} else {
			switch (ch) {
			case '+' : 
				System.out.println("연산값은 " +( num + num2));
				// (""+num+ch+num2+"="+(num1+num2));
				break;
			case '-' :
				System.out.println("연산값은 " + (num - num2));
				break;
			case '*' :
				System.out.println("연산값은 " +(num * num2));
				break;
			case '/' :
				System.out.println("연산값은 " +(num / num2));
				break;
			case '%' : 
				System.out.println("연산값은 " +(num % num2));
				break;
			default : 
				System.out.println("잘못된 연산자입니다.");
				break;
			}
			
		}
		scan.close();
		
	}
		
		
		
	
		// 연산자 =char (기본자료형) == 비교가능 / String (객체) ==비교불가
		// int a = num + num2
		// int b = num - num2
		// double c = num / (double)num2
		// int d = num % num2
		
		// 연산자가 /,% 일 경우 num2가 0이 되면 안내문구 띄우기
		

	}


