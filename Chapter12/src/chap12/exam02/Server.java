package chap12.exam02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// Server 은 항상 먼저 켜져 있어야 한다. 
public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket server = null;
		
		try {
//		1. 서버 소켓 생성 + 특정 IP 를 열어준다. (생략하면 본인의 IP를 열어준다.)
			server = new ServerSocket(5001); // 포트를 열어준다. (ex. 5001번 방 열어줄테니까 들어와)
			// 프로그램들은 각 방(포트번호)에 들어가 있기 때문에 들어가 있는 방을 열어주면 오류가 생긴다.
			// 주로 5000, 7000 대에는 잘 없다
			// 이미 있다고 하면 바꿔주면 된다.
			
//		2. 손님 올 때까지 대기
			while (true) {
				System.out.println("손님 기다리는 중...");
				
//		3. 요청이 오면 수락 (문 열어달라고 하면 열어준다.) - 수락하면 클라이언트의 소켓을 받게된다.
				Socket socket =  server.accept(); // 클라이언트의 소켓을 받게 된다. (blocking에 의해 소켓을 받을 때까지 정지 시켜 놓는다.)
				// socket 에는 접속 요청자의 모든 정보를 가지고 있다. 
				// 어떤 IP의 어느 방에 있는 녀석이 들어온다고 했나?
				
				InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(addr.getAddress() + " : " + addr.getPort());
			}
			
			
			
		} catch (Exception e) {
//		4. 자원 반납 (특수한 상황에서만 일어난다.)
			server.close();
		}
		
		
		
		
	}

}
