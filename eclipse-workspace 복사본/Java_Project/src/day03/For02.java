package day03;

public class For02 {

	public static void main(String[] args) {
		// 1~10까지 출력
		for ( int i = 1; i <=10 ; i++) {
			System.out.print(i + " ");
	}
		System.out.println();
		
		// 1부터 10까지 짝수만 출력
		
		for (int i = 2; i <= 10; i+= 2) {
			System.out.print(i + " ");
			
		} 
//		//for (int i = 1; i<= 10 ; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i+ " ");
//			}
//		}
		System.out.println();
		
		//1~10까지 합계를 구하기
		
		int sum = 0; //지역변수는 반드시 초기화해야함. 초기화 기본값 숫자는 0, 문자는 null
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " +sum);
		
		// 1~10까지의 짝수합과 홀수합을 출력
		int a = 0; 
		int b = 0;
		for (int i = 2; i <= 10; i+=2 ) {
			a = a+ i;
					for (int j = 1; j <= 10; j+=2) {
						b = b + j;
					}
	;
		}
//		System.out.println("1부터 10까지의 짝수 합은 " +a);
//		System.out.println("1부터 10까지의 홀수 합은 " +b);
//		
//		int sum_even = 0;
//		int sum_odd = 0;
//		for (int i = 1; 1<= 0; i++) {
//			if (i % 2 ==0) {
//				sum_even += i;
//			}else {
//				sum_odd += i;
			
//			}
	
	
	}
}

