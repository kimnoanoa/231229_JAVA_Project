package 시험1;

public class Card2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card2 c = new Card2();
		CardPack2 cp = new CardPack2();
		
	
		
	}
	
	private int num;
	private char shape;
	
	public Card2() {
		this.num = 1;
		this.shape = '♥';
		
	}
	
	public void print() {
		System.out.print(shape);
		if (num == 11) {
			System.out.print("J ");
		}else if (num == 12) {
			System.out.print("Q ");
		}else if (num == 13) {
			System.out.print("k ");
		}else if(num== 1) {
			System.out.print("A ");	
		}else {
			System.out.print(num+ " ");
		}
//		System.out.println();
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num > 0 && num <= 13) {
			this.num = num;
			}else {
				this.num = 1;
			}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
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
	}
	
	

}
