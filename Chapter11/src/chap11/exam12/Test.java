package chap11.exam12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws Exception {

//		1. 대여소 건설
		ExecutorService pool = Executors.newCachedThreadPool();
		
//		2. 작업요청서 작성
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : pool 실행");
			}
		};
		
		
		for (int i = 0; i < 10; i++) {
			Future<?> f = pool.submit(runn); // 3. 빌려달라고 요청
			f.get();
		}
		
		System.out.println("작업 종료");
		
//		4. 문 닫기
		pool.shutdown();
		boolean end = pool.awaitTermination(2L, TimeUnit.SECONDS);
		
		
		/*
//		Thread pool을 만들어 (for문이 돌 때마다 스레드에게 시켜야 한다.)
//		Thread pool을 10번 출력하게 한다.
		
//		각각 스레드가 돌면서 스레드 풀을 돌리려면..
//		1. Thread pool을 생성한다.
		int n = Runtime.getRuntime().availableProcessors();
		
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
//		수행할 작업을 만든다.
		
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {
				
				
				System.out.println("Thread poll");
				
				
			}
		};
		
		for (int i = 0; i < 10; i++) {
			pool.execute(runn);
			
//			이게 익명객체 안에 들어가야 다른 스레드 이름이 나온다. 
			System.out.println(Thread.currentThread().getName() + " 이 출력");
		}
		
//		for (int i = 0; i < 10; i++) {
//		}
		
		pool.shutdown();
		pool.awaitTermination(1L, TimeUnit.SECONDS);
				

 * 
 */
	}

}
