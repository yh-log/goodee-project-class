package chap11.exam02;

public class AnnonyMain {

	public static void main(String[] args) throws InterruptedException {

//		1. 해야할 일 생성(상속받는 익명객체 만들기 : 자동완성 x)
		Thread thread = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("work thread run...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
			
		};
		
		
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread run...");
			Thread.sleep(500);
		}
		
	}

}
