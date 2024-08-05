package chap10.ex08;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectOutput {

	public static void main(String[] args) throws IOException {

//		1. 경로 지정 + 스트림 준비
		FileOutputStream fos = new FileOutputStream("C:/img/temp/obj.dat");
		
//		2. 보조 스트림 준비
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
//		3. 내보내기
//		Map
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("phone", "01012341234");
		
		oos.writeObject(map);
		
//		Array
		oos.writeObject(new int[] {80, 80, 90, 100});
		
//		UTF (String)
		oos.writeUTF("기본적인 데이터도 넣을 수 있다.");
		
//		Sample
		oos.writeObject(new Sample());
		
//		4. 마무리
		oos.flush();
		oos.close();
		
		
		
	}

}
