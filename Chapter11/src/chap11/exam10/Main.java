package chap11.exam10;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		
//		work thread 는 main thread 종료 여부와 상관 없이 본인의 일을 계속한다.
		Thread demon = new DemonThread(); // 다형성 (DemonThread 고유의 메소드가 없으니까 사용해도 ok)
		demon.setDaemon(true); // 이작업을 하면 워크스레드 -> 데몬스레드로 변경이 된다. false로 두면 다시 워크스레드로 돌아간다.
//		데몬 스레드는 메인스테드 종료와 함께 종료된다.
		demon.start();
		
		Thread.sleep(3000);
		
		System.out.println("메인 스레드 종료");
		
	}

}
