package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목과 점수를 입력받아(Scanner) map 에 저장 후 출력
		/* 합계. 평균 출력
		 * 종료 키워드가 나올때까지 반복(1 = 계속, 0 = 종료 키워드)
		 * 과목과 점수를 입력해주세요 > 
		 * 국어 89
		 * 수학 87
		 * 0 종료
		 * map 으로 저장 후 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int sum = 0;
		int count = 0;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		System.out.println("과목과 점수를 입력하세요>>");
		do {
			System.out.println("1.입력 | 0.종료");
			menu = scan.nextInt();
			
			switch (menu){
			case 1: 
				System.out.println("과목과 점수를 입력하세요>>");
				String a = scan.next();
				int a1 = scan.nextInt();
				map.put(a, a1);
				sum = sum + map.get(a);
				count++;
				break;
			case 0 :
				System.out.println("종료합니다.");
				break;
				default:
			}
			
			
		}while(menu == 1);
		
//		Iterator <String> it = map.keySet().iterator();
//		while (it.hasNext());
//		String subject = it.next();
//		int score = map.get(subject);
//		
//		sum+= score;
//		System.out.println(subject + " : " + score);
		
		
		System.out.println(map);
		System.out.println("과목 총 점수 합계는 : " + sum);
		System.out.println("평균 : " + sum/(double)count);
		
		// map.size
		
		
		
		
		scan.close();

	}

}
