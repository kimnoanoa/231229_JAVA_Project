package day06;

public class String01 {

	public static void main(String[] args) {
		// String 클래스 = 문자열을 다루기 위한 클래스
		/* String str = new String();
		 * String str = "홍길동"; // 일반 자료형처럼 이용가능
		 * 
		 * 
		 * */
		
		String str = "홍길동!!!!!!";
		System.out.println(str);
		String str1 = new String();
		str1 = "홍길순";
		System.out.println(str1);
		
		// length : 전체 글자의 길이 (총 글자수)
		System.out.println("---length---");
		System.out.println(str.length());
		
		// CharAt(index) : index 번지에 있는 문자열을 변환
		System.out.println("--CharAt(index)--");
		System.out.println(str.charAt(1));
		
		//subString : 문자열을 추출하는 역할
		System.out.println("---subString---");
		System.out.println(str.substring(0,2)); //0번지부터 2번지 전까지 추출 (2번지포함 x)
		// 괄호 두번째 수에 아무것도 안 적으면 첫번째수부터 끝까지 라는 의미
		System.out.println(str.substring(1)); //1부터 끝까지
		
		// str.compareTo(str1) : str str1 을 비교하여 앞이면 -1, 같으면 0, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("g".compareTo("a")); //apple 과 banana 비교도가능( 맨 첫번째 문자기준)
		System.out.println("a".compareTo("g"));
		
		// concat : 이어붙이기( + 연산자와 같은 의미)
		System.out.println("---concat---");
		System.out.println("Hello".concat("JAVA"));
		System.out.println("Hello" + "JAVA");
		
		// equals : 두 문자열이 같은지 비교 (true,false)
		// 문자는 == 로 비교가 안 됨.
		// 참조변수는 == 로 비교하게 되면 주소가 같은지 확인하게 됨.
		System.out.println("---equals---");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		
		//indexOf : 문자의 위치 (index) 를 찾아주는 기능, 찾는 문자가 없으면 -1 리턴
		// lastindexOf : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("--indexof--");
		System.out.println(str.indexOf("동")); //홍길동!!!!!!
		System.out.println(str.indexOf("!"));
		System.out.println(str.lastIndexOf("!"));
		System.out.println(str.indexOf("$"));
		
		
		
		// contains : 해당 문자를 포함하는지 체크
		
		System.out.println("---contains---");
		String file = "이것이자바다.Java";
		System.out.println(file.contains("Java")); //true,false
		
		System.out.println("-----------------------");
		
		//이메일에서 id 추출
		String email = "abc123@naver.com";
		int a = email.indexOf("@");
		System.out.println(email.substring(0, a));
		System.out.println(email.substring(0, email.indexOf("@")));
		
		
		
	}

}
