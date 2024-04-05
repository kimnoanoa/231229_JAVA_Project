package day04;
import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고,
		 * menu
		 * 1. + / 2.- /3./ 4./ /5 % /6 종료 / 다른번호는 잘못된 메뉴로 출력
		 * num1 = 5 /num2 = 2
		 * 
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		System.out.println("첫번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
			
	
		do {
			System.out.println(" ====menu====");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("메뉴를 선택하세요.");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1 : 
				System.out.println(num1 + "+" + num2 + "="+ (num1+num2));
				break;
			case 2 :
				System.out.println(num1 + "-" + num2 + "="+ (num1-num2));
				break;
			case 3 :
				System.out.println(num1 + "*" + num2 + "="+ (num1*num2));
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("숫자를 다시 입력하세요.");
				num2 = scan.nextInt();	
				}
					System.out.println(num1 + "/" + num2 + "=" +(num1/num2));
				
				break;
			case 5 :
				if (num2 == 0) {
					System.out.println("숫자를 다시 입력하세요.");
				num2 = scan.nextInt();
				}
				System.out.println(num1 + "%" + num2 + "=" +(num1%num2));
				
				break;
			case 6 :
				System.out.println("종료되었습니다.");
				break;
	
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
			
		
			}while(menu != 6); // 메뉴가 6과 같지 않으면 돌아가지 x
		
		
		scan.close();

	}

}
