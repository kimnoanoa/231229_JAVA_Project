package day12;

public class Student_T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 st = new Student1 ("홍길동" ,"011222","0101232235","24","busan");
		st.printInfo();
		st.printAcademy();
		st.insertCourse("java","5개월");
		st.insertCourse("html","1개월");
		st.printCourse();
		
		Student1 st1 = new Student1( "hong" ,"020202","01042934235","23","busan");
		st1.printInfo();
		st1.printAcademy();
		st1.insertCourse("java","5개월");
		st1.insertCourse("html","1개월");
		st1.printCourse();
		
		Student1 st2 = new Student1( "kim" ,"000101","0104124255","29","seoul");
		st2.printInfo();
		st2.printAcademy();
		st2.insertCourse("python","5개월");
		st2.insertCourse("html","1개월");
		st2.printCourse();
		
		
		Student1 st3 = new Student1( "park" ,"030303","0112612345","22","incheon");
		st3.printInfo();
		st3.printAcademy();
		st3.insertCourse("python","5개월");
		st3.insertCourse("html","1개월");
		st3.printCourse();
		
		
		Student1 st4 = new Student1( "atsd" ,"000101","0104124255","29","incheon");
		st4.printInfo();
		st4.printAcademy();
		st4.insertCourse("java","5개월");
		st4.insertCourse("html","1개월");
		st4.printCourse();
		
		
		Student1 st5 = new Student1( "lee" ,"940201","01023456789","31","seoul");
		st5.printInfo();
		st5.printAcademy();
		st5.insertCourse("java","5개월");
		st5.insertCourse("html","1개월");
		st5.printCourse();
		
		
		Student1 st6 = new Student1( "qwer" ,"980720","01081212355","27","seoul");
		st6.printInfo();
		st6.printAcademy();
		st6.insertCourse("python","5개월");
		st6.insertCourse("html","1개월");
		st6.printCourse();
		
		
		Student1 st7 = new Student1( "kim noa" ,"991122","01045577641","26","incheon");
		st7.printInfo();
		st7.printAcademy();
		st7.insertCourse("python","5개월");
		st7.insertCourse("html","1개월");
		st7.printCourse();
		
		
		
		Student1[] std = new Student1[8];
		std[0] = st;
		std[1] = st1;
		std[2] = st2;
		std[3] = st3;
		std[4] = st4;
		std[5] = st5;
		std[6] = st6;
		std[2] = st7;
		
		System.out.println("--------------------");
		
		
		// hong학생의 학생정보, 학원정보, 수강저보 출력
		
//		String searchName = "hong";
//		for (int i = 0; i < std.length ; i++) {
//			if (std[i].getName() != null) {
//			if (std[i].getName().equals(searchName)) {
//				System.out.println();
//			}
//		}
//		}
		
		String searchName = "hong";
		int cnt = 0;
		System.out.println(searchName + "님의 정보----");
		for (int i = 0; i <std.length; i++) {
			if (std[i].getName() != null) {
			if(searchName.equals(std[i].getName())) {
				std[i].printInfo();
				std[i].printAcademy();
				std[i].printCourse();
				}	
			}
		}
		
		// 인천지점의 학생들을 모두 검색하여 학생정보만 출력
		
		String g = "incheon";
		for (int i = 0; i < std.length;i++) {
			if (std[i].getBranch() != null) {
			if (std[i].getBranch().equals(g)) {
				System.out.println(std[i]);
			}
		}
		}
		
		// java 과목을 수강하는 학생드을 검색하여 학생정보/학원정보 출력
		
//		String asda = "java";
//		int cnt = 0;
//		for (int i = 0; i < std.length;i++) {
//			if(std[i].getCourse().equals(asda));
//			System.out.println(std[i].getName());
//		}
		
		String searchCourse = "java";
		System.out.println(searchCourse + "의 수강정보-----");
		cnt = 0;
		while (cnt < std.length ) {
			for (int i = 0; i < std[cnt].getCourse().length; i++) {
				if (std[cnt].getCourse()[i] != null) {
					if (searchCourse.equals(std[cnt].getCourse()[i])) {
						std[cnt].printInfo();
						std[cnt].printAcademy();
						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
		

	}

}


class Student1{
	private String name;
	
	private String birth;
	private String phone;
	private String age;
	private String branch;
	private final static String ACADEMY = "EZEN"; //이젠
	
	
	
	
	private String [] course = new String[5];
	private String [] period = new String[5];
	private int cnt;
	
	//생성자
	
	public Student1() {
		
	}
	
	public Student1 (String name, String phone, String branch ) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	public Student1 (String name, String birth, String phone, String age, String branch) {
		this(name, phone, branch);
		this.birth = birth;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("------학생정보------");
		System.out.println("이름 : " + name + "(" + age + "세 /" +birth + ") " + "/" + phone );
	}
	
	public void printAcademy () {
		System.out.println("------학원정보------");
		System.out.println("학원명 : " + ACADEMY + " / " + branch + "지점" );
	}
	
	// 수강정보 출력
	public void printCourse() {
		for (int i =0; i <cnt ; i++) {
			System.out.println("과정 : " + course[i] + "(" + period[i] + ")");
		}
	}
	
	
	
	// 수강정보 등록
	// insertCourse()
	// 매개변수 course, period 주고 배열에 추가 => (배열을 완성 / 리턴되는 값은 없음,)
	public void insertCourse (String course, String period) {
		
		if (cnt >= 5) {
			System.out.println("더 이상 수강할 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
		
	}
	
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getAcademy() {
		return ACADEMY;
	}
	
	
	
	
}