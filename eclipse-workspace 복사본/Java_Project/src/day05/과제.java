package day05;

public class 과제 {

	public static void main(String[] args) {
		// 		
		// 합계, 평균, 
		// 최대값, 최소값 출력
		// math.max math.min
		// if
		
		int arr[] = new int [] {10,56,78,89,48,62,93,50};
		
		int sum = 0;
		int a = arr[0];
		int b = arr[0];
		
		for (int i = 0; i< arr.length;i++) {
			sum = sum+arr[i];
			a = Math.max(arr[i], a);
			b = Math.min(arr[i], b);
			
		}
			
		System.out.println("합계는 : " + sum);
		
		double avg = sum / (double)arr.length;
		
		System.out.println("평균은 : " + avg);
		
		System.out.println("최대값은 : " + a);
		System.out.println("최소값은 : " + b);
	}

}
