package chap06.ex05;

// 하나의 자바파일에는 한개 이상의 클래스를 생성할 수 있다. (권고 x)
// public은 파일명과 동일한 클래스에만 사용 가능하다.
public class Child extends ParentHouse {

	@Override
	public void useRoom() {
		System.out.println("첫째가 방을 사용 한다.");
	}

}

class ChildOne extends ParentHouse { // public를 달려면 클래스 파일명과 클래스 이름이 동일해야 한다

	@Override
	public void useRoom() {
		System.out.println("둘째가 방을 사용 한다.");
	}

}

class ChildTwo extends ParentHouse { 

	@Override
	public void useRoom() {
		System.out.println("셋째가 방을 사용 한다.");
	}

}

class ChildThree extends ParentHouse {

	@Override
	public void useRoom() {
		System.out.println("넷째가 방을 사용 한다.");
	}

}

