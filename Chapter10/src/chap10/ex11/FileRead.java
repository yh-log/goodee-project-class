package chap10.ex11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileRead {

	public static void main(String[] args) throws IOException {

		
//		1. 주 스트림 + 위치지정 => 위치 지정
		Path path = Paths.get("C:/img/temp/test.txt");
		
//		2. 보조 스트림 => 없음 (내장되어 있기 때문에 사용x)
		List<String> lines =  Files.readAllLines(path); // 한번에 담겨서 온다.

//		3. 읽기
		for (String line : lines) {
			System.out.println(line);
		}
		
//		4. 자원반납 => 없음 (알아서 해준다.)
		
	}

}
