package day04;

public class Coutinue01 {

	public static void main(String[] args) {
		// continue : 계속 pass, skip 개
		// 1~10까지 출력, 5빼고 출력
		for (int i = 1; i<= 10; i++) {
			if ( i ==5 ) {
				continue; // 조건에 맞다면 pass
			}
			System.out.print(i + " ");	
			
		
		}
		System.out.println();
		System.out.println("----------------------------");
		
		// 1~10까지 짝수만 출력
		//홀수를 continue 로  pass
		
		for (int i =1; i<= 10; i++) {
			if ( i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
			

	}

}
