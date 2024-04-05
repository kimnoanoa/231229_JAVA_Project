package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// break 문 : 반복문을 빠져나오게 하는 키워드
		/* 반복문에서 조건문 (if) 를 동반하여 조건에 맞을 때 반복문을 벗어나게 하는 역할
		 * 
		 * 
		 * */
		
		//1~10까지 출력
		// 초기값, 증감식 그대로두고 조건식만 생락해서 무한 루트 만들기
		
		for (int i = 1; ; i++) {
			System.out.print(i + " ");
			if ( i == 10 ) {
				break;
			}
		}
		System.out.println();
		
		// 한 글자를 입력받아서 그 글자를 출력 (반복해서 출력)
		// y를 입력받으면 종료
		//a -> a , b -> b, c -> c
		
		Scanner scan = new Scanner(System.in);
		for (;;) { // 무한루프
			System.out.println("한글자 입력 > ");
			char a = scan.next().charAt(0);
			System.out.println(a);
			if (a == 'y') {
				System.out.println("종료");
				break;
			}
			
		}
		
		
		
		scan.close();
		
		
		
		
		

	}

}
