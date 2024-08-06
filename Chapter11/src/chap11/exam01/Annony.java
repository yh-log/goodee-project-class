package chap11.exam01;

public class Annony {

	public static void main(String[] args) throws InterruptedException {

//		익명함수 만들기
//		1. 해야할 일 생성
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("워크 스레드가 돌리고 있었다.");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				
			}
		}; 
		
//		2. work Thread 생성
		Thread work = new Thread(runn);
		
//		3. Thread 실행
		work.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("메인 스레드가 돌리고 있었다.");
			Thread.sleep(500); // 스레드에게 0.5초 쉬라는 의미
		}
		
		
	}

}
