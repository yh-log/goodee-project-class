package chap10.ex10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExam {

	
//	파일을 다루는 클래스
	public static void main(String[] args) throws IOException {

//		Path로 부터 경로를 받아 실제 파일의 정보를 얻거나 파일을 다룬다.
//		Path와 함께 가장 많이 사용되는 클래스 
		
		Path path = Paths.get("C:/img/temp/test.txt");
		
		System.out.println("디렉토리 여부 : " + Files.isDirectory(path));
		System.out.println("마지막 수정 시간 : " + Files.getLastModifiedTime(path));
		System.out.println("파일 크기 : " + Files.size(path));
		System.out.println("소유자 : " + Files.getOwner(path));
		System.out.println("숨김파일여부 : " + Files.isHidden(path));
		
		
	}

}
