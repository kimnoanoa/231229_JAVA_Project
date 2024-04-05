package day15;

public class Customer {
	
	/* 일반고객 / gold고객(할인) / vip 고객(할인)
	 * 
	 * 고객 ID : int customerID
	 * 이름 : String customerName
	 * 등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스 적립 비율 : double bonusRatio
	 * 
	 * 클래스 생성 
	 * - 기본 "silver"
	 * - bonusRatio = 0.01 => 1% 적립
	 * - 
	 * 
	 * -메서드 
	 * 1.보너스 적립 계산 메서드 ( 메서드명 : calcPrice (int price))
	 * => 구매 금액을 주고 적립보너스를 계산,bonusPoint 에 누적
	 * => 보너스 적립, 할인여부를 체크해서 구매 price 를 리턴
	 * 
	 * 2.출력메서드( 메서드명 : customerInfo())
	 * => 홍길동님 등급은 vip 이며, 보너스 포인트는 1000 입니다.
	 * 	  전담 상담사번호는 1111입니다. => vip 고객만 출력
	 * 
	 * - silver 등급
	 * => 제품구매 0% 할인, 보너스포인트 1% 적립
	 * - 골드등급
	 * => 제품구매 10% 할인, 보너스포인트 2% 적립
	 * - 브이아이피 등급
	 * => 10%할인, 5% 적립
	 * => 전담상담사를 멤버변수에 추가 (int agentID)
	 * 
	 * 
	 * - GoldCustomer extends Customer{
	 * * 기본메서드를 오버라이딩하여 사용
	 * 
	 * VipCustomer extends Customer{
	 * }
	 * 
	 * */
	// 멤버변수
	 protected int customer;
	 protected String customerName;
	 protected String customerGrade ;
	 protected int bonusPoint ;
	 protected double bonusRatio ;
	 protected int agentID;
	 protected int price;
	 
		
	//생성자
	 
	 public Customer() {}


	public Customer(int customer, String customerName, String customerGrade, int bonusPoint, double bonusRatio) {
		
		this.customer = customer;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	

	


	public Customer(int customer, String customerName) {
		super();
		this.customer = customer;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}


	public Customer(int bonusPoint, double bonusRatio) {
		super();
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}


	// 메서드
	
	public int calcPrice (int price) {
		bonusPoint = bonusPoint +(int)(price* bonusRatio);
		return price; //실버등급은 할인이 없음.
		
	
	}
		
	//  출력메서드
	public void customerInfo() {
//		System.out.println("-----회원정보-----");
		System.out.println("고객 ID :" + customer + " 이름 : " + customerName);
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며 누적 포인트는 " + bonusPoint + "입니다.");
//	if (customerGrade.equals("VIP")) {
//		System.out.println("전담 상담사 번호는 " + agentID + "입니다.");
//	}
	}
	
	
	// getterSetter
	
	public int getCustomer() {
		return customer;
	}


	public void setCustomer(int customer) {
		this.customer = customer;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerGrade() {
		return customerGrade;
	}


	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public double getBonusRatio() {
		return bonusRatio;
	}


	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}


	public void agentID(int agentID) {
		this.agentID = agentID;
		
	}
	


	public int getAgentID() {
		return agentID;
	}


	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}


	@Override
	public String toString() {
		return "Customer [customer=" + customer + ", customerName=" + customerName + ", customerGrade=" + customerGrade
				+ ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + ", agentID=" + agentID + ", price="
				+ price + "]";
	}
	 
	 
		
	

}

















