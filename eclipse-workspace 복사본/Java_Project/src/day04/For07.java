package day04;

public class For07 {

	public static void main(String[] args) {
		// 이중 for 문
		/* 별찍기
		 * for (int i =1; i<= 5 ; i++)		i =  1   2   3   4   5 
		 * 		for (int j = 1; j<= 5 ; j++) j= 1~5 1~5 1~5 1~5 1~5
		 * 			실행문;5 5 5 5 5 => 25번 실행
		 * ***** i =1 , j=5
		 * ***** i =2 , j=5
		 * ***** i =3 , j=5
		 * ***** i =4 , j=5
		 * ***** i= 5 , j=5
		 * */
		
		for (int i= 1; i<= 5 ; i++) {
			for(int j = 1; j<= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for (int i= 1; i <=5; i++) {
			for (int j = 0; j < i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		System.out.println("-------------------");
		
		for (int i = 0; i <=5; i++ ) {
			for (int j = 1; j < 6 -i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("---------------------");
		System.out.println();
		
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1 ; j <= 5-i; j++ ) {
				System.out.print(" ");
			
			}
			for (int k = 1; k <= i ; k++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*      *		1
		 *     ***		3
		 *    *****		5
		 *   *******	7
		 *  *********	9
		 * 
		 * */
		
		System.out.println("------------------");
		
		for (int i = 1; i<= 9; i +=2 ) {
			for(int j = 1; j<= 9-i ; j +=2) {
				System.out.print(" ");
		}
		for (int k = 1; k<= i ; k ++) {
			// k<= (i*2)
			System.out.print("*");
			
		}
		
		System.out.println();

	}
		
		System.out.println("--------------------");
		
		/* 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 3줄씩 3개 출력
		 * 
		 * 
		 * 
		 * */
		
		
		int count = 0;
		for (int i= 1 ; i<=3 ; i++){
			for (int j = 1;j <=3; j++) {
				count++;
				System.out.print(count+ " ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		
	
		
	}
}
