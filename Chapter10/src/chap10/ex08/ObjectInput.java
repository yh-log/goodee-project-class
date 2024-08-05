package chap10.ex08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Map;

public class ObjectInput {

	public static void main(String[] args) throws Exception {

		
//		1. 경로 지정 + 주스트림 생성
		FileInputStream fis = new FileInputStream("C:/img/temp/obj.dat");
		
//		2. 보조 스트림 생성
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
//		3. 읽어오기
//		Map (명시적 형변환) - object가 최상위기 때문에 대부분 케스팅을 해줘야 한다.
		Map<String, String> map = (Map<String, String>) ois.readObject();
		System.out.println(map);
		
//		Array
		int[] scores = (int[]) ois.readObject();
		System.out.println(Arrays.toString(scores)); // 배열은 그냥은 안찍히니까.
		
//		String
		String msg = ois.readUTF();
		System.out.println(msg);
		
//		Sample (클래스)
		Sample sample = (Sample) ois.readObject();
		System.out.println("team " + sample.team);
		System.out.println(sample.method());
		
//		4. 종료
		ois.close();
	}

}
