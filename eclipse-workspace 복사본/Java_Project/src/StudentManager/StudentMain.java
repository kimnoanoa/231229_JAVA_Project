package StudentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//* -studentMain class : 객체를 생성하고 화면에 출력하는 클래스
//		 * - menu :
//		 *  1.학생등록 | 2.학생리스트출력 | 3.학생검색(학생정보, 수강정보)
//		 *  4.수강신청 | 5. 수강철회 | 6.종료 (do-while문)
		
		Scanner scan = new Scanner(System.in);
		
		Manager st = new Manager();
		int menu = 0;
		
		do {
			System.out.println("---------menu---------");
			System.out.println(" 1.학생등록 | 2. 학생 리스트 출력 | 3. 학생검색 ");
			System.out.println(" 4.수강신청 | 5. 수강 철회 | 6.종료 ");
			
			System.out.println(" 메뉴를 선택하세요. >>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("학생 등록을 시작합니다.");
				st.insertStudent(scan);
				break;
			case 2 : 
				System.out.println("학생 리스트를 출력합니다.");
				st.printStudent();
				break;
			case 3 : 
				System.out.println("학생 검색을 시작합니다.");
				st.searchStudent(scan);
				break;
			case 4:
				System.out.println("수강 신청을 시작합니다.");
				st.registerSubject(scan);
				break;
			case 5: 
				System.out.println("수강 철회를 시작합니다.");
				st.deleteSubject(scan);
				break;
			case 6:
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu !=6);
		
		
		
		
		
		scan.close();
		
	}

}
