package chap11.exam03;

public class WorkThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName() + "thread 가 출력한 내용");
		}
		
	}

}
