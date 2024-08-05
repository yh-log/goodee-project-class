package chap10.ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {

//		1. 파일 위치지정 + 2. 객체화
		File src = new File("C:/img/img.gif"); // 복사할 위치
		File dst = new File("C:/img/temp/img_copy.gif"); // 붙여넣기 할 위치
		
//		3. 빨대 준비(읽기와 쓰기 총 2개 준비)
		try(
			FileInputStream fis = new FileInputStream(src); // 바이너리 파일 (텍스트(txt)를 제외한)
			FileOutputStream fos = new FileOutputStream(dst);
			) {
			
			byte[] cup = new byte[1024];
			int i = 0;
			
			while(fis.read(cup) != -1) { // read(byte[]) 은 내가 얼마나 읽었는지만 알려준다. (1024| -1) 그래서 변수에 따로 담을 필요가 없다.
				fos.write(cup); // 떠온 컵의 내용을 여기에 담는다. 
				i++;
				System.out.println("파일 복사중..." + i);
			}
			
//			여기 아래 코드리뷰!!
			
////		4. 읽어오기
//			int data;
//			int i = 0;
//			while((data = fis.read()) != -1) { // 티스푼으로 하나씩 물을 퍼나르는 것과 같다.
////		5. 내보내기
//				fos.write(data);
//				i++;
//				System.out.println("파일 복사 중..." + i); // 몇번 실행되는지(반복되는지) 알아보기 위해서 작성 
//			}
//		6. (다 나갔는지 확인)
			fos.flush();
			
//		7. 자원 반납
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
