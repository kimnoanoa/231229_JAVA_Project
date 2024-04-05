package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		// 6의 약수 : 1,2,3,6 (모든 수는 1과 자신을 약수로 가짐)
		
		int num = 100;
		
		// num 를 1~num 까지 나눈 나머지가 0인 수를 출력
		
		for (int i = 1; i<= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// num1 를 입력받아서 약수를 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num1  = scan.nextInt();
		System.out.println("내가 입력한 수 : " + num1);
		
		for (int i = 1; i <= num1; i++) {
			if (num1 % i ==0) {
				System.out.print(i + " ");
			}
		}
		
		
		scan.close();
		

	}

}
