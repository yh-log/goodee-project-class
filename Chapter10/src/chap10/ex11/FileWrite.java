package chap10.ex11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) throws IOException {

//		1. 파일 위치 지정 + 주 스트림 => 위치 지정만 한다.
		Path path = Paths.get("C:/img/temp/write.txt");
		
		if(Files.notExists(path)) {
			System.out.println("파일 생성");
			Files.createFile(path);
		}
		
//		2. 보조 스트림 => 필요 없음
		
//		3. 특정 값 쓰기
		
		
//		3-1. Scanner 를 이용해 값 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 > ");
		String msg = scan.nextLine() + "\r\n";
		
//		3-2. 받은 값 쓰기
		Files.writeString(path, msg, StandardOpenOption.APPEND);
		/*StandardOpenOption 
		 * APPEND : 이어쓰기
		 * CREATE : 쓰기모드
		 * READ : 읽기모드
		 * CREATE_NEW : 이미 파일이 존재하는 경우 새 파일을 생성
		 */
		System.out.println("파일 저장이 완료 되었습니다.");
		
		
//		4. flush 및 자원 반납
		scan.close();
		
	}

}
