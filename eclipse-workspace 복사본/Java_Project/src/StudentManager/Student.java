package StudentManager;

public class Student {

	public static void main(String[] args) {
		// 	 * - student class : 한 학생의 정보를 저장하는 클래스
//		 * -학번, 이름, 나이, 전화번호, 주소 , 수강과목
//		 * - 멤버변수, 생성자, getter/setter, toString
//		 * 멤버변수에 학생이 듣고자 하는 과목을 저장 . Subject[]
//		 * - 메서드: 수강과목 추가메서드 , 삭제메서드 ,출력메서드 , 학생정보 출력메서드
		
		
		Studentclass s = new Studentclass();
		
		
		

	}

}


class Studentclass{
	public String sclass;
	public String name;
	public String age;
	public String phone;
	public String add;
	public String ssub;
	Subject [] sb = new Subject[5];
	Subject s = new Subject();
	int cnt;
	
	public Studentclass() {}
	
	public Studentclass(String sclass, String name, String phone) {
		this.sclass = sclass;
		this.name = name;
		this.phone = phone;
	}


	public Studentclass(String sclass, String name, String age, String phone, String add, String ssub) {
		super();
		this.sclass = sclass;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.add = add;
		this.ssub = ssub;
	}
	
	public void addSubject(Subject s) {
		if (cnt > 5) {
			System.out.println("더 이상 추가하지 못합니다.");
		}else {
			sb[cnt] = s;
			cnt++;
		}
		
	}
	
	public void print() {
		System.out.println(" 이름 : " + name );
		System.out.println(" 학번 : " + sclass);
		System.out.println(" 전화번호 : " + phone);
		
	}
	
	public void printSubject() {
		
	}
	
	


	@Override
	public String toString() {
		return "[학번 : " + sclass + ", 이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + phone + ", 주소 : "
				+ add + ", 수강과목 : " + ssub + "]";
	}


	public String getSclass() {
		return sclass;
	}


	public void setSclass(String sclass) {
		this.sclass = sclass;
	}


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


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public String getSsub() {
		return ssub;
	}


	public void setSsub(String ssub) {
		this.ssub = ssub;
	}
	
	
	
	
}