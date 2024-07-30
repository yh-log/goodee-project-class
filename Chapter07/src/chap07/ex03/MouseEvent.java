package chap07.ex03;

public interface MouseEvent{
	
//	interface에서는 기본이 추상 메소드이다.
	public void click(int btn);
	public void dblClick(int btn);
	public double[] move();
	
//	interface 에서 일반 메소드 생성 시 default 키워드를 붙임 (java 1.8부터 가능) 
	public default void wheel(int i) {
		if(i==1) {
			System.out.println("윗 방향으로 스크롤");
		} else {
			System.out.println("아랫 방향으로 스크롤");
		}
	}
	
	
//	static 메소드 가능 (java 1.8 부터 가능)
	public static void setDpi(int dpi) {
		System.out.println("감도 조절 : " + dpi);
	}
}
