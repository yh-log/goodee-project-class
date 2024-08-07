package chap12.exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws UnknownHostException {

//		내 컴퓨터 주소(IP) 얻기
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("내 PC주소 : " + addr.getHostAddress()); 
		// private IP (사설 IP) 내 PC주소 : 192.168.0.13 (이 주소로는 외부에서 내 컴퓨터에 접속할 수 없다.)
			// -> 내부에서만 사용 가능한 IP
		// public IP (공인 IP) 내 아이피 주소(IP Address): 14.36.141.27
			// -> 외부에서도 접속 가능한 IP
		
		System.out.println();
		
//		도메인으로 IP 얻어내기
		String domain = "www.gdu.co.kr";
		addr = InetAddress.getByName(domain);
		System.out.println(domain + " 의 IP 주소 : " + addr.getHostAddress() );
		
//		대형사이트의 경우 하나의 도메인에 여러 IP를 연결해 놓는다.
		domain = "www.youtube.com";
		InetAddress[] addrs = InetAddress.getAllByName(domain);
		
		System.out.println(domain + " 의 IP 주소들..");
		
		for (InetAddress ip : addrs) {
			System.out.println(ip.getHostAddress());
		}
		
	}

}
