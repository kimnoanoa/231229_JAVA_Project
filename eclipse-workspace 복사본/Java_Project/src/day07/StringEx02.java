package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		// 5개의 파일명이 주어졌을 때
		/* 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 * */
		
		String [] file = {"이것이자바다.Java","Java의 정석.Java","String.jpg","String 메서드.txt","array.txt"};
		String a = "Java의 정석.Java";
		//Java
		//String
		//txt
		// 결과가 없다면 검색결과가 없습니다. 출력
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.println("검색어를 입력하세요.");
		String ab = scan.next();
		
		for (String s : file) {
			
			if (s.contains(ab)) {
				System.out.println(s);
				count++;
			}
		}if (count == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
		
		
		
		scan.close();
		
		
	}

}
