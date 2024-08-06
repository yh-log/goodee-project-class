package chap11.exam07;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {

//		메인 스레드 -> 계산 한 값을 출력
		System.out.println("1~100 까지 합은??");
		
//		Oper스레드 -> 1~100 까지 계산
		OperThread oper = new OperThread();
		oper.start(); // start를 하면 run이 실행되는 것이다.
//		스레드는 동시 수행이 가능하나 순서제어가 되지 않는다.
//		그래서 지금처럼 계싼하는 스레드보다 출력하는 스레드가 더 빠르면 결과를 낼 수 없다. 
		
		
//		계산할 시간을 주어야 얻고자 하는 답이 나온다.
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		oper.join(); // oper thread와 만날때 까지 기다려라
//		그 다음 아래를 실행한다.
		System.out.println("답 : " + oper.getSum()); // 답을 물어보는게 계산보다 빨라서 실행이 안됨
	}

}
