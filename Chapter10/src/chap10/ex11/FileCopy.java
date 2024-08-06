package chap10.ex11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileCopy {

	public static void main(String[] args) throws IOException {

//		C:/img/temp/img.gif 를 -> C:/img/temp2/img.gif 로 복사하기
		
//		1. 파일 위치 및 주스트림 생성(in/out) => 위치지정
		Path src = Paths.get("C:/img/temp/img.gif");
		Path dst = Paths.get("C:/img/temp2/img.gif");
		
//		2. 보조스트림 => 없음

//		3. 가져오기 -> 내보내기 (읽기 -> 읽은 내용 쓰기)
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);
		/* REPLACE_EXISTING : 이미 파일이 있으면 덮어쓴다. (만약 이 옵션이 없으면 이미 파일이 있을 경우 Exception이 발생한다.)
		 * COPY_ATTRIBUTES : 파일의 속성까지도 복사한다. (파일속성 : 권한, 읽기전용 등)
		 */
		
		System.out.println("복사 완료");
//		4. flush + 자원 반납 => 없음
		
	}

}
