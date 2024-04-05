package std;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
	
	//1번
	
	// 멤버변수 : 이름, 나이, 전화번호, map(과목, 점수), 합계, 평균
	// 생성자, 메서드, getterSetter, 출력메서드
	// 메서드 - 출력메서드 (학생정보,과목점수(성적표) ,합계, 평균)
	// (과목, 점수) 맵에 데이터를 추가하는 메서드
	// (과목, 점수) 맵에 데이터를 삭제하는 메서드
	
	
	ArrayList<Student> list = new ArrayList<>();
	private String stdName;
	private String stdAge;
	private String stdPhone;
	
	public String a;
	
	private String sub;
	private int j;
	private int cnt;
	private int sum;
	
	
	HashMap<String,Integer> map = new HashMap<>();
	
	
	
	// 기본생성자
	public Student() {}


	public Student(String stdName, String stdAge, String stdPhone) {
		super();
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
	}
	
	// 출력메서드
	
	public void stdPrint() {
		System.out.println("---학생정보---");
		System.out.println("학생명 : " + stdName + "(" + stdAge + ") / " + stdPhone);
		
		
//		
//		System.out.println("---성적표---");
//		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			sub = it.next();
//			j = map.get(sub);
//			System.out.println( sub + " : " + j + "점");
//		}
//		
//		System.out.println("---합계,평균---");
//		sum = 0;
//		for (String s : map.keySet()) {
//			sum += map.get(s);
//			
//			
//		}
//		System.out.println("합계 : " + sum + "평균 : ");
//		System.out.println("평균 : " + sum/map.size());
	}
	
	public void subPrint() {
		
	}
	
	
	// (과목, 점수) 맵에 데이터를 추가하는 메서드
	
	public void insertSub(Scanner scan) {
		System.out.println("과목과 점수를 추가할 학생의 이름을 입력하세요.");
		 stdName = scan.next();
		if (stdName == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("과목 입력 >");
			sub = scan.next();
			System.out.println("점수 입력 >");
			j = scan.nextInt();
			
			map.put(sub,j);
			
			System.out.println("추가 완료되었습니다.");
		}
		
	}
	
	public void addMap(String sub, int j) {
		map.put(sub, j);
		return ;
	}
	
	// (과목, 점수) 맵에 데이터를 삭제하는 메서드
	
	public void deletesub(Scanner scan) {
		System.out.println("데이터를 삭제할 학생의 이름을 입력하세요.");
		stdName = scan.next();
		if (stdName == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("삭제할 과목 >");
			sub = scan.next();
			map.remove(sub);
			
			System.out.println("삭제 완료되었습니다.");
	}
	}
		
	public void deleteMap(String sub, int j) {
			map.remove(sub);
		}
	




	public ArrayList<Student> getList() {
		return list;
	}


	public void setList(ArrayList<Student> list) {
		this.list = list;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public String getStdAge() {
		return stdAge;
	}


	public void setStdAge(String stdAge) {
		this.stdAge = stdAge;
	}


	public String getStdPhone() {
		return stdPhone;
	}


	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	public int getJ() {
		return j;
	}


	public void setJ(int j) {
		this.j = j;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public HashMap<String, Integer> getMap() {
		return map;
	}


	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}


	public String contains(String stdName2) {
		// TODO Auto-generated method stub
		return null;
	}


	public void stdPrintMap(HashMap<String, Integer> map2) {
		// TODO Auto-generated method stub
		
	}
}
