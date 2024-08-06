package chap11.exam01;

public class MainThread {

	public static void main(String[] args) throws InterruptedException { // main thread 를 생성하는 메서드

//		work Thread 생성
//		1. 해야할 일을 가져온다.
		Job job = new Job();
//		2. 워크 스레드 생성
		Thread work = new Thread(job);
//		3. 워크 스레드 실행
		work.start();
		
//		main Thread
		for (int i = 1; i <= 5; i++) {
			System.out.println("메인 스레드가 돌리고 있었다.");
			Thread.sleep(500); // 스레드에게 0.5초 쉬라는 의미
		}
		
	}

}
