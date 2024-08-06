package chap10.ex10;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExam {

//	1. 경로 특화 클래스 Path
	public static void main(String[] args) {

		Path path  = Paths.get("C:/img/img.gif"); // 파일의 경로는 고정되어 있기 때문에 객체보다 원본으로 다루는게 안전하다고 판단해서 static 메소드로 만들어져 있음
		
		System.out.println("특정 경로의 파일 이름 : " + path.getFileName());
		System.out.println("부모 폴더 : " + path.getParent().getFileName());
		System.out.println("루트 : " + path.getRoot());
		
		
	}

}
