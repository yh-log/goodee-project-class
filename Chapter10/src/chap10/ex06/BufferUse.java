package chap10.ex06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// [개요] gif 파일을 읽어와 다른 위치에 내보내 복사 붙여넣기를 하는 코드로, 그와 동시에 소요된 시간을 체크하는 코드

public class BufferUse {

	public static void main(String[] args) throws Exception { // 일반예외가 발생하므로 throws 처리

//		1. 데이터 위치 지정 + 빨대 준비 (주스트림 준비)
		TimeChecker cheker = new TimeChecker(); // 시작-종료 시간을 측정 메소드 사용을 위한 객체 생성
		FileInputStream fis = new FileInputStream("C:/img/img.gif"); // 파일을 읽어오기 위한 FileInputStream 생성 
		FileOutputStream fos = new FileOutputStream("C:/img/temp/img1.gif"); // 읽어온 파일을 내보내기 위한 FileOutputStream 생성
		
//		1-2. 속도 개선을 위한 보조 스트림 준비 (1byte씩 옮기면 너무 오래 걸림)
		BufferedInputStream bis = new BufferedInputStream(fis); // 자원
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
//		2. 읽고 -> 쓰기
		cheker.timeStart(); // 시간 측정 시작 메서드 

		int data; // 바이너리 파일을 읽어와 넣어둘 변수 선언 (바이너리 파일이라서 int / 아스키코드)
		
//		read를 해주면 읽고 바로 날려버리니까 변수에 담아서 넘길 수 있도록
//		데이터 용량을 알지 못하니까 for가 아닌 while 사용
//		data 에는 read로 읽어온 내용을 옮겨야 하기 때문에 저장하는 용도
		while ((data = bis.read()) != -1) { // -1이 아닐 때까지 (읽어올 데이터가 없을 때까지) 반복
			bos.write(data); // bis에서 data로 넘어간 데이터를 bos에 쓰기
		}
		
		System.out.println("버퍼 사용 시 : " + cheker.timeStop() + " ms");
		
		
//		3. 내보내고 반납
		bos.flush(); // 데이터를 다 내보내기 위해 flush 사용 (Input은 다 쓰면 -1로 알 수 있지만 Output은 알 수 없으니까)
		bos.close();
		bis.close(); // 다 사용한 자원 닫아주기 (계속 할당 시 자원이 낭비)
		
	}

}
