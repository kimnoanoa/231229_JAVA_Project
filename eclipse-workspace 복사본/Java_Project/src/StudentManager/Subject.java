package StudentManager;

public class Subject {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* subject class : 하나의 수강과목정보를 저장하는 클래스
		 * - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표, 강의장
		 * - 멤버변수, 생성자, getter/setter, toString
		 * */
		
		
	}

	public void addSubject(Subjectclass s) {
		// TODO Auto-generated method stub
		
	}

}

class Subjectclass {
	public String code;
	public String subject;
	public String score;
	public String pro;
	public String h;
	public String timetable;
	public String r;
	
	
	public Subjectclass() {}


	public Subjectclass(String code, String subject, String score, String pro, String h, String timetable, String r) {
		super();
		this.code = code;
		this.subject = subject;
		this.score = score;
		this.pro = pro;
		this.h = h;
		this.timetable = timetable;
		this.r = r;	
	}
	
	public Subjectclass(String code, String subject) {
		this.code = code;
		this.subject = subject;
	}
	


	@Override
	public String toString() {
		return "Subject [code=" + code + ", subject=" + subject + ", score=" + score + ", pro=" + pro + ", h=" + h
				+ ", timetable=" + timetable + ", r=" + r + "]";
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	public String getPro() {
		return pro;
	}


	public void setPro(String pro) {
		this.pro = pro;
	}


	public String getH() {
		return h;
	}


	public void setH(String h) {
		this.h = h;
	}


	public String getTimetable() {
		return timetable;
	}


	public void setTimetable(String timetable) {
		this.timetable = timetable;
	}


	public String getR() {
		return r;
	}


	public void setR(String r) {
		this.r = r;
	}
	
	
	
	
}
