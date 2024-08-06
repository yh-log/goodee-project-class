package chap11.exam06;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		WorkThread th = new WorkThread();
		
		/* 양보를 통해 실행 순서가 변경 되기도 하지만
		 * 그 기회를 상대 thread가 잡지 못하면 자신이 실행하게 된다.
		 */
		
		th.setName("thread A");
		th.start();
		
		WorkThread th2 = new WorkThread();
		th2.setName("thread B");
		th2.start();
		
		th.yield = true; // A에게 양보 하라고 한다.
		Thread.sleep(500); // 0.5초 후에 ..
		
		th2.yield = true; // B에게 양보 하라고 한다.
		th.yield = false; // A도 계속 양보하면 서로 양보하는 상황이 되니까.
		Thread.sleep(500); // 0.5초 후에
		
		th.stop = true;
		th2.stop = true;
	}

}
