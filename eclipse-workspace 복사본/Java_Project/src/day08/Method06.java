package day08;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int []{3,14,4,2,52,26,8,9,7,162,17,13,123,144,15};
		
		printArray(arr);
		System.out.println("-----정렬 후-----");
		sortArray(arr);
		printArray(arr);
		System.out.println();
		System.out.println("----배열 리턴 후 출력----");
		
		int arr1[] = sortArray1(arr);
		printArray(arr1);
		
		printArray(sortArray1(arr));
		
		System.out.println("------------랜덤배열-------------");
		printArray(sortArray1(randomArray()));
	
	
	// 주어진 정수 배열을 콘솔에 출력하는 메서드
	// 매개변수 : 배열
	// 리턴 타입 : void
	// 메서드명 : printArray
	// 5개씩 한줄에 나열
	}

	public static void printArray(int arr[]) {
		for (int i = 0 ; i <arr.length ; i++) {
			if (i % 5 == 0 && i != 0) {
				System.out.println();
		}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
		
	
	
	/* 배열이 주어지면 배열을 오름차순 정렬
	 * 매개변수 : 배열
	 * 리턴타입  : void
	 * 메서드명 : sortArray
	 * */
	
	public static void sortArray(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr [i] = arr[j];
					arr [j] = tmp;
				}
			}
		}		
	}
	
	// 정렬 후 배열을 리턴
	
	public static int[] sortArray1(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr [i] = arr[j];
					arr [j] = tmp;
				}
			}
		}return arr;
		}		
	
	/* randomArray
	 * 배열을 생성하여 (10개) 랜덤값 (1~50) 채우고
	 * 해당 배열을 리턴
	 * 리턴 타입 = 배
	 * */
	
	public static int[] randomArray() {
		int arr[] = new int[10];
		for (int i = 0 ; i <arr.length ; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}	
		return arr;
	}
	
}
	

