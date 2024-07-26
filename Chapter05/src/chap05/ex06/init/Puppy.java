package chap05.ex06.init;

public class Puppy {

//	이 객체가(이 클래스가) 사라질 때 까지 이름과 목적이 유지된다.
	public String name;
	public String goal;

	
//	오버로드(과적) : 본래는 하나만 만들 수 있지만 같은 이름으로 여러개를 만들수 있도록 허용하는 것
//	조건 : 매개변수의 갯수나 데이터 타입은 달라야 한다.
	
	
	public Puppy(String name, String goal) { // 1. 이름과 목적을 받아왔지만 생성자가 사용되고 나면 사라져 버린다.
//		그래서 받아온 name을 여기에 있는 name에 넣어 준다.
		this.name = name; // 생성자 안에 있는 name이 클래스 안에 있는 name에 넣어준다.
		this.goal = goal;
	}
	
//	매개변수의 갯수가 다르므로 같은 이름으로 생성가능
	public Puppy(String name) {
		this.name = name;
	}
	
//	매개변수의 갯수가 다르므로 같은 이름으로 생성가능
	public Puppy() {
		
	}
	
//	매개변수의 갯수는 같지만 데이터 타입이 다르므로 같은 이름으로 생성가능
	public Puppy(int age) {
		
	}

}
