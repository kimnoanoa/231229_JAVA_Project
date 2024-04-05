package day13;

import java.util.Scanner;

// product 클래스 생성 : 상품을 등록하는 클래스
/* 상품명과 가격을 멤버변수로 함.
 * 생성자
 * 상품추가 메서드
 * 상품출력 메서드(toString 으로 생성가능)
 * 
 * */
public class 과제 {

	public static void main(String[] args) {
		//상품을 10개 등록가능한 배열 생성
		// 스캐너를 이용하여 상품 등록받기
		// 등록한 상품 출력
		
		Scanner scan = new Scanner(System.in);
		
		Product p = new Product();
		
		// product 클래스를 담을수  있는 배열 10칸을 준비
		String pd[] = new String[10];
		
//		// 상품을 등록하시겠습니까 ? y/n
//		// n을 누르면 등록한 상품 출력
		int cnt = 0;
		while (true) {
			for (int i = 0; i < pd.length ; i++) {
				cnt++;
				System.out.println("상품을 등록하시겠습니까? y || n");
				String asd = new String(scan.next());
				if (asd.equals("y")) {
				System.out.println("상품과 가격을 입력하세요.");
				pd[i] = p.Product2(scan.next(),scan.next());
				}
				if (asd.equals("n") || cnt >=10) {
					System.out.println("상품을 출력합니다.");
					for (String s : pd) {
						System.out.println(s.toString());
					}
				}
			
			}
			if (cnt >= 10) {
				System.out.println("더 이상 추가할 수 없습니다.");
				break;
			}
			
		}
//		
//		char c = 'y';
//		int count = 0;
//		while (c != 'n') {
//			System.out.println("상품을 등록하시겠습니까?");
//			c =scan.next().charAt(0);
//			if (c =='y') {
//				System.out.println("상품명 :");
//				String name = scan.next();
//				System.out.println("가격 : ");
//				String price = scan.next();
//				
//				
//				Product p = new Product(name,price);
//				pd[cnt] = p;
//				cnt++;
//			}else {
//				if(c == 'n') {
//					System.out.println("상품 등록 종료");
//				}else {
//					System.out.println("y/n만 가능합니다.");
//				}
//			}
//		}
		
//		System.out.println("----등록된 상품 리스트----");
//		for (int i = 0; i < cnt; i++) {
//			System.out.println(pd[i]);
//		}
		
		
		
		
		
		
		
		
//		int cnt = 0;
//		for (int i = 0; i < pd.length ; i++) {
//			cnt++;
//			System.out.println("상품과 가격을 입력하세요.");
//			pd[i] = p.Product2(scan.next(),scan.next());
//		}
//		for (String s : pd) {
//			System.out.println(s.toString());
//		}
//		if (cnt >= 10) {
//			System.out.println("더 이상 추가할 수 없습니다.");
//		}
		
		
		
		

//		product [] menu = new product[10];
		
//		int cnt = 0;
//		
//		
//		
//		Product p = new Product("pizza", "15000");
//		menu[cnt] = p;
//		cnt++;
//		
			
		
//		

	
		scan.close();
	}

}



class Product{
	private String name;
	private String price;
	
	
	public Product() {}
	
	public Product(String name, String price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String Product2(String name, String price) {
		return name + price;
	}
	
	
	// 쌤답
	public void insertProduct(String name, String price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	// 출력메서드
	
	public String toString() {
		return "상품 이름 : " + name + "  가격 : " + price + "원";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	


}

