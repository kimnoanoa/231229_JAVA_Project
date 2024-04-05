package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// 중복 저장 x
		/* set 에 로또번호 6개 생성 후 출력
		 * 랜덤번호 1~45
		 * */
		
		HashSet<Integer> set = new HashSet<>();
		
		// 6번생성 안됨. 중복발생 가능성
		// set이 6개 찰 때까지.
		
		int random = new Random().nextInt(45)+1;
		//mathRandom 이랑 같은거
		
		
		while(set.size() != 6) {
//		for (int i = 0; i < 6; i++) {
			int a = (int)(Math.random()*45)+1;
			set.add(a);
//		}
		}
		System.out.println(set);
		System.out.println("-----------------");
		
		// TreeSet : set 중에서 정렬이 되는 set 
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		
		
		while(treeSet.size() <6) {
			int random1 = new Random().nextInt(45)+1;
			treeSet.add(random1);
			
		}
		System.out.println(treeSet);
		
		// first() : 가장 앞에 있는 값 /  last() : 가장 뒤에 있는 값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		// headSet : 지정한 값보다 작은 값
		// tailSet : 지정한 값보다 큰 값
		
		System.out.println(treeSet.headSet(15));
		System.out.println(treeSet.tailSet(15));
		
		//subSet : 검색 범위 지정 뒤쪽 값은 미포함
		System.out.println(treeSet.subSet(15,30)); //15~30사이이지만 15포함, 30미포함
		
	}

}
