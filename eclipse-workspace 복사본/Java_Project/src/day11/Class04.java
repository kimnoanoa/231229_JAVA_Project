package day11;

public class Class04 {

	public static void main(String[] args) {
		// TV 클래스 생성
		/* 멤버변수 : brand, power(boolean) , ch, vol
		 * 메서드 :
		 *  power()
		 * power 가 켜지면 "TV가 켜졌습니다." 꺼지면 "TV가 꺼졌습니다."
		 * 
		 * chUp() : 1씩 증가 / 20까지 있음. 20이 넘어가면 다시 0으로 순환구조
		 * chDown() ; 1씩 감소, 20다음엔 0 순환구조
		 * 
		 * volUp() / volDown() : 1씩 증감,
		 * vol 쵣대 10, 최소 0(음소거)
		 * 
		 * 
		 * 
		 * */
		
		Tv a = new Tv();
		//  Tv a = new Tv("LG")
		
		a.setBrand("삼성");
		a.print();
		
		
		a.power();
		
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chUp();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.chDown();
		a.volDown();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.volUp();
		a.power();
		
		

	}

}

class Tv{
	private String brand;
	// private final String BRAND = " LG" // final 은 변경할 수 없는 값을 지정
	// final 로 지정할경우 getter는 가능하지만 setter로 변경은 불가능
	private boolean power;
	private int ch;
	private int vol;
	
	public Tv() {
		this.vol =3;
	}
	
	public Tv(String brand,int vol) {
		this.brand = brand;
		this.vol = vol;
		
	}
	// power
	public void power (){
		power =!power;
		if (power) {
			System.out.println("전원이 켜집니다.");
		}else {
			System.out.println("전원이 꺼집니다.");
		}
	}
	// 생성자
	
	
	//chUp
	
	public void chUp() {
		if (ch >= 20 ) {
			ch = 0;
		}else {
			ch+= 1;
		}
		System.out.println("채널 : " + ch);
		if (!power) {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	//chDown
	
	public void chDown() {
		if (ch <= 0) {
			ch = 20;
		}else {
			ch-= 1;
		}
		System.out.println("채널 : " + ch);
		if (!power) {
			System.out.println("전원을 켜주세요.");
		}
	}
	
	public void volUp() {
		if(vol >= 10) {
			vol = 10;
			System.out.println("최대 볼륨입니다.");
		}else {
			vol+= 1;
		}
		System.out.println("볼륨 : " + vol);
	}
	
	public void volDown() {
		if (vol <= 0 ) {
			vol = 0;
			System.out.println("음소거");
		}else {
			vol-= 1;
		}
		System.out.println("볼륨 : " + vol);
	}
	
	
	// print
	
	public void print() {
		System.out.println("Tv : " + brand);
		
}

	// getter, setter
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
		
	}


