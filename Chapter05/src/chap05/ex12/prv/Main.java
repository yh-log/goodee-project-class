package chap05.ex12.prv;

public class Main {

	public static void main(String[] args) {

		Computer com = new Computer();
		
//		전원 켜기
		com.setPower(true);
		System.out.println("전원 상태 : " + com.isPower());
		
//		온도 측정
		System.out.println("온도 : " + com.getTemp());
		
//		팬 속도 조절
		com.setPanSpeed(80);
		
//		온도 확인
		System.out.println("온도 : " + com.getTemp());
		
	}

}
