package day09;

import java.util.Scanner;

public class 가위바위보게임_선생님답 {

	public static void main(String[] args) {
		// T
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임 시작!");
		
		int comNum =(int)Math.random()*3;
		System.out.println("컴퓨터 결정 완료!");
		System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
		String choice = scan.next();
		String comChoice = (comNum==0 ? "가위" : comNum == 1? "바위" : "보");
		System.out.println("컴퓨터가 고른 것 : " + comChoice + "("+comNum +")");
		System.out.println("나의 선택 : " +choice);
		
		if (comChoice.equals(choice)) {
			System.out.println("무승부");
		} else {
			if (comChoice.equals("가위")) {
				System.out.println(choice.equals("바위")? "승" : "패");
			}else if(comChoice.equals("바위")) {
				System.out.println(choice.equals("보")? "승" : "패");
			}else {
				System.out.println(choice.equals("가위")? "승" : "패");
			}
		}
		System.out.println("게임 종료.");
		
		
		
		
		
		
		scan.close();

	}

}
