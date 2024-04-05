package day21;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File03 {

	public static void main(String[] args) throws IOException {
		// FileWriter 를 이용하여 파일 쓰기
		// 일반적으로 다시 같은 이름의 파일을 생성하면 덮어쓰기.
		// 기존 파일에 추가모드가 가능.
		FileWriter fw = new FileWriter("writer.txt");
		for(int i = 1; i<= 10; i++) {
			String data = i+ "test \r\n"; // \n Enter , \r 캐리지리턴
			fw.write(data); //파일에 기록하라는 의미
			fw.write("my project I/O test \r\n");
			
		}
		
		fw.close();
		
		// 기존파일에 데이터를 쓰려고 할때 : 추가모드
		FileWriter fw2 = new FileWriter("Writer.txt",true);
		for(int i = 11; i <= 20; i ++) {
			String data = i+ "test \r\n"; // \n Enter , \r 캐리지리턴
			fw2.write(data); //파일에 기록하라는 의미
			fw2.write("my project I/O test \r\n");
			
		}
		
		fw2.close();
		
		//PrintWriter를 이용한 파일 쓰기
		PrintWriter pw = new PrintWriter("PrintWriter.txt");
		for(int i = 1; i<= 10; i++) {
			String data = i+ "test \r\n";
			pw.write(data);
			pw.write("my project I/O test \r\n");
		}
		
		pw.close();
		
		// printWriter를 이용해서 추가하려면..
		// 파일객체를 생성해서 추가
		PrintWriter pw2 = new PrintWriter(new FileWriter("Writer2.txt",true));
		for(int i = 11; i <= 20; i++) {
			String data = i+ "append mode \r\n";
			pw2.write(data);
		}
		
		pw2.close();
		
		// 바이트기반 스트림
		// FileOutputStream 을 이용한 파일 쓰기
		FileOutputStream output = new FileOutputStream("out.txt");
		for (int i = 1; i<=10 ; i++) {
			String data = "Test mode \r\n";
			//바이트기반 스트림이기 때문에 바이트 단위로 쓸 수 있음
			output.write(data.getBytes());
			
		}
		output.close();

	}

}
