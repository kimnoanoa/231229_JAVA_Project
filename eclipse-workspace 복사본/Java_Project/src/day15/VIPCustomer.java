package day15;

public class VIPCustomer extends Customer{
	
	private double saleRatio;
	
	public VIPCustomer() {}
	
	public VIPCustomer(int id, String name,int agentid) {
		
		super(id,name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		agentID = agentid;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint = bonusPoint +(int)(price* bonusRatio);
		price = price - (int)(price*saleRatio);
		return price;
	}
	
	

	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("담당 상담원 번호는 " + agentID + " 입니다.");
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	

}
