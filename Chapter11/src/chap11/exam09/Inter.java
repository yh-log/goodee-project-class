package chap11.exam09;

public class Inter extends Thread {

	@Override
	public void run() {

		/*
//		강제로 예외를 발생해서 catch로 보내는 원리
//		InterruptedException 은 sleep(), wait() 등에서만 일어난다. (뭔가 멈추는 애들)
		try {
			while(true) {
				System.out.println("Inter 실행 중...");
				Thread.sleep(1); // InterruptedException 가 걸리는 조건을 만들기 위해서 넣어주는 부분
			}
			
		} catch (InterruptedException e) {
			System.out.println("자원 정리");
			System.out.println("종료");
		}
		*/
		
//		sleep , try-catch를 해 줄 필요가 없다!
//		현재 인터럽트가 걸려있는지 확인 후 빠져나오는 원리
//		예외를 발생시키기 위해서 sleep 을 넣을 필요가 없다. (장점) (sleep을 넣을 일이 없으면 이 방법을 쓰고 sleep(실행 간격이 필요할 경우)을 사용할 경우 위에 방법 사용)
		while(true) {
			System.out.println(Thread.currentThread().getName() +  "Inter 실행 중...");
			if (Thread.interrupted()) { // interrupted() : 내가 인터럽트에 걸렸는지 물어보는 메서드 (t/f로 대답)
				break;
			}
		}
		
		System.out.println("자원 정리");
		System.out.println("종료");
		
	}

}
