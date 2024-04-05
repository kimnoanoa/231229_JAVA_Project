package std_T;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StdManager sm = new StdManager();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		do {
			System.out.println("*** 메뉴를 선택하세요.***");
			System.out.println("1.학생추가 | 2.학생리스트 |	3.학생검색	 | 4.학생수정 ");
			System.out.println("5.학생삭제 | 6.점수추가  | 7.점수수정  | 8.점수삭제 | 9.종료");	
			menu = scan.nextInt();		
			
			switch (menu) {
			case 1:
				System.out.println("학생을 추가합니다.");
				sm.addStd(scan);
				break;
			case 2:
				System.out.println("학생리스트를 출력합니다.");
				sm.printStd();
				break;
			case 3:
				System.out.println("학생을 검색합니다.");
				sm.searchStd(scan);
				break;
			case 4:
				System.out.println("학생을 수정합니다.");
				sm.modStd(scan);
				break;
			case 5:
				System.out.println("학생을 삭제합니다.");
				sm.delStd(scan);
				break;
			case 6:
				System.out.println("점수를 추가합니다.");
				sm.addSub(scan);
				break;
			case 7:
				System.out.println("점수를 수정합니다.");
				sm.modSub(scan);
				break;
			case 8:
				System.out.println("점수를 삭제합니다.");
				sm.delSub(scan);
				break;
			case 9:
				System.out.println("종료합니다.");
				break;

			default: System.out.println("잘못된 메뉴입니다.");
				break;
			}
			
			
		}while(menu != 9);
		
		
		scan.close();
		

	}

}
