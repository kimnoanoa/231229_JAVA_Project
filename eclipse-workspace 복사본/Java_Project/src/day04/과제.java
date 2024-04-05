package day04;

import java.util.Scanner;

public class 과제 {

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
		
		int distance = 30; // 총 거리
		int move = 0 ; // 이동한 거리
		int count= 0; //던진 횟수 
		System.out.println("총 이동 거리 : "+ distance);
		
	
		while(move <= distance)	{
			
			int a = (int)(Math.random()*6)+1;
			move = move+ a;
			count++;
			int sum = (distance - a);
			sum = sum - a;
			System.out.println("랜덤 주사위를 생성합니다.");
			
			System.out.println("주사위 :" + a);
			
			System.out.println(a + "칸 전진."+ sum + " 칸 남았습니다~");
			
			
				
			} 
			
			
		System.out.println("게임 종료! 주사위를 총 "+ count + " 회 던졌습니다.");
		
		scan.close();
		

	}

}
