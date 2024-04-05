package day08;

public class Method07 {

	public static void main(String[] args) {
		// 로또 번호 생성
		
		int lotto[] = new int [7]; //당첨번호
		
		int user[] = new int [6]; //사용자 로또번호
		
		System.out.println("로또 당첨 번호");
		sum(lotto);
		System.out.println();
		System.out.println("사용자 로또 번호");
		usu(user);
		System.out.println();
		
		
		
		
		
	}
	
	/* 배열을 매개변수로 받아서 1~45까지 랜덤수를 채워서 생성
	 * 같은 수 나오면 안됨.
	 * 배열을 매개변수로 받아 배열을 출력하는 메서드
	 * 
	 * */
	
	// 중복되어있는지 확인하는 메서드
	// 매개변수 : 배열을 주고 값을 하나 줌.
	// 해당값이 배열에 있는지 체크. 있으면 True 없으면 false
	
	public static void sum(int arr[]) {
		
		int random = 0;
		for (int i = 0; i < arr.length  ; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for (int j = 1; j < i; j++) {
				if (arr[i] ==arr[j]) {
					j--;
				}
			}
			System.out.print(arr[i]+ " ");
		} 
			
	} 
	
	
	public static void usu(int arr[]) {
		
		for (int i = 0; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*45)+1;
			for (int j = 1; j < i ; j++) {
				if (arr[i] == arr[j]) {
					j--;
					break;
				}
			}
			System.out.print(arr[i] + " ");
			
		}
	}
	public static boolean isContain(int arr[],int random) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == random) {
				return true;
			
				
			}
		}
		return false;
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
	
	
	

}
