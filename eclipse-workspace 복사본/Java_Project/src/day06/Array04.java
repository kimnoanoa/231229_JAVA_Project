package day06;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// 10개의 값을 가지는 배열을 생성해보세요.
		// 1~50 사이의 랜덤수를 발생시켜 배열에 저장한 후 출력
		// 합계, 평균, 최대값, 최소값
		
		Scanner scan = new Scanner(System.in);
		
		int arr [] = new int [10];

		int a = 0;
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 50;
		
		System.out.println("랜덤수를 생성합니다.");
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;

			sum = sum + arr[i];
			System.out.print(arr[i] + " ");
			
			if (max < arr[i]) {
				max = arr[i];
				
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			
			
		}
		avg = sum / (double) arr.length;
		System.out.println();
		
		System.out.println("합계는 : "+ sum);
		System.out.println("평균은 : " + avg);
		
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
	
	
		
		
		
		scan.close();

	}

}
