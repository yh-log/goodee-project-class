package chap07.ex01;

public class Person extends Mammal {

	public Person(String name) {
		super(name); // 부모 생성자 (너무 당연하기 때문에 기본 생략되어 있지만 이름, 목적 등을 넣어줄 때에는 생성자를 넣어줘야 한다.)
	} // 자식 생성자를 만들 때에는 부모의 이름을 넣어줘야 한다.

//	name이라는 변수는 부모인 Mammal 에게 있기 때문에 자식이 내 것 처럼 사용할 수 있다.
	public void useTool() {
		System.out.println(name + " 가 도구를 사용 한다.");
	}
	
	public void social() {
		System.out.println(name + " 가 사회생활을 한다.");
	}
	
	public void talk() {
		System.out.println(name + " 가 이야기를 한다.");
	}
	
}
