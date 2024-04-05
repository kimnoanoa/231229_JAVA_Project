package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*up/down 게임
		 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 컴퓨터가 랜덤 수 생성 : 23
		 입력 > 10
		 up~!!
		 입력 > 20
		 up~!!
		 입력 > 30
		 down~!!
		 입력 >23
		 정답!! 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다. Start~~!");
		
		
		System.out.println("숫자를 입력하세요.");
		int i = scan.nextInt();
		int count = 0;
		while (true) {
			count++;
		if (count > 5) {
				System.out.println("5회 안에 정답을 맞추지 못했습니다.");
				break;
			}
		if (num1 > i) {
			System.out.println("up! " + count + "회");
			i= scan.nextInt();
		}
		if(num1 < i) {
			System.out.println("down!" + count + "회");
			i=  scan.nextInt();
			}
		if(i == num1 ) {
				System.out.println("정답입니다!");
				break;
				
		}
		
		}
		
		
		
		
		scan.close();
		
//		Scanner scan = new Scanner(System.in);
//		
//		int random = (int)Math.random()*50+1;
//		System.out.println("컴퓨터가 랜덤수를 생성하였습니다. ");
//		int num = 0;
//		int count = 0;
//		while (num ! = random) {
//			System.out.println("입력 >");
//			num = scan.nextInt();
//			count++;
//			if (num > random) {
//				System.out.println("down~" + count + "회");
//			
//			}else if (num < random) {
//				System.out.println("up~~" +count + "회");
//			}else {
//				System.out.println("정답입니다!");
//			}
//		}
//		
//		scan.close();
//	
		 
	
		}
		
	}
		

		
		
		
		

	

