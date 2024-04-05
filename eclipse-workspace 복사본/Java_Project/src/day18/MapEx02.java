package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		// 단어장
		/* 단어 5개를 스캐너로 입력받아 콘솔에 출력하는 기능
		 * -- 단어장 --
		 * map 에 저장 후 출력
		 * 
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		HashMap <String,String> map = new HashMap<>();
		int a = 0;
		
		do {
			System.out.println("1.계속 입력 | 2.종료");
			a =scan.nextInt();
			switch(a) {
			case 1: 
				System.out.println("단어와 뜻을 입력하세요.");
				map.put(scan.next(),scan.next());
				break;
			case 2 : 
				System.out.println("종료합니다.");
				break;
			}
		}while (a == 1);
		
		
		System.out.println("--단어장--");
		for (String s : map.keySet()) {
			System.out.println(s + " : " + map.get(s));
		}
		scan.close();

	}

}
