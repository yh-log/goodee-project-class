package chap11.exam08;

public class WorkObj {
	
	public synchronized void work() {
		
//		1. 아래 내용 실행
		System.out.println(Thread.currentThread().getName() + " 이 실행됨");
		
//		2. 쉬고 있는 스레드를 깨우고
		notify();
		
		try {
			wait(); // 3. 본인은 쉰다. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
