package chap07.ex03;

public class Main {

	public static void main(String[] args) {

		MouseEvent mouse = null; // 인터페이스는 객체화되지 않는다. 
	
//		다형성은 부모-자식 관계가 아니고 구현 관계에서도 사용 가능하다. 
		mouse = new Window();
		mouse.click(1);
		mouse.dblClick(2);
	
		mouse = new Mac(); // 다형성 : 부모를 상속받은 자식은 부모 타입으로 들어갈 수 있듯이 인터페이스를 구현한 클래스도 인터페이스 타입으로 들어갈 수 있다.
		mouse.click(0);
		mouse.dblClick(0);
		
		mouse.wheel(1);
		
		MouseEvent.setDpi(75);
		
//		다중 구현한 인터페이스일 경우 다형성을 사용하면
//		들어간 현태의 인터페이스의 메소드(Override한 메소드 포함)만 사용 가능 하다. 
		KeyEvent key = null;
		
		key = new Window();
		key.keyDown(5);
		key.keyUp(3);
		
		
	}

}
