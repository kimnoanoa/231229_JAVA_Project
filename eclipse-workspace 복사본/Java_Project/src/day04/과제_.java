package day04;

import java.util.Scanner;

public class 과제_ {

	public static void main(String[] args) {
		// 주사위 게임
		/* 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성 (1~6)
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 20칸 남았습니다.
		 * 30칸이 되면 도착~~!!
		 * 총 이동 횟수: 10번 => 주사위를 던진 횟수
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0; //주사위
		int count = 0;
		int distance = 30; // 총 거리
		
		System.out.println("게임 시작!");
		while (num <= distance) {
			System.out.println("랜덤 주사위를 생성합니다.");
			int a = (int)(Math.random()*6)+1;
			System.out.println("랜덤 주사위 : "+a);
			count++;
			num = num+a;
			System.out.println(a + "칸 전진 ." + (distance - num) + "칸 남았습니다.");
			if ((distance - num) <=0) {
				System.out.println("게임이 종료되었습니다.");
			}
			
		}
		System.out.println("도착! 총 " + count + "회 던졌습니다!");
		
		scan.close();
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		int random = 0; // 주사위값
//		int sum = 0; // 거리 누적 값
//		int coun = 0; // 주사위 던진 횟수 누적
//		int last = 30; // 최종 목표 이동 수
//		
//		System.out.println("게임 시작!");
//		while (sum < last ) { // 거리 누적값이 최종 목적지보다 작다면
//			scan.nextLine(); // enter값을 이용하여 주사위를 던질 수 있게 해주는 역할
//			random = (int)(Math.random()*6)+1; // 1부터 6까지 랜덤수 저장
//			// 발생값 거리합산
//			sum += random;
//			count++;
//			System.out.println("주사위 : "+ random);
//			System.out.println(random + " 칸 전진 =>  " + (last - sum) + " 칸 남았습니다.");
//		}
//		System.out.println("도착! 총 이동 횟수는 " + coun + " 회 입니다.");
//		
//		
//		
//		scan.close();
//		

	}



	}

