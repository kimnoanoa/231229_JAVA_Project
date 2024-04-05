package std;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
//3번
import java.util.Scanner;


public class StdManager implements StdProgram {
	
	private ArrayList<Student> list = new ArrayList<>();
	private HashMap<String,Integer> map = new HashMap<>();
	
	Student stu = new Student();
	
//	
//	String stdName;
//	public String a;
//	
//	private String sub;
//	private int j;
//	private int cnt;
//	private int sum;
	
	public void plus(){
		
	}

	@Override
	public void printStd() {
//		System.out.println("---전체 학생 정보---");
		
		for (int i = 0;i < list.size();i++) {
			list.get(i).stdPrint();
		}
		

		System.out.println("---성적표---");
		
	
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String sub = it.next();
			int j = map.get(sub);
			System.out.println( sub + " : " + j + "점");
		}
		
//		System.out.println("---합계,평균---");
//		int sum = 0;
//		for (String s : map.keySet()) {
//			sum += map.get(s);
//			
//			
//		}
//		System.out.println("합계 : " + sum + "평균 : " );
		
		
		
		
		
	}

	@Override
	//학생추가
	public void addStd(Scanner scan) {
		System.out.println("학생명 > ");
		String stdName = scan.next();
		System.out.println("나이 > ");
		String stdAge = scan.next();
		System.out.println("전화번호 > ");
		String stdPhone = scan.next();
		
		Student a = new Student(stdName, stdAge, stdPhone);
		list.add(a);
		
			
		
		
	}

	@Override
	//학생정보수정
	public void modStd(Scanner scan) {
		System.out.println("---수정할 학생 이름 >> ");
		String stdName = scan.next();
		for (int i = 0; i < list.size();i++) {
	
		if (list.get(i).getStdName().equals(stdName)){
			list.remove(i);
			System.out.println("수정할 학생 정보를 입력하세요.");
			System.out.println("-- 이름, 나이, 전화번호>");
			Student a = new Student(scan.next(),scan.next(),scan.next());
			list.add(a);
			
			System.out.println("수정이 완료되었습니다.");
			return;
		}else {
			System.out.println("검색결과가 없습니다.");
		}
		}
		}	
		
		
	

	@Override
	//학생삭제
	public void delStd(Scanner scan) {
		System.out.println("삭제할 학생 이름 >> ");
		String stdName = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getStdName().equals(stdName)) {
				list.remove(i);
				System.out.println("삭제 완료되었습니다.");
				return;
			}else {
				System.out.println("검색 결과가 없습니다.");
				
			}
		}
	}

	@Override
	 // 학생검색
	public void searchStd(Scanner scan) {
		System.out.println("검색할 학생 이름을 입력하세요.");
		String stdName = scan.next();
		for (int i = 0; i <list.size(); i++) {
			if (list.get(i) == null) {
				System.out.println("검색 결과가 없습니다.");
			}if (list.get(i).getStdName().equals(stdName)) {
				list.get(i).stdPrint();
			}
		}
	}
		
		
	

	@Override
	 // 점수추가
	public void addSub(Scanner scan) {
		System.out.println("과목과 점수를 추가할 학생의 이름을 입력하세요.");
		 String stdName = scan.next();
		if (stdName == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("과목 입력 >");
			String sub = scan.next();
			System.out.println("점수 입력 >");
			int j = scan.nextInt();
			
			
			
			
//			map.put(sub,j);
			
			
			System.out.println("추가 완료되었습니다.");
		}
		
		
	}

	@Override
	//점수수정
	public void modSub(Scanner scan) {
		System.out.println("데이터를 수정할 학생의 이름을 입력하세요.");
		String stdName = scan.next();
		if (stdName == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("수정할 과목 >");
			String sub = scan.next();
			map.remove(sub);
			System.out.println("새로 수정할 과목과 점수 >");
			sub = scan.next();
			int j = scan.nextInt();
			map.put(sub,j);
			
			System.out.println("수정 완료되었습니다.");
	}
	
		
		
		
	}

	@Override
	//점수삭제
	public void delSub(Scanner scan) {
		System.out.println("데이터를 삭제할 학생의 이름을 입력하세요.");
		String stdName = scan.next();
		if (stdName == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("삭제할 과목 >");
			String sub = scan.next();
	
			map.remove(sub);
			
			System.out.println("삭제 완료되었습니다.");
	}
	
		
	}



	
	
	// 학생 리스트 생성 후 Program 에 있는 메서드 구현

}
