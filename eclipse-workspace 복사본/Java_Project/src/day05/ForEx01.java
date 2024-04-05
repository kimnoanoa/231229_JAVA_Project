package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		// 소수 : 약수가 1과 나 자신만의 수를 가지는 
		/* 소수 : 3, 5, 7, 11 ,13 ,17, 19 ....
		 * 소수의 약수 ( 1, 자기자신)
		 * 
		 * 숫자 하나를 입력받아서 해당 수가 소수인지 아닌지 판별
		 * num = 13
		 * 소수입니다.
		 * num = 12
		 * 소수가 아닙니다.
		 * */
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		int count = 0;
//		for (int i = 1; i<=num  ; i++) { //약수의 개수를 세기위해 돌림
//			 if(num % i == 0 ) {
//				 count++;
//			 }	
//		}
//		
//		if (count == 2) {
//			System.out.println("소수입니다.");
//		} else {
//			System.out.println("소수가 아닙니다.");
//		}
			
		
		
		// 2~100까지의 소수를 모두 출력
		
		int count = 0;
		
		for (int i = 2;  i <= 100 ; i++) {
			count = 0;
			for (int j= 1; j <= i ; j++) {
				if ( i % j == 0) {
					count++;	
				}
			}
			if (count == 2) {
				System.out.print( i + " ");
		}
	
		
		}
		

	
//		scan.close();
		


	}

}
