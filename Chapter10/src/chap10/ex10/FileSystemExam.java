package chap10.ex10;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class FileSystemExam {

//	3. 파일 시스템 특화 클래스
	public static void main(String[] args) throws IOException {

		FileSystem fs = FileSystems.getDefault();
		
		Iterable<FileStore> infoList = fs.getFileStores();
		
		
		for (FileStore info : infoList) {
			System.out.println("드라이브 이름 : " + info.name());
			System.out.println("NTFS/FAT32 : " + info.type()); // 저장 방식 (하드디스크 / USB) FAT32(공간이 커서 속도는 빠르지만 메모리 공간 낭비가 심하다) NTFS(공간이 작아서 메모리 효율은 좋지만 파일의 이동 속도가 비교적 느리다)
			System.out.println("전체공간 : " + (info.getTotalSpace()/1024/1024/1024) + "GB");
			System.out.println("사용 가능 공간 : " + (info.getUsableSpace()/1024/1024/1024) + "GB");
			System.out.println("===========================================");
		}
	}

}
