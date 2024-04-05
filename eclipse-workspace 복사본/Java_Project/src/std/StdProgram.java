package std;

import java.util.Scanner;

public interface StdProgram {
	
	void printStd(); //학생정보출력
	
	void addStd(Scanner scan); //학생추가
	
	void modStd(Scanner scan); //학생정보수정
	
	void delStd(Scanner scan); //학생삭제
	
	void searchStd(Scanner scan); // 학생검색
	
	
	
	
	void addSub(Scanner scan); //점수추가
	
	void modSub(Scanner scan); //점수수정
	
	void delSub(Scanner scan); //점수삭제
	
	

}
