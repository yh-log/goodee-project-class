package chap11.exam04;

public class Computer {
	
	private int score;
	
//	동기화 이전
//	public void setScore(int score) {
//		this.score = score; // 점수를 넣고
//		
//		try {
//			Thread.sleep(2000); // 2초 휴식
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		 // 점수 확인
//		System.out.println(Thread.currentThread().getName() + " : " + this.score);
//	}
	
//	동기화 메서드 방식 : 메서드 안에 오직 하나의 스레드만 들어갈 수 있다.
//	나머지는 메서드 밖에 줄 서 있는다.
//	public synchronized void setScore(int score) {
//		this.score = score; // 점수를 넣고
//		
//		try {
//			Thread.sleep(2000); // 2초 휴식
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		 // 점수 확인
//		System.out.println(Thread.currentThread().getName() + " : " + this.score);
//	}
	
//	동기화 블록 방식 : 메서드 까지는 여러 스레드가 들어갈 수 있으나, 특정 영역에는 혼자만 들어갈 수 있다.
	public synchronized void setScore(int score) {
		
		synchronized (this) { // 현재 사용중인 객체가 들어가야 함
			this.score = score; // 점수를 넣고
			
			try {
				Thread.sleep(2000); // 2초 휴식
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 점수 확인
			System.out.println(Thread.currentThread().getName() + " : " + this.score);
		}
		
	}
	
	
	
	

}
