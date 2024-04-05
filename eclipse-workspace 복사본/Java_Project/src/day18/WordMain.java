package day18;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		// 단어장 프로그램
		/* 1. 단어등록 | 2.단어검색| 3.단어수정 | 4.단어출력 | 5.단어삭제 | 6.종료
		 * WordManager 클래스를 생성하여 메서드 구현
		 * map 을 이용해서 단어를 등록
		 * 기본단어 등록 (5개)
		 * main 에서는 메뉴가 반복실행되도록 do-while
		 * 
		 * 
		 * */
		
//		HashMap<String,String> map = new HashMap<>();
		WordManager wm = new WordManager();
		wm.ffffMap(); // 기본값 추가
		
		Scanner scan = new Scanner(System.in);
		
		
		int menu = 0;
		
		do {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 단어등록 | 2.단어검색| 3.단어수정 | 4.단어출력 | 5.단어삭제 | 6.단어파일출력 | 7.종료");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("단어를 등록합니다.");
				wm.insertWord(scan);
				break;
			case 2 : 
				System.out.println("단어를 검색합니다.");
				wm.searchWord(scan);
				break;
			case 3 :
				System.out.println("단어를 수정합니다.");
				wm.correctWord(scan);
				break;
			case 4:
				System.out.println("단어를 출력합니다.");
				wm.printWord();
				break;
			case 5:
				System.out.println("단어를 삭제합니다.");
				wm.deleteWord(scan);
				break;
			case 6:
				System.out.println("단어파일을 출력합니다.");
				wm.printFile();
				break;
			case 7:
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
					break;
				
			}
			
			
		}while( menu != 7);
		
		
		
		scan.close();
	}

}
