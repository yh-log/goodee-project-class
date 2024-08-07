package chap11.exam13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		1. 대여소 세우기
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
//		2. Callable로 작업 요청서 만들기 - 1~100까지 더한 합을 반환하는 작업 (계산보다 답을 출력하는게 더 빨라서 join을 썼었다.)
		Callable<Integer> call = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {

				int sum = 0;
				for (int i = 1; i <= 100; i++) {
					sum += i;
				}
				System.out.println(sum);
				return sum;
			}
		};
		
//		3. 작업 요청하기 (대여)
		Future<Integer> f =  pool.submit(call);
//		=========================================== 여기서 Future를 받을 때까지 block를 하고 있다. submit을 통해 f에 값이 들어오면 열어준다.
		System.out.println("1~100 까지의 합은 : " + f.get());
		
//		4. 1초 기다렸다가 문 닫기
		pool.shutdown();
		
	}

}
