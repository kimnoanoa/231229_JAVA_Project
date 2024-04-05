package sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager {
	
	
	Sale sl = new Sale();
	
	// 메뉴를 저장하기위한 리스트
	private ArrayList <Sale <String,Integer>> menu = new ArrayList<>();
	
	Order od = new Order();
	
	//주문을 저장하ㅣ기 위한 리스트
	private ArrayList <Order > order = new ArrayList<>();
	
	public void addMenu() {
		menu.add(new Sale("햄버거",5000));
		menu.add(new Sale("피자",8000));
		menu.add(new Sale("콜라",2000));
		menu.add(new Sale("감자튀김",3000));
		menu.add(new Sale("치킨텐더",5000));
	}
	
	

	public void add(Scanner scan) {
		// 제품 추가
			System.out.println("추가할 제품을 입력하세요.");
			String menu = scan.next();
			System.out.println("제품의 금액을 입력하세요.");
			int price = scan.nextInt();
			Sale <String,Integer >s = new Sale<String,Integer>(menu, price);
			this.menu.add(s);
				
				System.out.println("제품 추가 완료");
				
	}

	public void delete(Scanner scan) {
		System.out.println("삭제할 메뉴 입력 > ");
		String m = scan.next();
		int cnt = 0;
		for (int i = 0; i <menu.size() ; i++) {
			if(menu.get(i).getMenu().equals(m)) { //list.remove 는 index,object 두 가지 케이스만 있음. boolean X
				menu.remove(i);
				// menu.remove(menu.get(i)); => object
				cnt++;
				System.out.println("삭제 완료되었습니다.");
				return;
			}
			
		}
		if (cnt ==0) {
			System.out.println("검색결과가 없습니다.");
		}
	}

	public void mod(Scanner scan) {
		System.out.println(" 수정할 메뉴 >>> ");
		String m = scan.next();
		for (int i = 0 ; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(m)) {
				System.out.println("메뉴, 가격 중 수정할 품목 입력 >>");
				String o = scan.next();
				switch (o) {
				case "메뉴": 
					System.out.println("수정할 메뉴명 입력 >");
					String asd = scan.next();
					menu.get(i).setMenu(asd);
					break;
				case "가격": 
					System.out.println("수정할 가격 입력 >");
					int qwe = scan.nextInt();
					menu.get(i).setPrice(qwe);
					break;
				default: System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}
		System.out.println("수정 완료되었습니다.");
		
	}

	public void print() { //메뉴출력
//		for(Sale<String,Integer> sa : menu) {
//			System.out.println(sa);
//		}
		
		System.out.println("---menu---");
		for (Sale s: menu) {
			System.out.println(s);
		}
		System.out.println("----------");
		
	}

//	public void order(name,count) {
//		System.out.println("주문할 제품명을 입력하세요.");
//		String menu = scan.next();
//		System.out.println("수량을 입력하세요.");
//		int a = scan.nextInt();
////		for (int i=0; )
//		
////		for (Order<String,Integer> rrr : order) {
////			
////		}
//		System.out.println("주문 완료!");
//		System.out.println("주문 제품 : " + menu + " / " + "수량 : " + a );
//		
////		Order<String,Integer> s1 = new Order<String,Integer>(menu,a);
////		
////		System.out.println("주문 완료되었습니다.");
//		
		
//	}

	public void orderPick(String name, int count) {
		//주문
		//메뉴와 수량을 입력받아서 order객체를 생성후 orderList에 추가
		// price는  menuList에서 가져와야 함
		
		for (int i = 0; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price = menu.get(i).getPrice(); //내가 주문한 메뉴의 가격
				
				//order 의 데이터가 없으면 비교 자체가 불가능함.
				
				// 주문한 같은 메뉴가 없으면 -1, 있으면 해당 번지
				int index1 = orderSearch(name);
				if(index1 != -1) {
					//기존 값에서 count + /total+
					int cnt = order.get(index1).getCount(); //기존 주문 수량
					int tot = order.get(index1).getTotal(); //기존 주문 금액
					order.get(index1).setCount(count + cnt); // 주문수량 + 기존금액
					order.get(index1).setTotal(tot + (price*count));
					System.out.println("주문 추가 완료!");
					return;
				}
				
				Order o = new Order(name, price, count);
				order.add(o);
				return;
				
			}
		}
		System.out.println("없는 메뉴입니다.");
	}
		
	public int orderSearch(String name) {
			int index = -1;
			for(int i = 0; i < order.size(); i++) {
				if (order.get(i).getMenu().equals(name)) {
					index = i;
					return index;
				}
			}
			return -1;
			
		}
		


	public void printOrder() {
		// 주문내역 출력
		// 총 지불금액 출력
		int sum = 0;
		System.out.println("-----주문 내역-----");
		for(Order o : order) {
			System.out.println(o);
			sum+= o.getTotal();
		}
		
		System.out.println("-----------------");
		System.out.println("총 지불 금액 : " + sum);
	
	}



}
