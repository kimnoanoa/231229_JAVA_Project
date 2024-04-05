package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	// 제네릭 클래스 처리
	private ArrayList<Sale<String,Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String,Integer>> order = new ArrayList<>();
	
	
	
	
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

	public void menuPrint() {
//		for (int i = 0; i <menu.size(); i++) {
//			System.out.println(menu.get(i).getMenu() + " : " + menu.get(i).getPrice() + "원");
//		}
		
		for(Sale<String,Integer> sa : menu) {
			System.out.println(sa);
			
		}
		
		
	}

	public void orderPick(String name, int count) {
		// 입력받는 값은 제품명, 수량
		// 제품명 가격*수량 (지불금액) 을 order에 추가
//		System.out.println("주문할 제품명을 입력하세요.");
//		String menu = scan.next();
//		System.out.println("수량을 입력하세요.");
//		String a = scan.next();
//		int price = 1000;
//		
//		Sale<String,Integer> s1 = new Sale<String,Integer>();
//		
//		
//		System.out.println("제품 주문 완료되었습니다.");
//		
//		int h = Integer.parseInt(a)*price;
////		order.add(h, null);;
//		
//		System.out.println("지불금액 :"+ h);
		
//		name = 주문음식, count = 수량
		
		
		for (int i = 0; i < menu.size(); i++) {
			
			String ProductMenu = menu.get(i).getMenu();
			int ProductPrice = menu.get(i).getPrice();
			if(ProductMenu.equals(name)) {
				int index = orderSearch(name);
				if (index != -1) { //order 에 같은 제품이 있다면
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price +ProductPrice*count );
					return;
				}
				//한번도 주문한 적 없는 메뉴일때
				Sale p = new Sale(ProductMenu, (ProductPrice*count));
				order.add(p);
			}
		}	
		
	}
	
	
	public int orderSearch(String name) {
		int index = -1;
		for(int i = 0; i < order.size(); i++) {
			if(order.get(i).equals(name)) {
				index = i;
				System.out.println(index);
			}
		}
		return index;
	}

	public void orderPrint() {
		// 주문내역 출력
		// 총 지불금액 출력
		int sum = 0;
		for(Sale<String,Integer> tmp : order) {
			System.out.println(tmp);
			sum += tmp.getPrice();
			
		}
		System.out.println("총 지불금액 : " + sum);
		
	}
	
	// 제네릭 클래스 처리

}
