package day11;

import java.util.Scanner;

public class Card {
	
	public static void main (String[] args) {

/* 1장의 카드를 생성하기 위한 클래스
 * - 숫자 : 1~10 , J(11),Q(12),K(13)
 * - 모양 : ♥,◆,♣,♠
 * - 한 장의 카드를 출력하는 기능 print() => ♥1
 *  ◆12 => ◆Q %2 => ♥2 , &15 = > ♥1
 * */
/* 클래스의 구성
 * - 멤버변수 : 모양(shape), 숫자(num) => private, getter/setter 생성
 * - 메서드 : print()
 * - 생성자 : 기본 생성자만 생성 => ♥1
 * 
 * */
		
		

	}
	
	
	
	private int num;
	private char shape;
	
	// 생성자
	
	public Card() {
		this.shape = '♥';
		this.num =1;
	}
	
	public void num() {
		
		
	}
	
	// print
	
	public void print() {
		System.out.print(shape);
//		
//		if (shape == '♥') {
//			System.out.print(shape);
//		}else if (shape == '◆') {
//			System.out.print(shape);
//		}else if ( shape == '♣') {
//			System.out.print(shape);
//		}else if (shape == '♠') {
//			System.out.print(shape);
//		}else {
//			System.out.print('♥');
//		}
//		
//		
//	
		if (num == 11) {
			System.out.print("J ");
		}else if (num == 12) {
			System.out.print("Q ");
		}else if (num == 13) {
			System.out.print("k ");
		}else if(num > 13) {
			System.out.print("1 ");	
		}else {
			System.out.print(num+ " ");
		}
//	System.out.println();	
//	
	}
	
	public int getNum() {
		return num;
	}
	// 외부의 값( 매개변수) 으로 내부 변수 (멤버변수) 를 변경할 때 사용하는 메서드
	public void setNum(int num) { // 1~13까지만 내 숫자, 그 외는 1로 설정
		if (num > 0 && num <= 13) {
		this.num = num;
		}else {
			this.num = 1;
		}
	}
	public char getShape() {
		return shape;
	}
	
	public void setShape(char shape) { // ♥,◆,♣,♠ 아니면 전부 하트
		if (shape == '♥') {
		this.shape = shape;
	}else if (shape == '◆') {
		this.shape = shape;
	}else if ( shape == '♠') {
		this.shape = shape;
	}else if (shape == '♣' ) {
		this.shape = shape;
	}else {
		this.shape = '♥';
	}
//		
//		switch (shape){
//		
//		case '♥':case '◆':case'♣':case'♠':
//		this.shape = shape;
//		break;
//		default :
//			this.shape = '♥';
//	}

}
}
