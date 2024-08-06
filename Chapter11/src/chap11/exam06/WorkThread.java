package chap11.exam06;

public class WorkThread extends Thread {

	boolean stop = false;
	boolean yield = false;
	
	
	@Override
	public void run() {
		
		while (!stop) {
			System.out.println(getName() + "동작");
			if (yield) {
				System.out.println(getName() + " 이 양보");
				Thread.yield(); // 양보
			}
			
			try {
				Thread.sleep(100); // 0.1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "정지");
	}

}
