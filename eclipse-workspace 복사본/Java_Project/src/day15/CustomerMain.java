package day15;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer[] customerList = new Customer[10];
		
		
		Customer c = new Customer(1001,"소금");
		Customer c2 = new GoldCustomer(1002,"김치치");
		Customer c3 = new VIPCustomer(1003,"김노아",1234);
		
		
		int cnt = 0;
		customerList[cnt] =c;
		cnt++;
		customerList[cnt] =c2;
		cnt++;
		customerList[cnt] =c3;
		cnt++;
		customerList[cnt] = new Customer(1004,"영이");
		cnt++;
		customerList[cnt] = new GoldCustomer(1005,"철이");
		cnt++;
		customerList[cnt] = new VIPCustomer(1006,"순이",1111);
		cnt++;
		customerList[cnt] = new VIPCustomer(1007,"민수",1111);
		cnt++;
		
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		// 자식 고유의 멤버변수나 메서드를 호출하고자 할 때 사용
		// 다운캐스팅 : 반드시 명시적으로 형변환 해야함.
		// instanceof : 객체의 형이 맞는지 체크하는 명령어 true/false
		
		
//		c.customerInfo();
////		int price1 = c.calcPrice(10000);
////		System.out.println("지불 금액 : " +price1);
//		
//		c2.customerInfo();
////		int price2 = c2.calcPrice(10000);
////		System.out.println("지불 금액 : " +c2.calcPrice(10000));
//		
//		c3.customerInfo();
//		System.out.println("지불 금액 : " +c3.calcPrice(10000));
		
		System.out.println("---할인율과 포인트 계산---");
		
		int price = 100000;
		for(int i = 0; i <cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			
			System.out.println(customerList[i].getCustomerName() + "님의 지불 금액: " + salePrice + 
					"/ 보너스 포인트: " +customerList[i].getBonusPoint());
			System.out.println("----------------------------");
			
		}
		System.out.println("------------------");
		
		Customer downCasting;
		for (int i =0; i < cnt; i++) {
			Customer a = customerList[i];
			if(a instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)a;
				if(vip.getAgentID() == 1111) {
					vip.setAgentID(3333);
				}
			}
			
		}
		
		
		System.out.println("---고객정보 출력---");
		for (int i = 0; i< cnt ; i++) {
			customerList[i].customerInfo();
		}
		
		System.out.println("====================");
	
		// agentID = 1111 => 3333 변경
	
			
	
	}

}
