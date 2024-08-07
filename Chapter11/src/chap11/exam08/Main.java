package chap11.exam08;

public class Main {

	public static void main(String[] args) {

//		1. 함께 사용할 객체 생성
		WorkObj obj = new WorkObj();
		
//		2. 스레드 생성 (2개)
		WorkThread th1 = new WorkThread(obj);
		WorkThread th2 = new WorkThread(obj);
		
//		3. 실행
		th1.start();
		th2.start();
		
	}

}
