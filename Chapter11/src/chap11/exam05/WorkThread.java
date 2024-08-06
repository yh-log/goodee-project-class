package chap11.exam05;

public class WorkThread extends Thread {

	@Override
	public void run() {
		long cnt = 0;
		
//		실행
		for (int i = 1; i < 100000000; i++) {
			cnt++; 
		}  // (RUNNABLE)
		
		try {
			Thread.sleep(1500); // 1.5초 정지 (TIMED_WAITING)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		cnt = 0; // 실행
		for (int i = 1; i < 100000000; i++) { 
			cnt++;  
		} // (RUNNABLE) - 한바퀴 돌고 RUNNABLE로 돌아가는데 이 속도가 너무 빨라서 RUNNABLE이 계속 나오는 것이다.
	}

}
