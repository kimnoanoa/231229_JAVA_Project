package sale;

public class Order extends Sale{
	
	//주문 객체
	// 주문을 하려면 (메뉴명, 가격), 수량, 합계(가격,수량)
	// (메뉴명,가격) : 상속받은 객체의 값 => super
	// 수량,합계 : order만 가지고 있는 내 객체 => this
	
	private int count; // 수량
	private int total; // 합계 (가격*수량)


	// 생성자

	public Order() {}
	
	public Order(String menu, int price, int count) {
//		super.setMenu(menu);  //부모의 set을 사용
//		super.setPrice(price);
		
		// 부모 생성자 호출
		super(menu,price);
		this.count = count;
		this.total = price * count;
		
		
	}
	
	

	public Order(int count, int total) {
		super();
		this.count = count;
		this.total = total;
	}
	


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}




	@Override
	public String toString() {
		return  "[" + menu + ": " + count + "개, 총 금액: " + total + "]";
	}
	
	public void print() {
		System.out.print(super.getMenu() + " : " + super.getPrice());
		System.out.println(count + "개 주문 => 금액 : " + total);
	}
	
	
}



