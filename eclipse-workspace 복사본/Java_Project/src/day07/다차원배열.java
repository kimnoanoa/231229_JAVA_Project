package day07;

public class 다차원배열 {

	public static void main(String[] args) {
		// 2차원 배열
		/* 10 20 30 40 50
		 * 60 70 80 60 53
		 * 자료형 배열명[][]= new 자료형[5][3]; //5는 행 개수 3은 열 개수
		 * 
		 * */
		
		int arr[][]= new int [5][3];
		
		int cnt = 1;
		for( int i = 0; i <arr.length ; i++) { //0번지부터 4번지까지 총 5개 횡 반복
			for(int j = 0; j< arr[0].length ; j++) {
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 한 행마다 줄바꿈
		}

	}

}
