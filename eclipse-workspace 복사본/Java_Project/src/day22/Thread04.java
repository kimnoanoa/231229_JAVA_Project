package day22;

class Bank{
	private int money = 20000;
	
	// 입금메서드
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money = m+save;
		
	
	}
	
	
	// 출금메서드
	
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.money = m-minus;
		
		
		
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Hong extends Thread{

	@Override
	public void run() {
		System.out.println("홍길동이 입금을 시작합니다.");
		Thread04.myBank.saveMoney(10000);
		System.out.println("saveMoney(10000)" + Thread04.myBank.getMoney());

	}
	
}

class HongWife extends Thread{

	@Override
	public void run() {
		System.out.println("홍길동 아내가 출금을 시작합니다.");
		Thread04.myBank.minusMoney(5000);
		System.out.println("minusMoney(5000)" + Thread04.myBank.getMoney());
	}
	
	
}

public class Thread04  {
	
	public static Bank myBank = new Bank(); //공유 영역
	

	public static void main(String[] args) {
		// Critical section 은 두 개 이상의 쓰레드가 동시에 접근할 수 있는 영역(공유영역)
		/* 동시에 여러 개의 쓰레드가 접근하게 되면 문제가 생길 수 있음.
		 * 세마포어(semaphore) 기법을 사용하여 한 순간에 오직 하나의 쓰레드만 사용 가능하게 함
		 * 세마포어를 얻은 스레드만 접근 가능, 나머지는 대기상태가 됨
		 * 
		 * 동기화 키워드 : synchronized
		 * 동기화가 필요한 메서드 앞에 선언
		 * 
		 * */
		
		/* Bank 클래스 생성
		 * 계좌 1개 생성 (객체 1개 생성)
		 * hong hongwife
		 * 
		 * */
		
		Hong h = new Hong();
		h.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		HongWife hw = new HongWife();
		hw.start();
		
		
		

	}

}
