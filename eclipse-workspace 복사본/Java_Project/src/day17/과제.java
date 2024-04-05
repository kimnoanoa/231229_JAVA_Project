package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 숫자를 스캐너로 입력받아 입력받은 숫자를 list로 구성하고, 출력
		// 합계를 출력
		/* 입력값 : 45,78,89,97,68,57,48 => String 으로.
		 * list 에 넣고, 출력 => 합계(인원수) 출력
		 * 70점 이상 점수 개수 출력
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
//		String num = "45,78,89,97,68,57,48";
		int sum = 0;
		int cnt = 0;
		String a = null;
		int b = 0;
		
		
		ArrayList<String> asd = new ArrayList<>();
		
		System.out.println("점수를 입력하세요.");
		do {
			System.out.println("1. 입력 | 0. 종료");
			b = scan.nextInt();
			
			switch (b){
			case 1 :
				System.out.println("점수를 입력하세요.");
				asd.add(scan.next());
				break;
			case 0: 
				System.out.println("종료합니다.");
				break;
				default:
			}
			
		}while (b == 1);
		
		for (int i = 0; i < asd.size(); i++) {
			sum+= Integer.parseInt(asd.get(i));
			if (Integer.parseInt(asd.get(i)) >= 70) {
				cnt++;
			}
		}
	
			
		
		
		
		System.out.println("점수 합계 : " + sum);
		System.out.println("총 인원 수 :" + asd.size());
		System.out.println("70점 이상 학생 수 : "+ cnt);
		
		
		
		
		
		scan.close();

	}

}
