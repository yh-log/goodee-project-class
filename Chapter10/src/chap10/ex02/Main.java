package chap10.ex02;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

//		폴더 만들기
		File dir = new File("C:/img/temp");
		
		if(!dir.exists()){
			System.out.println("폴더가 존재하지 않아 생성합니다.");
			dir.mkdirs();
		}
		
//		파일 만들기
		
		File file = new File("C:/img/temp/test.txt"); // 파일 경로 + 이름
		
		if (!file.exists()) {
			System.out.println("해당 파일이 없어서 생성");
			file.createNewFile();
			
		}
		
//		특정 폴더 정보 알아내기
		dir = new File("C:/img");
		String[] fileNames =  dir.list();
		
//		특정 폴더 내의 파일명 추출
		for (String name : fileNames) {
			System.out.println(name);
		}
		
//		파일 정보 전체 추출
		File[] files =  dir.listFiles();
		String gubun; 
		
		for (File f : files) {

//			디렉토리인지 파일인지 확인
			if(f.isDirectory()) {
				gubun = "[디렉토리]";
			} else {
				gubun = "[파일]";
			}
			
//			이름 / 크기
			System.out.println(gubun + " " + f.getName() + " " + f.length() + "byte");
		}
		
	}

}
