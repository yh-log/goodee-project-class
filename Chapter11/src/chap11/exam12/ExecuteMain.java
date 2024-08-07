package chap11.exam12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteMain {

	public static void main(String[] args) throws InterruptedException {

//		1. thread pool 생성 (대여소 만들기)
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
//		2. 대여 양식 작성 : 실행 후 반환값이 없을 경우
//			Runnable interface를 다른 클래스도 사용하면 별도의 class로 만들어야 하지만 여기서만 사용할 경우 익명객체로 생성
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable 처리!!");
			}
		};
		
//		3. 양식 제출 (대여)
//			a. excute() 는 반환이 없으므로 Runnable 실행에 사용
		pool.execute(runn);
		
//			b. Runnable 는 submit() 도 사용 가능하다. (뒤에서 나옴)
		
		
		
//		4. 대여소 종료 
		pool.shutdown(); // 스레드들이 다 나올때 까지 무조건 기다린다.
		boolean end =  pool.awaitTermination(1L, TimeUnit.SECONDS); // 너무 빠르면 그러니까 보통 초로 준다.
		System.out.println("진상들이 없었나? " + end);
		
		
		
	}

}
