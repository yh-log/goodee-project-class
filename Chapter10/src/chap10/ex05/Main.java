package chap10.ex05;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		[개요] 사용자가 입력한 내용을 C:/img/temp/sample.txt 에 저장
		
//		1. 내보낼 파일 위치 설정 및 객체화
		File file = new File("C:/img/temp/sample.txt");
		
//		2. 내보낼 빨대 준비
		try(FileWriter fw = new FileWriter(file, true)) {
			
//		3. 스캐너 준비
			Scanner scan = new Scanner(System.in);
			
//		4. 스캐너로 부터 입력 받기
//			new line 문자 (개행문자 입력)
//			fw.write(scan.nextLine() + "\r\n"); // 로도 사용 가능
			
			
			while(scan.hasNextLine()) {
				String inputStr = scan.nextLine();
//		5. 입력 받은 내용 내보내기
				if(inputStr.equals("입력종료")) {
					scan.close();
					break;
				} else {
					fw.append(inputStr);
				}
			}
			
//		6. 확실히 내보내고, 자원 반납
			fw.flush();
//			scan.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		
		
		
	}

}
