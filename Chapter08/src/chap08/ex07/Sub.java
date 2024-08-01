package chap08.ex07;

public class Sub {
	
//	main에게 문제를 던진다. (나한테 일을 시킨 사람에게 던지는 것이다.)
//	method1이 해결할 생각이 없으니 또 다시 던진다.
	void method1() throws Exception{
		method2(); // method2 에게 일을 시킨다.
	}
	
//	method1 에게 문제를 던진다. 
	void method2 () throws NumberFormatException {
//		혼자 일을 처리한다.
		Integer.parseInt("a1234"); // 처리하다가 문제 발생
	}

}
