package chap10.ex09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InputProps {

	public static void main(String[] args) throws IOException {

//		1. 주스트림 + 보조스트림 생성
		FileInputStream fis = new FileInputStream("src/chap10/ex09/setting.properties");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
//		2. 파일 읽기
		Properties prop = new Properties();
		prop.load(bis);
		
//		2-1. 데이터 꺼내오기 (put으로 집어 넣었으니 get으로 거낼 수 있다.)
		String id = (String) prop.get("id"); // get을 쓰면 형변환을 해야한다.
		String pass = prop.getProperty("pass");
		System.out.println(id + " / " + pass);
		
		for(Object key : prop.keySet()) {
			System.out.println((String)key + " : " + prop.get(key));
		}
		
//		3. 닫기
		bis.close();
		
	}

}
