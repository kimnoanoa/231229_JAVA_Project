package day12;

public class Class06 {

	public static void main(String[] args) {
		// 객체를 생성 시 값을 초기화하는 방법
		/* - 기본값, 명시적 초기값, 초기화 블럭, 생성자
		 * 1. 기본값은 기본적으로 지정되는 값 int = 0, String = null
		 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
		 * 		private String name = " 홍길동";
		 * 3. 초기화 블럭 : {} 멤버변수를 초기화 
		 * 4. 생성자 : 객체를 생성할 때 초기화해서 생성
		 *
		 * 초기값의 우선순위
		 * 기본값 -> 명시적 초기값 -> 초기화 블럭값 -> 생성자
		 * 
		 * 
		 * */
		
//		EzenStudent s = new EzenStudent();
//		s.setName("김노아");
//		s.setPhoneNum(12345);
//		s.setAge(26);
//		s.setA("빅데이터");
//		s.print();
		
		//toString 메서드가 없으면 객체의 주소가 출력, 있으면 toString 이 출력
//		System.out.println(ez);
		
		
		
		EzenStudent studentArr[] = new EzenStudent [5];
		
		
		
		
		EzenStudent ez1 = new EzenStudent("인천","김노아",111,26,"자바");
		System.out.println(ez1);
		
		EzenStudent ez2 = new EzenStudent("강남","홍길동",123,22,"자바");
		System.out.println(ez2);
		
		EzenStudent ez3 = new EzenStudent("인천","김진아",145,20,"자바");
		System.out.println(ez3);
		
		EzenStudent ez4 = new EzenStudent("인천","뚱냥이",265,25,"자바3");
		System.out.println(ez4);		
				
		EzenStudent ez5 = new EzenStudent("인천","김대현",1565,30,"자바4");
		System.out.println(ez5);
		
		studentArr[0] = ez1;
		studentArr[1] = ez2;
		studentArr[2] = ez3;
		studentArr[3] = ez4;
		studentArr[4] = ez5;
		
		// 노아 학생이 듣고 있는 과목을 출력
		
		String searchName = "김대현";
		System.out.println("---" + searchName + "학생이 듣고 있는 과목정보---");
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].getName().equals(searchName)) {
				System.out.println(studentArr[i].getA());
			}
		}
		
		System.out.println("---------------------");
		
		// 노아가 자바를 들으려고 했는데 빅데이터로 변경
//		ez1.setA("빅데이터");
//		System.out.println(ez1);
//		
		String modify = "김노아";
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i].getName().equals(modify)) {
				studentArr[i].setA("빅데이터");
				System.out.println(studentArr[i]);
			}
		}
		
		System.out.println("----------------------");
		
		//자바를 듣고 있는 학생의 명단
		// 학생이 없으면 명단이 없습니다. 출력
		
		String asd = "파이썬";
		int cnt = 0;
		for (int i = 0; i <studentArr.length; i++) {
			if(studentArr[i].getA().equals(asd)) {
				System.out.println(studentArr[i]);
				cnt++;
		}
		}if (cnt == 0) {
			System.out.println("명단이 없습니다.");
		}
		
		
		
	}

}

class EzenStudent{
	// 학생 정보를 생성하는 클래스
	
//	Private String gigum = " incheon"; 명시적초기값
	private String name; // 기본값 null
	private int phoneNum;
	private int age;
	private String a;
	private String gigum;

// 기본생성자
public EzenStudent(){
	
}





public EzenStudent(String gigum, String name, int phoneNum, int age, String a) {
//	super(); //내 부모클래스의 생성자 자동호출
	this.name = name;
	this.phoneNum = phoneNum;
	this.age = age;
	this.a = a;
}

{
	// 초기화 블럭 영역
	gigum = "인천";
	a = "미정";
	
	
}




public void print() {
	System.out.println("이름 : " + name + " / 전화번호 : " +phoneNum + " / 나이 : " + age);
	System.out.println("수강 과목 : " + a);
	
}

// toString : print 메서드와 같은 일을 함
@Override
public String toString() {
	return "EzenStudent["+ "지점:" + gigum +"/ 이름 :" + name + "/ 전화번호 :" + phoneNum + "/ 나이 :" + age + "/ 과목 : " + a + "]";
}





public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPhoneNum() {
	return phoneNum;
}

public void setPhoneNum(int phoneNum) {
	this.phoneNum = phoneNum;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getA() {
	return a;
}

public void setA(String a) {
	this.a = a;
}


}