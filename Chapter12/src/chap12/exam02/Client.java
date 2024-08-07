package chap12.exam02;

import java.net.Socket;

public class Client {

	// 프로젝트 폴더/bin 들어가기(바이너리 폴더) -> 탐색키 창에서 cmd 입력 (해당 위치에서 커맨드 창 켜짐)
	// java [패키지.클래스명]
	// java chap12.exam02.Client
	public static void main(String[] args) throws Exception {

//		1. 어디로 가고 싶은지 지정해서 소켓 생성
		Socket socket = new Socket("localhost", 5001); // (ip 주소, 포트번호) // 192.168.0.13 (같은 컴퓨터니까 localhost로 해도 된다.
		
//		2. 예외가 발생하지 않으면 접속 완료
		System.out.println("접속 완료");
		// 접속에 성공했으면 서버의 정보가 socket에 담기게 된다.
		
		
//		3. 할 일이 있으면 하고, 없으면 그냥 종료(자원 반납)
		System.out.println("할거 없으니 종료");
		socket.close();
		
	}

}
