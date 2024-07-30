package chap07.ex05;

public class Main {

	public static void main(String[] args) {

		Child child = new ChildImple();
		
//		다중 인터페이스 구현시 인터페이스들 끼리의 상속을 이용하면
//		다형성을 활용할 때 제한되는 내용을 해결할 수 있다.
		child.click(0);
		child.dblClick(3);
		child.wheel(0);
		
		child.keyDown(3);
		child.keyUp(4);
		
		child.testField("아무거나 입력");
		child.selectOne();
		child.checkOne();
	}

}
