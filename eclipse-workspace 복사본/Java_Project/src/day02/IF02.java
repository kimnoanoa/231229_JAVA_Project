package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// 국어 영어 수학 점수를 입력받아 
		// 합계, 평균, 평가를 출력
		//평균 90이상이면  A 80 B 70 C 나머지 D
		// 입력값이 0보다 작거나 100보다 크면 잘못된 값
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력해주세요.");
		int num = scan.nextInt();
		if (num<0 || num >100) {
			System.out.println("다시 입력해주세요.");
		}else {
		System.out.println("국어 점수 : "+ num);
		}
		System.out.println("--------------------------");
		
		System.out.println("영어 점수를 입력해주세요.");
		int num2 = scan.nextInt();
		if (num<0 || num >100) {
			System.out.println("다시 입력해주세요.");
		}else {
		System.out.println("영어 점수 : "+ num2);
		}
		System.out.println("--------------------------");
		
		System.out.println("수학 점수를 입력해주세요.");
		int num3 = scan.nextInt();
		if (num<0 || num >100) {
			System.out.println("다시 입력해주세요.");
		}else {
		System.out.println("수학 점수 : "+ num3);
		}
		System.out.println("--------------------------");
		
		scan.close();
		
		int sum = num + num2 + num3;
		System.out.println("세 점수의 합계는 " + sum + "점 입니다.");
		
		double avg = (double)sum /3;
		System.out.println("평균은 " + avg + "점 입니다.");
		
		if (avg >= 90) {
			System.out.println("평균 90이상이므로 A 입니다.");
		} else if (avg >= 80) {
			System.out.println("평균 80이상이므로 B 입니다.");
		} else if (avg >= 70) {
			System.out.println("평균 70이상이므로 C 입니다.");
		} else {
			System.out.println("D입니다.");
		}
		
		System.out.println("----------------------------");
		
		//선생님 답!
		
//		Scanner scam = new scanner(System.in)
//		System.out.println("정수입력 (0~100) : 국어, 영어 , 수학 순으로 입력");
//		
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
//		
//		if ( kor < 0 || kor > 100) {
//			System.out.println(" 다시 입력하세요. ");
//		}
//		if (eng < 0 || eng > 100) {
//			System.out.println(" 다시 입력하세요. ");
//		}
//		if ( math < 0 || math > 100) {
//			System.out.println(" 다시 입력하세요. ");
//		}
		
//		int sum = kor + eng + math;
//		double avg = sum / 3.0;
//		System.out.println("합계 : " +sum + "평균 : " avg);
//		char result = 'D';
//		if (avg > 100 || avg < 0) {
//			System.out.println(" 잘못된 성적입니다.");
//		} else if (avg >= 90) {
//			result = 'A';
//		} else if (avg >= 80) {
//			result = 'B';
//		} else if ( avg >= 70) {
//			result = 'C';
//		} else {
//			result = 'D';
//		}
//		System.out.println("결과 : "+ result);
	
	
	}

}
