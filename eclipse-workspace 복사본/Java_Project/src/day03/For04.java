package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 구구단 입력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int a = scan.nextInt();
		
		if ( a >= 10 || a <= 1) {
			System.out.println("다시 입력하세요.");
		}
		
		for (int i = 1; i < 10; i++) {
				System.out.print(a + "*" + i +  "=" + (a*i) + "  ");
			}
		scan.close();
		
		}

	}


