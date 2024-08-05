package chap10.ex07;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutput {

	public static void main(String[] args) throws Exception {

//		1. 내보낼 파일 위치 설정 + 2. OutputStream 준비 (FileOutputStream) *뒤에 이어서 계속 작성하려면 true를 적어야 한다.
		FileOutputStream fos = new FileOutputStream("C:/img/temp/data.dat", true); // 확장자가 반드시 dat 이어야 한다.
		
		
//		3. 보조 스트림 추가 (Data, Buffer)
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos); // java의 고유 데이터를 받을 수도 있고, 속도도 빠른 상태!
		
//		4. 데이터 쓰기
		dos.writeUTF("김지원");
		dos.writeInt(500);
		dos.writeBoolean(true);
		System.out.println("저장완료");
		
		
//		5. 비우기 (flush)
		dos.flush();
		
//		6. 사용한 자원 닫기 (close)
		dos.close();
		
		
	}

}
