package day08;

public class 과제_쌤답 {

	public static void main(String[] args) {
		// 
		
		
		int lotto [] = new int [7];
		int user[] = new int[6];
		
		randomArray(lotto);
		randomArray(user);
		System.out.println("---당첨번호---");
		printArray(lotto);
		System.out.println("---사용자번호---");
		printArray(user);
		int rank = lottoRank(lotto,user);
		if (rank == -1) {
			System.out.println("꽝입니다.");
		}else {
			System.out.println(rank + "등 당첨입니다.");
		}

	}
	
	//1~45까지 랜덤수생성( 중복되면 안됨)
	
	/* 매개변수 : 배열 => int arr[]
	 * random == arr[i] false 면 추가
	 * 
	 * */
	
	public static void randomArray(int arr[]) {
		// 배열의 값을 받아 배열에 랜덤 값 중복없이 채우기
		int cnt = 0; //while 에서 i 역할을 할 변수
		while (cnt < arr.length) {
			int r = (int)(Math.random()*45)+1;
			if(!isContain(arr,r)) {
				arr[cnt] = r;
				cnt++;
			
				
			}
		}
	}
		
		public static void printArray(int arr[]) {
			if (arr.length == 7) {
				
			for(int i = 0; i < arr.length-1 ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("[" + arr[6] + "]");
		
		} else {
			for (int i = 0; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
		}
		}
			System.out.println();
		}
		
	
	
	/* 중복 확인 메서드
	 * 매개변수 : 배열, 값
	 * 있으면 true 없으면 false
	 * 리턴 타입 : boolean
	 * 메서드명 : isContain
	 * 
	 * */
	
	public static boolean isContain(int arr[],int random) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == random) {
				return true;
			
				
			}
		}
		return false;
	}
	// 등수 확인 메서드
	/* 매개변수 lotto[] / user[]
	 * int
	 * lottoRank
	 * 당첨기준 
	 * 유저 번호 기준 6개일치 = 1등 /5개일치 ,보너스번호 = 2등/ 5개일치 = 3등 / 4개일치 = 4등/ 3개일치 = 5등
	 * 나머지는 
	 * */
	
//	public static void lottoRank(int arr[]) {
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//		count++;
//			
//		switch (count) {
//		case 1 : 
//			System.out.println("꽝");
//			break;
//		case 2 : 
//			System.out.println("꽝");
//			break;
//		case 3 : 
//			System.out.println("5등");
//			break;
//		case 4:
//			System.out.println("4등");
//			break;
//		case 5 : 
//			System.out.println("3등");
//			break;
//		case 7 : 
//			System.out.println("1등");
//			break;
//			default : 
//				System.out.println("2등");
//	}
//		}
//	
//	} 
	
	public static int lottoRank(int lotto[], int user[]) {
		// lotto = 7 , user = 6
		// 둘은 개수가 다르기 때문에 배열이 바뀌어서 들어온다면
		if (lotto.length <= user.length) {
			return -1;
		}
		int count = 0; // 일치하는 개수를 세기 위한 변수(보너스 제외)
		for (int i = 0 ; i < user.length; i++) { //6번지까지만! 보너스 제외시키기 위해
			if (isContain(user,lotto[i])) {
				count++;
				
			}	
		}
		switch (count) {
		case 6 : return 1;
		case 5 :
			if (isContain(user,lotto.length-1)) {
			return 2;
			}else {
				return 3;
			}
		case 4 : return 4;
		case 3 : return 5;
		default : 
			return -1;
		}
	}
				
	
		      
		
}
	

