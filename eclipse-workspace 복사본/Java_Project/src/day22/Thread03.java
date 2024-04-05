package day22;

class MyThread3 extends Thread{
	
	int sum = 0;

	@Override
	public void run() {
		for(int i = 1; i <= 50; i++) {
			System.out.println(i + " 번 Thread1" );
			sum+= i;
		}
	}

}

class MyThread4 extends Thread{
	
	int sum1 = 0;

	@Override
	public void run() {
		for(int i = 51; i <= 100; i++) {
		sum1 += i;
		System.out.println(i + " 번 Thread2" );
	    }
	
	}
}

public class Thread03 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 쓰레드
		// 결과 확인
		// 두개의 쓰레드가 실행되고 난 후 쓰레드 1 1~50/ 쓰레드 2 51~100
		// 쓰레드 1,2 합계 출력
		
		MyThread3 mth3 = new MyThread3();
		mth3.start();
		
		try {
			mth3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyThread4 mth4 = new MyThread4();
		mth4.start();
		
		try {
			mth4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("쓰레드 1의 합계 : " + mth3.sum);
		System.out.println("쓰레드 2의 합계 : " + mth4.sum1);
		
		System.out.println(" 총 합계 : " + (mth3.sum + mth4.sum1));
		
		
		System.out.println("==============================");
		
		JoinTest jo = new JoinTest(1,50);
		jo.start();
		
		try {
			jo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(500); // 0.5초 기다렸다가 실행
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		JoinTest jo2 = new JoinTest(51,100);
		jo2.start();
		
		try {
			jo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("쓰레드 1 합계 : " + jo.total);
		System.out.println("쓰레드 2 합계 : " + jo2.total);
		System.out.println(" 총 합계 : " + (jo.total+ jo2.total));
		
		
		
		
		
	}

}

class JoinTest extends Thread{
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
		
	}
	
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			this.total += i;
			if(i <=50) {
				System.out.println(i + "번째 Thread1");
			}else {
			System.out.println(i +"번째 Thread2");
		}
	}
	}
	
}




