package day06;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 10개의 배열을 담을 수 있는 arr배열 생성
		// 1~ 10까지 값 입력하고 출력
		
		int arr[] = new int [10];
		
		for (int i = 0 ; i <arr.length ; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		// 배열을 섞는 코드
		// 랜덤 번지를 선택해서 순차적으로 하나씩 교환
		// (int)(math.random()*10)+0 // 0부터 10의 랜덤수를 출력
		// max = 최종번지갯수, min = 첫번지
		// 교환 코드 
		// [i] [i+1]
//		int temp = arr[i];
//		arr[i] = arr[i+1];
//		arr[i+1] = temp;
		
		int min = 0;
		int max = arr.length;
		for(int i = 0; i < arr.length ; i++) {
			int random = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr [i] = arr[random];
			arr[random] = temp;
			
		}
		System.out.println("-------섞은 후 값 보기-------");
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		
		// 섞은 값을 원래대로 정리(정렬)
		// 작은 수부터 정리 = 오름차순정렬
		// 큰 수부터 정리 = 내림차순정렬
		// 3 2 5 6 7 1 9 4 10 8
		// 1 3 5 6 7 2 9 4 10 8 = 1차 패스
		// 1 2 5 6 7 3 9 4 10 8 = 2차 패스
		// 1 2 3 6 7 5 9 4 10 8 = 3차
		// 1 2 3 4 7 6 9 5 10 8 = 4차
		// 1 2 3 4 5 7 9 6 10 8 = 5차
		// 1 2 3 4 5 6 9 7 10 8 = 6차
		// 1 2 3 4 5 6 7 9 10 8 = 7차
		// 1 2 3 4 5 6 7 8 10 9 = 8차
		// 1 2 3 4 5 6 7 8 9 10 = 9차
		
		System.out.println();
		System.out.println("----------정렬 후----------");
		for(int i = 0; i < arr.length-1 ; i++) {
			for (int j = i + 1 ; j < arr.length; j++) {
				if(arr[i] > arr[j]) { // >: 오름차순 , <:내림차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		

	}

}
