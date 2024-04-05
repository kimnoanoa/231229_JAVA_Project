package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 야구게임
		/* 컴퓨터가 세 자리의 숫자를 생성(각 자리수는 1~9까지의 수) => 배열로 랜덤저장 (중복 불가능)
		 * 유저는 세 자리의 숫자를 맞추는 게임 => 직접 입력(중복되지 않게)
		 * 자리와 숫자가 일치하면 Strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안 맞으면 out
		 * ex ) 컴퓨터 생성 번호 1 2 3
		 * 사용자 번호 : 1 7 8 => 1 Strike
		 * 사용자 번호 : 1 3 2 => 1 Strike 2 ball
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3Strike 정답.!
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		int arr [] = new int [3];
		int userArray[] = new int[3];
		
		int s = 0;
		int b = 0;
		 
		System.out.println("야구게임 시작!");
		System.out.println("컴퓨터가 세 자리의 수를 생성합니다.");
		

		for (int i = 0;  i < arr.length; i++) {
				arr[i] = (int)(Math.random()*9)+1;
				for (int j = 0 ; j < i; j++) {
					if (arr[i]==arr[j]) {
						i--;
						break;
				}
			}
		}

		System.out.println();
		
		while(true) {
			
			System.out.println("숫자를 입력해 정답을 맞춰주세요!");
			for (int i = 0; i < userArray.length; i++) {
				userArray[i]= scan.nextInt();
			}
			for (int i = 0; i< userArray.length;i++) {
				for (int j = 0; j< userArray.length; j++) {
					if(arr[i] == userArray[i] && i == j) {
						s++;
					}else if (arr[i] == userArray[i] && i!=j) {
						b++;
					}
				}
			}
			if (s == 3 ) {
				System.out.println(s + "Strike. 정답입니다.");
			} else if (s == 0 && b ==0) {
				System.out.println("out!");
			}else {
				System.out.println(s + "strike");
				System.out.println(b + "ball");
			
			
		}
			
			scan.close();
		}
		
		
		}

	public static boolean isContain(int arr[],int random) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == random) {
				return true;
			
				
			}
		}
		return false;
	}

}

