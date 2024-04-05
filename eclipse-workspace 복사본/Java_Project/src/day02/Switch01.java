package day02;

public class Switch01 {

	public static void main(String[] args) {
		/* Switch 문 : 값에 따라 케이스를 달리 주는 형식
		 * 
		 * switch ( 변수 / 식) {
		 * case 1 :실행문; break;
		 * case 2 :실행문; break;
		 * case 3 :실행문; break;
		 * case 4 :실행문; break;
		 * default : 실행문; break;
		 * 
		 * break ; switch 문을 빠져나갈 때 사용
		 */
		
		int num = 5;
		switch (num % 2) {
			case 0 :
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
				break;
			default:
				System.out.println("잘못 입력된 값입니다.");
				break;
		}
		int num2 = 3; // 1,2,3중 하나
		switch (num2) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			default :
					System.out.println("ERROR");
		}

	}

}
