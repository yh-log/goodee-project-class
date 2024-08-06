package chap11.exam07;

public class OperThread extends Thread {

	private int sum; // 캡슐화로 보호
	
//	캡슐화를 이용해서 외부에서 sum에 대한 값은 건드리지 못하게 하고, 
//	오직 볼 수 있는 메서드만 열어주었다.
	public int getSum() {
		return sum;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		
	}

}
