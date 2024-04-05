package day20;

public class Customer {

	private String name;
	private int age;
	private int m;
	
	
	public Customer() {}
	
	
	public Customer(String name, int age, int m) {
		super();
		this.name = name;
		this.age = age;
		this.m = m;
//		this.m = (age >= 15)? 100:50;
	
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getM() {
		return m;
	}


	public void setM(int m) {
		this.m = m;
	}


	@Override
	public String toString() {
		return "[이름 : " + name + ", 나이: " + age + ", 여행비용 : " + m + "]";
	}



	
	
	
}
