package chap11.exam02;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

//		1. 해야할 일 생성
		Job job = new Job();
//		Thread thread = new Job(); // 형태로도 많이 활용함 (다른 자식이 있을 경우 저 변수 하나로 사용할 수 있으니까 = 다형성)
		
//		2. 워크 스레드 생성 => 상속 받았으니 별도로 생성하지 않아도 된다.
//		3. 워크 스레드 실행
		job.start();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread run...");
			Thread.sleep(500);
		}
		
	}

}
