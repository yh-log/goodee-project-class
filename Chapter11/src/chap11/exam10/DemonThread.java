package chap11.exam10;

public class DemonThread extends Thread {

	@Override
	public void run() {

		try {
			
			while(true) {
				Thread.sleep(500);
				System.out.println("work thread 실행 중...");
			}
		} catch (InterruptedException e) { // sleep가 있고 인터럽트익셉션이 있으니까 강제 인터럽트가 가능!
			e.printStackTrace();
		}
		
	}

}
