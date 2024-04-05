package day01;

public class 과제 {

	public static void main(String[] args) {
		// 국어, 영어, 수학의 점수합계와 평균을 출력하세요 
		/* 평균은 소수점을 살려서 출력
		 * */
		//조건선택연산자를 이용하여 평균이 80이상이면 합격, 아니면 불합격을 출력하세요
		
		int kor = 82;
		int eng = 95;
		int math = 78;
		int sum = kor + eng + math;
		
		System.out.println("국어 점수 : "+ kor);
		System.out.println("영어 점수 : "+ eng);
		System.out.println("수학 점수 : "+ math);
		System.out.println("세 과목 점수 합계는 " + sum + " 입니다.");
		//System.out.println( sum / 3.0 );
		
		
		System.out.println("세 과목 평균 점수는 " + sum / 3.0 + " 입니다.");
		
		String result = ((sum >= 80)? "합격입니다." : " 불합격입니다.");
		System.out.println( "평균은 " + (sum / 3.0) + "점이므로 " + result );
		
		// double avg = (double) sum / 3;
		
		// 조건선택 연산자 => if 문으로 변경
//		if (조건식 ) {
//			처리문;
//		}else {
//			처리문;
//		}
//		if (avg >= 80) {
//			System.out.println("결과 :합격");
//	
//		}else {
//			System.out.println("결과 : 불합");
//		}
	}

}
