package chap05.ex11.imp;

import chap05.ex08.over.Calculator;

public class Main {

	public static void main(String[] args) {

//		같은 package에 있는 class는 import 없이 사용 가능
		Info info = new Info();
		System.out.println(info.age);
		System.out.println(info.job);

		
//		다른 package는 import문을 사용하여 불러와야 한다.
		Calculator cal = new Calculator();
//		불러올 메소드는 public 키워드가 있어야 불러올 수 있다.
		cal.plus("A", "B");
		
	}

}
