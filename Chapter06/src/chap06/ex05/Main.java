package chap06.ex05;

public class Main {

	public static void main(String[] args) {

//		1. 자식들을 각각 객체화 하여 useRoom 메서드 사용
		Child child = new Child();
		child.useRoom();
		
		ChildOne childOne = new ChildOne();
		childOne.useRoom();
		
		ChildTwo childTwo = new ChildTwo();
		childTwo.useRoom();
		
		ChildThree childThree = new ChildThree();
		childThree.useRoom();
		
		System.out.println();

//		객체가 4개가 아니라 30~40개라면 30~40개의 변수를 선언해 줘야 한다.
//		다형성을 활용하면 하나의 변수만 선언하고 여러 객체를 사용할 수 있다.

		ParentHouse house; // 부모형태의 변수 하나 선언
		
		house = new Child();
		house.useRoom();
		
		house = new ChildOne();
		house.useRoom();
		
		house = new ChildTwo();
		house.useRoom();
		
		house = new ChildThree();
		house.useRoom();
		
	}

}
