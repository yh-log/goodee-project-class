package chap07.ex02;

public abstract class Abs {
	
	public void parent() {
		System.out.println("그냥 쓰거나 오버라이드 해도 되는 메소드");
	}
	
//	추상 메서드(몸체가 없는 메서드)
//	자식이 꼭 오버라이드 해야 하는 메서드 - 강제로 오버라이드 시킨다.
	public abstract void must1(); // 오버라이드 하면 몸체를 작성할 수 있으니 자식만 사용하라는 의미
	
	public abstract void must2();

}
