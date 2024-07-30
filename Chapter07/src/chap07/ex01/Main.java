package chap07.ex01;

public class Main {

	public static void main(String[] args) {

		Person person = new Person("000");
		person.birth();
		person.social();
		
//		추상클래스는 자식 외에는 객체화 할 수 없다. 
//		Mammal m = new Mammal();
	}

}
