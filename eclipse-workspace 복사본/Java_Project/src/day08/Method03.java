package day08;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요.");
		int a = scan.nextInt();
		
	
		
		scan.close();
		
		

	}
	
	//정수 2~9 중 하나에 해당하는 구구단 출력 메서드
	// 매개변수 : 2
	
	public static void sum(int b) {
		for(int i = 1; i < 10;i++) {
			System.out.println(b + " * " + i +" = "+ (b*i));
	}
		
	}
	

}
