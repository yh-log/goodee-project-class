package chap11.exam13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {
					try {
						for (int i = 1; i <= 10; i++) {
							System.out.println("작업 처리 중: " + i);
							Thread.sleep(500);
						}
					} catch (InterruptedException e) {
						System.out.println("예외 발생으로 빠져 나옴");
					}
				}
		};
		
//		Future를 만들어도 반환하는 데이터타입이 없어서 와일드 카드 ? 를 작성한다.
		Future<?> f =  pool.submit(runn); 
		f.get(); // join과 같이 blocking 을 수행해준다.
		/* Runnable 로 구현하는 내용도 blocking 을 하고 싶을 수 있어서
		 * execute() 뿐 아니라 submit()도 사용할 수 있게 해준 것
		 */
		
		System.out.println("==========작업 종료==========");
		
		
		pool.shutdown();
		
	}

}
