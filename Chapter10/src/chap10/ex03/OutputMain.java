package chap10.ex03;

import java.io.File;
import java.io.FileWriter;

public class OutputMain {

	public static void main(String[] args) {

//		1. 저장할 위치 + 2. 파일 객체 생성
		File file = new File("C:/img/temp/user001.txt");
		
//		2. 빨대 준비 (true를 붙여야 계속 이어서 적어준다.)
		try(FileWriter writer = new FileWriter(file, true);) {

//			3. 내보내기
			writer.write("Hello, JAVA I.O.");

//			4. flush 및 자원 반남
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	
	}

}
