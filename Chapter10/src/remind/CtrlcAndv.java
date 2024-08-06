package remind;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CtrlcAndv {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:/img/img.gif");
		FileOutputStream fos = new FileOutputStream("C:/img/temp2/img2.gif");
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int data;
		
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		bos.flush();
		bos.close();
		bis.close();
	}

}
