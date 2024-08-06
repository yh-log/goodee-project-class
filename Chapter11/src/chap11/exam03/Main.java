package chap11.exam03;

public class Main {

	public static void main(String[] args) {

		Thread th = new WorkThread(); // Thread-0
		th.start(); 
		
		th = new WorkThread();	 // Thread-1
		th.start();
		
		th = new WorkThread();	 // Thread-2
		th.setName("막내 스레드");
		th.start();
		
		
		Thread thread = new Thread();
		thread.setName("새롭게 만든");
		System.out.println(thread.getName() + "thread가 출력한 내용");
	}

}
