package day04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// Do { 실행문;} 
		// while (조건식);
		// 실행문을 먼저 실행하고 조건식을 비교하여 반복을 결정하는 구조
		/* for While 문은 조건식이 false 면 한번도 실행되지 않는 구조
		 * do While 문은 무조건 한 번은 실행하고 비교하는 구조
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		char ch = 'a';
		
		
		
		do { 
			System.out.println("한글자 입력 > ");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			
		} while ( ch != 'y' );
		System.out.println("종료! ");
		
		scan.close();
	}
	}

