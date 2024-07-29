package chap06.ex07;

public class Dog extends Mammal {

//	Mammal 의 특성 - 나만의 것으로 개조
	@Override
	public void birth() {
		System.out.println("새끼를 5마리 낳는다.");
	}
	
//	강아지 고유 특성
	public void bark() {
		System.out.println("멍멍 하고 짖는다.");
	}
	
	

}
