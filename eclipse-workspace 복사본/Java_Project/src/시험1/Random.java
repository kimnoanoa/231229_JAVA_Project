package 시험1;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		
		
		int random = 0 ;
		int sum = 0;
		int cnt;
		System.out.println("난수의 개수를 입력하세요.");
		int a = Scan.nextInt();
		for(int i = 1 ; i <= a; i++) {
			random = (int)(Math.random()*99)+1;
//			System.out.println(random);
			sum += random;
		}
		System.out.println("난수 " + a + "개의 합은 "+ sum);
		
		
		
		Scan.close();

	}

}
