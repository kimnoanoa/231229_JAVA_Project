package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력.
		/* 11456 => 출력 출력 65411
		 * 각 자리의 합계도 출력 6+5+4+1+1 
		 * 19874 => 47891 4+7+8+9+1
		 * */
		
		 Scanner scan = new Scanner(System.in);
		 
		 
		 System.out.println("숫자를 입력하세요.");
		 int arr[] = new int [5];
		 int sum = 0;
		 for (int i = 0 ; i <arr.length ; i++) {
				arr[i] =scan.nextInt();
//				System.out.print(arr[i]);
				sum = sum + arr[i];
			}
		 for (int i = 0; i < arr.length -1 ; i++) {
			 for (int j = i + 1; j < arr.length; j++) {
					int temp = arr[i];
					arr [i] = arr[j];
					arr[j] = temp;
			 }
		 }
		 System.out.println();
		 System.out.println("---정렬---");
		 for (int tmp : arr) {
				System.out.print(tmp + " ");
			}
		 System.out.println();
		 System.out.println("총합 : "+ sum);
		 
		 
		 
		 scan.close();

	}

}
