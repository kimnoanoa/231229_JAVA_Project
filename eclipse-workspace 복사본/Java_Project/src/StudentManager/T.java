package StudentManager;

public class T {

	public static void main(String[] args) {
		// 학생/ 수강관리 프로그램
		/* subject class : 하나의 수강과목정보를 저장하는 클래스
		 * - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표, 강의장
		 * - 멤버변수, 생성자, getter/setter, toString
		 * 
		 * - student class : 한 학생의 정보를 저장하는 클래스
		 * -학번, 이름, 나이, 전화번호, 주소 , 수강과목
		 * - 멤버변수, 생성자, getter/setter, toString
		 * 멤버변수에 학생이 듣고자 하는 과목을 저장 . Subject[]
		 * - 메서드: 수강과목 추가메서드 , 삭제메서드 ,출력메서드 , 학생정보 출력메서드
		 * 
		 * = Program interface : StudentManager class의 운영 메서드 정리
		 *   -학생리스트 출력기능 void printStudent();
		 *   -학생 등록기능 void insertStudent(Scanner scan);
		 *   -학생검색기능 void searchStudent(Scanner scan);
		 *   -수강신청기능 void registerSubject(Scanner scan);
		 *   -수강철회기능 void deleteSubject(Scanner scan);
		 *   
		 * 
		 * -studentManager class : 실제 객체들을 우영하는 클래스 implements program 인터페이스
		 * 
		 * -studentMain class : 객체를 생성하고 화면에 출력하는 클래스
		 * - menu :
		 *  1.학생등록 | 2.학생리스트출력 | 3.학생검색(학생정보, 수강정보)
		 *  4.수강신청 | 5. 수강철회 | 6.종료 (do-while문)
		 *  
		 * 
		 * */
	}

}
