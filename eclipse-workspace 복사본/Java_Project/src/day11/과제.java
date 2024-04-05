package day11;

public class 과제 {

	public static void main(String[] args) {
		// 메서드를 사용하여 작업
		/* 메서드를 이용하여 작업
		 * 두 정수의 값이 주어졌을 때 두 정수사이의 모든 합을 리턴하는 메서드
		 * ex ) a =3, b = 5 =>3+4+5
		 * ex) a = 5 , b =1 => 1+2+3+4+5
		 * ex) a =3 ,b =3 => 3
		 * */
		
		
		// 1. 들어가는 값(매개변수) , 나오는 값 (리턴타입)
		//매개변수  : int a,b
		
		
		
		
		
		
		과제 ab = new 과제();
		int sum = ab.sum(5,8);
		System.out.println(sum);

	}
	
	// a b 사이의 모든 값을 합계
	// a b 를 비교하여 무조건 작은수부터 시작
	
	public int sum(int a, int b) {
		int result = 0;
		if (a > b) {
			for (int i = b; i <= a; i++) {
				result+= i;
			}
			
		}if (a < b ) {
			for (int i = a ; i <= b; i++) {
				result+= i;
			}
		}if (a == b) {
			for (int i = a; i <= b; i++) {
				result = i;
			}
		}
		return result;
	}
	
	 public int sum2(int a, int b) {
		 int sum = 0;
		 // a는 작은값, b는 큰값
		 int max = Math.max(a, b);
		 int min = Math.min(a, b);
		 
		 for (int i = min; i<= max ; i++) {
			 sum+= i;
		 }
			return sum;	 
	 }

}
