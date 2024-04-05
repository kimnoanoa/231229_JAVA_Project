package day05;

public class Array03 {

	public static void main(String[] args) {
		//
		
		int arr[] = new int [] {10,56,78,89,48,62,93,50};
		// 합계, 평균, 
		// 최대값, 최소값 출력
		// math.max math.min
		// if
		
		int sum = 0;
		
		for (int i = 0; i< arr.length;i++) {
			sum = sum+arr[i];
			
		}
			
		System.out.println("합계는 : " + sum);
		
		double avg = sum / (double)arr.length;
		
		System.out.println("평균은 : " + avg);
		
		// 성적 데이터 : (0~100)
		int max = 0; //가장 큰 값을 넣기 위한 변수
		int min = 100; // 가장 작은 값을 넣기 위한 변수
		
		
		for (int i = 0; i < arr.length; i++) {
			
		if ( max < arr[i]) {
			max = arr[i];
		}
		if (min > arr[i]) { // else if 를 설정하면 위 if에서 끝나버려서 안 됨.
				min = arr[i];
			
		}

		max = Math.max(max,arr[i]);
		min = Math.min(min,arr[i]);
		}
		
		
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		
		
	
		

	}

}
