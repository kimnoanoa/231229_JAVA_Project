package StudentManager1;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		/* -studentMain class : 객체를 생성하고 화면에 출력하는 클래스
		 * - menu :
		 *  1.학생등록 | 2.학생리스트출력 | 3.학생검색(학생정보, 수강정보)
		 *  4.수강신청 | 5. 수강철회 | 6.종료 (do-while문)
		 *
		 */
		
		//메뉴 처리
		
		//객체를 생성해야 하는 것은 항상 미리 해놓고 메서드 호출
		Scanner scan = new Scanner(System.in);
		
		StudentManager sm = new StudentManager();
		int menu = 0;
		
		do {
			System.out.println("-----menu----");
			System.out.println(" 1.학생등록 | 2. 학생 리스트 출력 | 3. 학생검색 ");
			System.out.println(" 4.수강신청 | 5. 수강 철회 | 6.종료 ");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1: 
				System.out.println("학생 등록을 시작합니다.");
				sm.insertStudent(scan);
				break;
			case 2 : 
				System.out.println("학생 리스트를 출력합니다.");
				sm.printStudent();
				break;
			case 3 : 
				System.out.println("학생 검색을 시작합니다.");
				sm.searchStudent(scan);
				break;
			case 4:
				System.out.println("수강 신청을 시작합니다.");
				sm.registerSubject(scan);
				break;
			case 5: 
				System.out.println("수강 철회를 시작합니다.");
				sm.deleteSubject(scan);
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
			
			
		}while(menu != 6);
		
		
		
		scan.close();
		

	}

}
