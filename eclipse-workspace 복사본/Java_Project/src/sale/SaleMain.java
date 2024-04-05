package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		// menu
		/* 1.메뉴추가 | 2.메뉴삭제| 3.메뉴수정(가격수정) 
		 * 4.전체메뉴출력 | 5.주문 | 6 .주문내역출력(영수증) | 7.종료
		 * */
		
		SaleManager sm = new SaleManager();
		sm.addMenu();
		
		Scanner scan = new Scanner(System.in);
		
		
		int menu = 0;
		
		do { 
			System.out.println("1.메뉴추가 | 2.메뉴삭제| 3.메뉴수정(가격수정)");
			System.out.println("4.전체메뉴출력 | 5.주문 | 6 .주문내역출력(영수증) | 7.종료");
			System.out.println(" ***** 메뉴 선택 *****");
			
			menu = scan.nextInt();
			
			
			switch(menu) {
			case 1: sm.add(scan);
				break;
			case 2: 
				sm.delete(scan);
				break;
			case 3:
				sm.mod(scan);
				break;
			case 4: 
				sm.print();
				break;
			case 5:
				System.out.println("주문 메뉴 > ");
				String name = scan.next();
				System.out.println("수량 > ");
				int count = scan.nextInt();
				sm.orderPick(name,count);
				break;
			case 6: 
				sm.printOrder();
				break;
			case 7: 
				System.out.println("종료합니다.");
				break;
			default: break;
			}
			
		} while (menu != 7);
		
		
		
		scan.close();


	}

}
