package chap06.ex01;

public class Main {

	public static void main(String[] args) {

//		Person을 객체화 했지만
//		Mamal의 기능도 사용 가능하다.
		
		Person person = new Person();
		
		person.brith(); 	// Mamal
		person.eat(); 		// Mamal
		
		person.useTool();	// Person
		person.social();	// Person
		person.talk();		// Person
	}

}
