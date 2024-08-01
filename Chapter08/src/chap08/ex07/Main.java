package chap08.ex07;

public class Main {

//	JVM(자바의 신) 에게 던진다. -> 책임을 지는 것이 아닌 printStackTrace를 찍어주고 끝난다. 
	public static void main(String[] args) throws Exception {

		Sub sub = new Sub();
		
//		method1 에게 일을 시킨다. 
		sub.method1();
		
	}

}
