package chap05.ex10.reaonly;

public class Main {

	public static void main(String[] args) {

		Person p = new Person("KOREA", "yihyun");
		
		System.out.println(p.name);
		System.out.println(p.nation);
		System.out.println(Person.ssn);
		
		
//		final은 read only 이기 때문에 생성자에서 초기화 후 변경 불가
//		p.name = "kim yi hyun";  
//		p.nation = "한국";
		
	}

}
