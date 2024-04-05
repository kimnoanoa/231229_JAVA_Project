package day06;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1부터 50까지의 랜덤수를 10개 생성하여 배열에 저장하고 출력
		// 오름차순 정렬후 출력
		
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		System.out.println("랜덤 수를 생성합니다.");
		
			
		
		for (int i = 0 ; i <arr.length ; i++) {
			arr[i] =(int)(Math.random()*50)+1;
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("------정렬------");
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i +1 ; j < arr.length;j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
		
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=i+1;
//			int random = (int)(Math.random()*50)+1;
////			int temp = arr[i];
////			arr[i] = arr[random];
////			arr[random] = temp;
//			
//		}
		
//		
//		for (int tmp : arr) {
//			System.out.print(tmp + " ");
//		}
//		
		System.out.println();
		
		scan.close();

	}

}
