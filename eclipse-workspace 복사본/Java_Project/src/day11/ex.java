package day11;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Card c = new Card();
//		c.setNum(12);
//		c.setShape('♠');
//		c.print();
//		
//		
//		
//		c.setNum(29);
//		c.setShape('&');
//		c.print();
		
		CardPack cp = new CardPack(); // 52장의 카드가 모두 생성됨.
		
		cp.shuffle();
		int cnt = 0;
		for(int i = 0; i < 4 ; i++) {
			for (int j = 0 ; j <13 ; j++) {
				cp.getPack()[cnt].print();
				// cp.getPack() : 카드팩 클래스 안에 있는 pack[]
				// cp.getPack()[cnt] : pack[0] => Card (멤버변수.메서드)
				cnt++; 
				}
			
			System.out.println();
			
		}
		System.out.println("--------------------");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		System.out.println(" 카드 오픈 ");
		
		player1.print();
		player2.print();
		
		cp.pick().print();
		
		
		}

}
