package day12;

import java.util.Arrays;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student qwe [] = new Student[5];
		System.out.println("--------[정보]--------");
		
		Student ez1 = new Student("김노아","26","991122","010-4556-6543");
		System.out.println(ez1);
		ez1.setG("인천");
		ez1.printAcademy();
		ez1.Student1("자바", "1개월");
		ez1.Student1("파이썬", "3개월");
		ez1.Student1("빅데이터", "2개월");
		ez1.Student1("html", "1개월");
		ez1.Student1("C", "4개월");
		ez1.PrintSb();
		ez1.Student1("자바스크립트", "1개월");
		
		
		
		
		Student ez2 = new Student("홍길동","30","951023","010-2345-6789");
		System.out.println(ez2);
		ez2.setG("강남");
		ez2.printAcademy();
		ez2.Student1("파이썬", "3개월");
		ez2.Student1("빅데이터", "2개월");
		ez2.Student1("html", "1개월");
		ez2.Student1("C", "4개월");
		ez2.PrintSb();
		
		Student ez3 = new Student("송재림","31","940521","010-2351-2463");
		System.out.println(ez3);
		ez3.setG("부산");
		ez3.printAcademy();
		ez3.Student1("html", "1개월");
		ez3.PrintSb();
		
		Student ez4 = new Student("임시완","30","950228","010-1234-5678");
		System.out.println(ez4);	
		ez4.setG("경기");
		ez4.printAcademy();
		ez4.Student1("자바", "1개월");
		ez4.Student1("파이썬", "3개월");
		ez4.PrintSb();
				
		Student ez5 = new Student("차은우","33","920724","010-2312-5246");
		System.out.println(ez5);
		ez5.setG("잠실");
		ez5.printAcademy();
		ez5.Student1("C", "4개월");
		ez5.Student1("자바스크립트", "1개월");
		ez5.PrintSb();
		
		
		
		qwe[0] = ez1;
		qwe[1] = ez2;
		qwe[2] = ez3;
		qwe[3] = ez4;
		qwe[4] = ez5;
		
	}

}


/* - 학생 정보를 관리하기 위한 클래스
 * - 학생의 데이터를 관리하기 위한 기본 정보
 * - 이름,생년월일,전화번호,나이 (멤버변수)
 * - 학원정보 : 학원명 "EZEN"(final static), 지점
 * - 수강 정보 : 수강과목, 기간 (String)
 *  => 여러 과목을 들을 수 있음 (여러과목을 수강하기 위해서는 배열로 처리, 5과목)
 * 	ex ) 홍길동 000101 010-1111-1111 25
 *	EZEN(인천)
 *  자바 6개월, 파이썬 2개월, 빅데이터 3개월...
 *  
 *  
 *  기능 (메서드)
 *  - 학생 기본정보를 출력하는 기능
 *  - 학원정보를 출력하는 기능
 *  - 수강정보를 출력하는 기능
 *  - 학생의 수강정보를 추가하는 기능
 */
 

class Student{
	
	

	private String name; // 이름
	private String age; // 나이
	private String birth; //생년월일
	private String phoneNum; //핸드폰번호
	public final static String ACADEMY = "EZEN"; //이젠
	private String g; //지점
	private String subject[] = new String[5];
	private String month[] = new String[5]; //기간
	private int cnt =0;
	
	
	
	
	public Student() {}
	
	
	public Student( String name, String age, String birth, String phoneNum ) {
//		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.phoneNum = phoneNum;
		
		
		
	}
	
	public void Student1(String subject, String month) {
		if (cnt < 5 ) {
			this.subject[cnt] = subject;
			this.month[cnt] = month;
			cnt++;
			
		}else {
			System.out.println("더 이상 수강하지 못합니다.");
		}
	}

	// 기본정보
	
	@Override
	public String toString() {
		return  "이름 : " + name + "(" + age + ")"+ " 생년월일 : " + birth + ", 전화번호 : " + phoneNum;
	}
	
	
	public void printAcademy() {
		System.out.println(ACADEMY + "(" + g + ")");
	}
	
	public void PrintSb() {
		for (int i = 0; i < cnt ; i++) {
			System.out.println("수강 과목 : " + subject[i] + "  / 수강 기간 : "+ month[i]);
		}
		
		
	}


	//getter,setter
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getG() {
		return g;
	}


	public void setG(String g) {
		this.g = g;
	}


	public String[] getSubject() {
		return subject;
	}


	public void setSubject(String[] subject) {
		this.subject = subject;
	}


	public String[] getMonth() {
		return month;
	}


	public void setMonth(String[] month) {
		this.month = month;
	}


	public static String getAcademy() {
		return ACADEMY;
	}
	
	
}









