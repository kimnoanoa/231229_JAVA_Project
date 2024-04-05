package day03;

public class While {

	public static void main(String[] args) {
		// While 문
		/* While 문은 횟수가 일정치 않을 때 사용
		 * While (조건식){실행문;} //조건식이 true일 때 반복
		 * while 은 실행문 안에 조건식이 바뀔 수 있는 증감식이 있어야 가능함
		 * 
		 * 
		 */
		
		// for 문으로 1부터 10까지 출력
		for (int i = 1; i <= 10 ; i ++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//while 로 1부터 10까지 출력
		int i = 0 ;
		while ( i < 10) {
			i++;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// while 문으로 1~10까지 짝수만 출력
		int a = 0;
		while (a < 10) {
			a = a + 2;
			System.out.print(a + " ");
		}	
		
			System.out.println();
		
		int j = 0;
		while (j< 10) {
			j++;
			if (j% 2 ==0) {
				System.out.print(j + " ");
			}
		}

	}

}
