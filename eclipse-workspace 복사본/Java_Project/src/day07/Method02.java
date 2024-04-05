package day07;

public class Method02 {

	public static void main(String[] args) {
		// + - * / % 메서드 5개 생성 , 메인에서 실행

		System.out.println("합 : "+ sum(10,20));
		System.out.println("차 : "+ sub(10,20));
		System.out.println("곱 : "+ mul(10,20));
		System.out.println("몫 : "+ div(10,20));
		System.out.println("나머지 : "+ mod(10,20));
		
		
	}
	
	// 메서드 선언위치
	//두 정수의 합 sum
	
	public static int sum(int num1,int num2) {
		return num1+num2;
	}
	
	//두 정수의 차 sub
	
	public static int sub(int num1,int num2) {
		return num1 - num2;
	}
	//두 정수의 곱 mul
	
	public static int mul(int num1,int num2) {
		return num1 * num2;
	}
	
	//두 정수의 몫 div
	
	public static double div(int num1, int num2) {
		return num1 /(double) num2;
	}
	//두 정수의 나머지 mod
	
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}
	
	
	
	

}
