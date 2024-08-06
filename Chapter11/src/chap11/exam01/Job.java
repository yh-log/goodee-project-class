package chap11.exam01;

public class Job implements Runnable {

	@Override
	public void run() { // 해야할 일

		for (int i = 1; i <= 5; i++) {
			System.out.println("워크 스레드가 하는 일");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
