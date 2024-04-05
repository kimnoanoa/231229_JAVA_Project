package day08;

public class Method05 {

	public static void main(String[] args) {
		// 
		
		boolean sum = sum(17);
		System.out.println(sum);
		// 2 부터 100까지의 소수를 출력하고 소수의 합계를 출력
		// sum 메서드 호출해서!!!!
		
		int s = 0;
		for (int i =2 ; i<= 100 ; i++) {
			if(sum(i)) { //true
				System.out.print(i + " ");
				s+= i;
			}
		}
		
		System.out.println();
		System.out.println("소수의 합계 : "+ s);
		
		
		
//		
//		for (int i = 2;  i <= 100 ; i++) {
//			count = 0;
//			for (int j= 1; j <= i ; j++) {
//				if ( i % j == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.print( i + " ");
//		}
//	
//		}
//		System.out.println();
//		System.out.println("합계는 : ");
//		
		
	}
	
	
	/* 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별(true,false)
	 * 
	 * */
	
	public static boolean sum(int num1) {
		int count = 0;
		for (int i = 1; i <= num1 ; i++) {
			if (num1 % i ==0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		}
			return false; // else 안써도댐!
			
		
	}

}
