package day22;

class MyThread extends Thread{
	// 반드시 run() 라는 메서드를 구현해야 함.

	@Override
	public void run() {
		// 0~200 까지 200번 반복하여 실행하는 구문
		for(int i = 0 ; i <= 200 ; i++) {
			System.out.println(i + "번째 Thread  " + getName());
		}
	}
	
	
}



public class Thread01 {

	public static void main(String[] args) {
		// Thread : 쓰레드
		/* - 실행중인 프로그램이 OS로부터 메모리를 할당받아 process상태가 됨.
		 * - 하나의 process는 하나 이상의 thread를 가지게 됨.
		 * - Thread 는 실제 작업을 수행하는 단위
		 * - Thread가 실제 CPU가 작업을 처리하는 단위 
		 * - Multi-thread : 여러개의 Thread가 동시에 수행되는 프로그램
		 * - CPU 는 시간을 잘게 쪼개서 Thread를 번갈아 수행하는데,
		 * - 사용자들은 동시에 처리되는 듯한 효과를 가지게 됨.
		 * - Thread는 각각 자신만의 작업공간을 가짐(context)
		 * - 각 Thread는 공유하는 자원이 있을 수 있음.(자바에서는 static instance)
		 * - 여러 Thread가 공유하는 자원 중 경쟁이 발생하는 부분을 Critical section (임계영역) 이라고 함
		 * - Critical section에 대한 동기화 (순차적 수행)을 구현하여 오류를 막음.
		 * 
		 * 
		 * */
		
		/* Thread를 구현하는 2가지 방법
		 * 1. Thread 클래스를 상속하여 만들기
		 * 2. Runnable 인터페이스를 구현하여 만들기
		 * 자바는 다중상속을 허용하지 않기 때문에, 다른 클래스를 상속중인 경우는 2번으로 구현 (보통 1번)
		 * 
		 * */
		
		System.out.println(Thread.currentThread().getName()); //현재 실행중인 Thread이름
		
		
		MyThread th = new MyThread();
		th.start();
		MyThread th2 = new MyThread();
		th2.start();
		
		
		
		
		
		
		
		

	}

}
