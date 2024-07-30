package chap07.ex04;

public class Main {

	public static void main(String[] args) {
		
//		인터페이스는 실체가 없기 때문에 객체화 되지 않는다. 
//		그래서 인터페이스를 구현해 줄 클래스가 필요하다. (인터페이스는 클래스에 기생한다.)
		Common comm = new CommonImpl(); // 인터페이스는 객체화가 안되기 때문에 CommonImpl을 객체화 함
		comm.test1();
		comm.test2();
		
//		인터페이스를 강제로 객체화 하려고 한다면?
//		클래스로 객체화를 하는 것과 인터페이스로 객체화를 하는 것의 다른 점 (클래스의 이름이 없다)
//		정상적인 객체에는 클래스가 있다.
//		그런데 인터페이스에는 클래스가 없으니까 필요한 클래스를 즉시 만들어주는 것
//		
		
//		익명 
//		여기서 익명은 인터페이스를 구현해 줄 클래스 이름이 없다는 뜻이다
//		왜 이름이 없나? -> 여기서 일회성으로 사용되고 없어질 거니까 
		Common anony = new Common() { // 원래는 public class Test implements common 으로 만들어야 한다
			
			@Override
			public void test2() {
				System.out.println("anony inner type2");
			}
			
			@Override
			public void test1() {
				System.out.println("anony inner type1");
			}
		};
		
		anony.test1();
		anony.test2();
		
		
	}

}
