package day06;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int [] {1,2,3,4}; //new 를 통해서 객체를 생성함
		int arr1[] = arr; 
		int arr2 [] = new int [5];
		
		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(arr2);
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// arr의 값을 arr2로 복사
		
		for (int i = 0 ; i < arr.length; i++) {
			arr2[i] = arr[i]; // +1 하면 한 번지씩 밀려서 들어감
			
		}
		for(int i = 0; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		//arr 를 arr3으로 복사
		//arr 3 은 10개의 데이터를 생성할 수 있는 배열
		
		System.out.println();
		
		int arr3[] = new int [10];
		
//		for (int i = 0; i < arr.length; i++) {
//			arr3[i] = arr[i];
//		}
//		
		
		// system.arraycopy (이전배열, 시작번지, 새배열, 시작번지, 개수)
		
		System.arraycopy(arr2, 0, arr3, 3, arr.length);

		for (int a : arr3) {
			System.out.print(a + " ");
		}
	}

}
