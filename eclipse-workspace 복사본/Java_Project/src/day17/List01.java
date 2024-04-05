package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		// 하루 일과를 저장하는 리스트 생성.
		/* 출력 for, 향상 for, iterator 출력
		 * 
		 * import 단축키 ctrl + shift + o
		 * */
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("산책");
		a.add("점심");
		a.add("영화");
		a.add("드라이브");
		a.add("넷플릭스");
		
		for (int i = 0 ; i < a.size();i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
		
		for (String asd : a) {
		}
		System.out.println(a);
		
		Iterator<String> it = a.iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+ " ");
		}
		System.out.println();
		
		Collections.sort(a);
		System.out.println(a);
		
		a.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 (크다/작다를 이용) , -,+ 의 값이 출력
				// 문자는 compareTo 메서드 활용하여 정렬
				// o1.cmpareTo(o2) :오름차순
				return o2.compareTo(o1); //내림차순
			}
			
		});
		System.out.println(a);

	}

}
