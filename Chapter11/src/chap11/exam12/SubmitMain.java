package chap11.exam12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitMain {

	public static void main(String[] args) throws Exception {

//		1. 스레드 풀 생성
		int n = Runtime.getRuntime().availableProcessors(); // 6~16개가 생김
		
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
//		2. 대여 신청서 작성 : 실행 후 반환 값이 있을 경우
//		<> 제너릭 : 들어가는 인자값과 나가는 인자값이 동일
		Callable<String> call = new Callable<String>() {
			
			@Override
			public String call() throws Exception {

				System.out.println("Callable 처리");
				
				return "완료";
			}
		};
		
//		3. 양식 제출 (대여)
//			a. submit() 은 반환이 있으므로 Callable 실행에 사용
		Future<String> f = pool.submit(call);
		String result =  f.get(); // 반환받기 위해 사용 (blocking을 안쓰고 싶으면 get을 사용하지 않으면 된다.)
		System.out.println("반환 받은 값 : " + result);
		
		
//		4. 대여소 종료
		pool.shutdown();
		boolean end = pool.awaitTermination(1L, TimeUnit.SECONDS);
		System.out.println("진상들이 없었나? " + end);
	}

}
