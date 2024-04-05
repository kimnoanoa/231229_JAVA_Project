package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// car1 클래스를 통해 c객체를 생성 . new 키워드를 통해 생성. car() 생성자에 의해 초기화
		Car1 c = new Car1(); 
		c.setName("캐스퍼");
		c.setColor("하늘색");
		c.setYear("2023년");
		c.setDoor("4");
		c.print();
		
		c.power();
		
		c.doors();
		c.power();
		System.out.println("Mycar Power : " + (c.isPower()? "on" : "off"));
		c.power();
		System.out.println("Mycar Power : " + (c.isPower()? "on" : "off"));
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.doors();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.power();
		System.out.println("Mycar Power : " + (c.isPower()? "on" : "off"));
		c.doors();
		c.SpeedDown();
		c.SpeedUp();
		c.power();
		System.out.println("Mycar Power : " + (c.isPower()? "on" : "off"));
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedUp();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.SpeedDown();
		c.power();
		System.out.println("Mycar Power : " + (c.isPower()? "on" : "off"));
		
		Car1 c2 = new Car1("소나타","2021");
		c2.print();
		
		Car1 c3 = new Car1("아반떼", "2020", "빨강", "4");
		c3.print();

	}

}

// 같은 패키지에서 같은 이름의 클래스를 사용하면 에러
class Car1{
	
	// 멤버변수 : name, year, color, power, speed ,door(문 개수)
	
	private String name;
	private String color;
	private String year;
	private String door;
	private boolean power;
	private int speed;
	
	
	// power 정보
	// 시동이 켜졌습니다. 시동이 꺼졌습니다.
	// speed 가 0이 아니면 시동끌수없게.
	
	public void power() {
		if (speed !=0) {
			power = power;
		}else {
		power = !power;
		}
	
	}
	
	
	
	// 생성자 위치
	public Car1() {
		// 기본생성자
	}
	// 생성자는 여러 개 만들 수 있음. (생성자 오버로딩)
	// 오버로딩 조건 : 매개변수의 개수가 달라야함 ,  개수가 같다면 타입이 달라야함
	
	public Car1(String name, String year, String color, String door) {
		this(name,year); // 생성자 호출 
		this.color = color;
		this.door = door;
		
	}
	public Car1(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	
	// speedUp/Down 의 기본조건은 파워가 켜져야 가능. 
	//(시동이 꺼져있으면 시동이 꺼져있습니다.)
	// speedUp 
	// 300이상이면 최고속도입니다. 출력
	// 현재속도 출력
	
	public void SpeedUp() {
		if (speed >= 300) {
			speed = 300;
			System.out.println("최고 속도입니다.");
		} else {
			speed+= 10;
		}
		if (power == false) {
			speed = 0;
			System.out.println("시동이 꺼져있습니다.");
		}
		System.out.println("현재 속도 : " + speed);
	}
	

	
	// speedDown
	// 속도가 0이 되면 더이상 내려가지 않음. (멈췄습니다.)
	// 현재속도 얼마인지 출력
	
	public void SpeedDown() {
		if (speed <= 0) {
			speed = 0;
			System.out.println("멈췄습니다.");
		}else {
			speed-= 10;
		}
		if (power == false) {
			System.out.println("시동이 꺼져있습니다.");
		}
		System.out.println("현재 속도 : " + speed);
	}
	
	// 속도가 있으면 door가 잠길 수 있게.
	
	public void doors() {
		if (speed > 0) {
			System.out.println("문이 잠겼습니다.");
		}else {
			System.out.println("문이 열렸습니다.");
			
		}
	}
	
	// 내 차량의 정보를 출력하는 메서드 (name, year, color, door)
	
	public void print() {
		System.out.println("MyCar : "+ name + "/"+ color + "(" + year + ")");
		System.out.println("--Door : " + door + "개");
	}
	
	// getter/ setter

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getDoor() {
		return door;
	}


	public void setDoor(String door) {
		this.door = door;
	}
	
	
	
	
	
	
	
}