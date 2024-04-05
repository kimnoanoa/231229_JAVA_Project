package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 계산기 만들기
		/* --menu--
		 * 1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈 / 5.나머지 / 6.종료
		 * >> 메뉴선택 1
		 * >> 숫자1 5
		 * >> 숫자 2 10
		 * >> 결과 5 + 10 =15
		 * 메서드를 이용해서 계산
		 * */
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("숫자 두 개를 입력하세요.");
			int a = 0, b = 0;
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println("------menu------");
			System.out.println(" 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료");
			System.out.println(" >> menu >> ");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: 
				System.out.println(a + " + " + b + "=");
				System.out.println(sum(a,b));
				break;
			case 2:
				System.out.println(a + " - " + b + "=");
				System.out.println(sub(a,b));
				break;
			case 3:
				System.out.println(a + " * " + b + "=");
				System.out.println(mul(a,b));
				break;
			case 4: 
				System.out.println(a + " / " + b + "=");
				System.out.println(div(a,b));
				break;
			case 5:
				System.out.println(a + " % " + b + "=");
				System.out.println(mod(a,b));
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
				default :
					System.out.println("잘못된 메뉴입니다.");
					break;
			}
			
		}while (menu != 6);
		
		

		scan.close();

	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
		}
	public static double div(int a,int b) {
		return a/(double)b;
	}
	public static int mod(int a,int b) {
		return a%b;
}
}
