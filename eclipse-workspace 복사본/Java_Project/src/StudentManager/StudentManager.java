package StudentManager;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Manager implements Program {
	
	
	Studentclass a = new Studentclass();
	Subjectclass qwe = new Subjectclass();
	String name;
	int cnt;
	Studentclass [] StudentArr = new Studentclass[5];
	Subject [] sub = new Subject[5];
//	Subject s = new Subject();
	String Subject;
	
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("등록할 학생의 학번, 이름, 휴대폰 번호를 입력하세요. ");
		Studentclass a1 = new Studentclass (scan.next(),scan.next(),scan.next());
		StudentArr[cnt] = a1;
		cnt++;
		
		
	}

	@Override
	public void printStudent() {
		for (int i = 0; i< cnt ;i++ ) {
			StudentArr[i].print();
			
		}
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("검색할 학생의 이름을 입력하세요.");
		if(cnt == 0 ) {
		System.out.println("검색결과가 없습니다.");
		}
		for (int i = 0; i < cnt ; i++) {
			name = scan.next();
			if(name.equals(StudentArr[i].getName())) {
			cnt++;
			StudentArr[i].print();
		}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강신청할 학생의 이름을 입력하세요.");
		name = scan.next();
		for (int i = 0; i < cnt ; i++) {
			if (name.equals(StudentArr[i].getName())) {
			System.out.println("수강신청할 과목코드와 과목을 입력하세요.");
			Subjectclass s = new Subjectclass (scan.next(),scan.next());
			StudentArr[i].addSubject(null);
			System.out.println("수강신청이 완료되었습니다.");
			}else {
				System.out.println("검색결과가 없습니다.");
			}
		
		
		}
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강철회");
	}
	
}