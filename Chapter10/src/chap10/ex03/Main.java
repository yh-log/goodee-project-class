package chap10.ex03;

import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

//		1. 읽어올 경로 지정 + 2. 파일 객체 생성
		File file = new File("C:/img/temp/test.txt");
		
//		3. 사용할 빨대 선택
		try (FileReader reader = new FileReader(file);) { // 하나짜리를 사용할 때는 좋지만 n개 이상을 사용할 경우 가독성이 떨어진다. (catch로 가면 자동으로 닫힌다.)
//			FileReader reader = new FileReader(file);
			
//		4. 읽어오기
			int data;
			
//			그냥 읽기만 하면 읽은 값을 던지기 때문에 변수에 담아주어야 한다.
//			-1 : EOF(End Of File : 더 이상 읽을 게 없다.)
			while((data = reader.read()) != -1) { // read는 int타입이다(나중에 문자열로 바꿔야될 아스키코드임). (while로 해야한다 -> -1을 반환할 때까지) *언제까지 읽어야 하는지 모르니까
				System.out.print((char)data);
				
			}	
//		5. 사용한 자원 닫기 - 자원 닫기가 귀찮다면 try with resource 를 사용하면 된다. 
//			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
