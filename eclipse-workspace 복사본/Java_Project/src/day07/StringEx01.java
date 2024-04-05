package day07;

public class StringEx01 {

	public static void main(String[] args) {
		// file 에 저장되어있는 문자를 파일명과 확장자로 분리하여 출력
		
		/* 파일명 : 이것이자바다
		 * 확장자 : Java
		 * */
		
		String file = "이것이자바다.Java";
		
		int a = file.indexOf(".");
		String [] arr = file.split(".");
		int b = file.lastIndexOf("");
		String [] arr1 = file.split("\\.");
		for (String s : arr1) {
			System.out.println(s);
		}
		
		System.out.println("파일명 : "+(file.substring(0,a)));
		System.out.println("확장자 : "+(file.substring(a,b)));
		
		System.out.println("-----------------");
		
		String fileName = file.substring(0, file.indexOf("."));
		System.out.println(fileName);
		String suffix = file.substring(file.indexOf("."+1));
		System.out.println(suffix);
		
		
		// contains : 문자가 포함된지를 체크 boolean
		
		if (file.contains("Java")) {
			System.out.println("자바 파일입니다.");
		}


;
	}

}
