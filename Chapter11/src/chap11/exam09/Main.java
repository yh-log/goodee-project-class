package chap11.exam09;

public class Main {

	public static void main(String[] args) throws InterruptedException {
/*
		StopFlag flag = new StopFlag();
		flag.start(); 		// 스레드 실행
		Thread.sleep(500);	// 0.5초 후
		flag.setStop(true); // stop 플래그 true 변경
	*/	
		Inter inter = new Inter();
		inter.start();
		Thread.sleep(500); // 0.5초 후
		inter.interrupt(); // 강제 인터럽트 발생
		
	}

}
