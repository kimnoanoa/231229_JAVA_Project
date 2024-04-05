package day18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WordManager {
	
	String word = null;
	String searchword = null;
	String mean = null;
	HashMap<String,String> map = new HashMap<>();
	
	
	
	public void ffffMap() {
		map.put("pig","돼지");
		map.put("wildboar","멧돼지");
		map.put("rabbit","토끼");
		map.put("cat","고양이");
		map.put("dog","개");
		
		
	}
	

	public void insertWord(Scanner scan) {
		System.out.println("등록할 단어와 의미를 입력하세요.");
		
		System.out.println("단어 입력 >");
		word = scan.next();
		System.out.println("의미 입력 >");
		mean = scan.next();
		
		map.put(word, mean);
		
		System.out.println("단어가 등록되었습니다.");
		
		
		
		
}

	public void searchWord(Scanner scan) {
		

		
		System.out.println("---검색할 단어 >> ");
		searchword = scan.next();
		if(map.get(searchword)== null) {
		System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println(searchword + " : " + map.get(searchword));
		}
		
//		if(map.containsKey(searchword)) {
//			System.out.println("---검색 결과---");
//			System.out.println(searchword + " : " + map.get(searchword));
//		}
//	
		
	}
		
	
	
	public void deleteWord(Scanner scan) {
		System.out.println("---삭제할 단어>> ");
		searchword = scan.next();
		map.remove(searchword);
		System.out.println("삭제되었습니다.");
		
		
	}
	
	public void printWord() {
		System.out.println("---전체 단어---");
//		for (String key : map.keySet()) { 
//			System.out.println(key + " : " + map.get(key));
//		}
//			return;
//		}
		int cnt = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			word = it.next();
			mean = map.get(word);
			cnt++;
			System.out.println(cnt + ") " + word + " : " + mean);
					
		}
		
}
	
	public void correctWord(Scanner scan) {
		// map 은 set이 없기 때문에 remove 해서 put
		// key 중복불가능. put => 덮어쓰기
		System.out.println("---수정할 단어>> ");
		word = scan.next();
		if (map.get(word) == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			map.remove(word);
			System.out.println("수정할 단어와 의미를 입력하세요.");
			System.out.println("단어 입력 >");
			word = scan.next();
			System.out.println("의미 입력 >");
			mean = scan.next();
			
			map.put(word, mean);
			
			System.out.println("단어가 수정되었습니다.");
			
		}
		
		
	}


	public void printFile() throws IOException {
		
		// StringBuffer 객체
		// .append : 기존 String에 데이터 추가 가능.
		
		FileWriter fs = new FileWriter("Word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		// sb.append : 기존 String 에 데이터 추가
		String data = null;
		sb.append("-----단어장-----");
		sb.append("\r\n");
		
		int cnt = 0;
		for(String key : map.keySet()) {
			sb.append(key + " : " + map.get(key));
			sb.append("\r\n");
			cnt++;
				
			
		}
		data = sb.toString(); //StringBuffer객체여서 파일추가가 안됨. String객체로 변환해야함
		System.out.println(data);
		bw.write(data);
		if(bw!= null) {
			bw.close();
		}
		
		if( fs != null) {
			fs.close();	
		
		}
		
	}
		
}