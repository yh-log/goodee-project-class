package chap05.ex10.reaonly;

public class Person {

	final String nation;
	static final String ssn = "991231-123567"; // 누구도 건드릴수 없기때문에 값을 반드시 줘야 한다. (생성자로 건드릴 수 없기 때문에 값을 정의해 주어야 함)
	final String name;

//	일반 final은 생성자에서 초기화 한다.
	public Person(String nation, String name) {
		this.nation = nation;
		this.name = name;
		
		
	}

}
