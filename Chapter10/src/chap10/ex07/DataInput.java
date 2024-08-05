package chap10.ex07;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInput {

	public static void main(String[] args) throws Exception {

//		1. 가져올 파일 위치 설정 + InputStream 준비
		FileInputStream fis = new FileInputStream("C:/img/temp/data.dat");
		
//		2. 보조 버퍼 추가 (Data, Buffer)
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
//		3. 데이터 읽고 출력하기
//		문자열 -> 정수 -> boolean 순으로 읽어야 함 (적은 순서 그대로)
		String name =  dis.readUTF();
		int salary = dis.readInt();
		boolean promotion = dis.readBoolean();
		
		System.out.println(name + " / " + salary + " / " + promotion);
		
		
//		4. 사용한 자원 반납(닫기)
		dis.close();
		
	}

}
