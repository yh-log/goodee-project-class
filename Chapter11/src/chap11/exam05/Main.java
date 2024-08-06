package chap11.exam05;

public class Main {

	
	private static Thread.State state;
	
	public static void main(String[] args) {
		
		Thread work = new WorkThread();
		state = work.getState();
		System.out.println("STATE : " + state);
		work.start(); // 워크 스레드 시작
		
//		감시
		while (true) {
			state = work.getState();
			System.out.println("STATE : " + state);
			if(state == Thread.State.TERMINATED) {
				break;
			}
		}

	}

}
