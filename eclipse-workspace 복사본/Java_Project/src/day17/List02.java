package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		// 두 개의 배열을 입력받아서 하나로 합치는 ArratList 생성
		
		/* 정렬(오름차순) 하여 출력
		 * 
		 * */
		
		String arr1[] = new String[] {"a","c","f","b"};
		String arr2[] = new String[] {"d","g","h","k"};
		
		ArrayList<String> a = new ArrayList<String>();
		
		for (int i = 0; i < arr1.length; i++) {
			a.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			a.add(arr2[i]);
		}
		
		// while 문 활용
//		int cnt = arr1.length + arr2.length;
//		int i = 0, j = 0;
//		
//		while (cnt > a.size()) {
//			if (i < arr1.length) {
//				a.add(arr1[i]);
//				i++;
//				
//			}if (j < arr2.length) {
//				a.add(arr2[j]);
//				j++;
//			}
//		}
//		System.out.println(a);
		
		
		System.out.println(a);
		
		System.out.println("오름차순정렬");
		
		Collections.sort(a);
		System.out.println(a);
		
		System.out.println("내림차순정렬");
		
		a.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
			
		});
		System.out.println(a);
		

	}

}
