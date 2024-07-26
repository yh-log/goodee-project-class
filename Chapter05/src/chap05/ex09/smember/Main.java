package chap05.ex09.smember;

public class Main {

	public static void main(String[] args) {

//		static 멤버는 객체화 해서 사용하지 않는다. (원본 영역에 있어서 객체화를 하지 않는다.)

		Sub sub = new Sub();

//		일반 멤버들은 객체화 해서 사용하면 된다.
		System.out.println(sub.filed);
		System.out.println(sub.multi(3, 4));

//		static 멤버는 어떻게 사용하나?
//		원본으로 직접 가서 가져온다.
//		static은 객체화 해서 사용 못한다.
		System.out.println(Sub.sFiled);
		System.out.println(Sub.plus(5, 5));
		System.out.println(Sub.minas(2, 1));

//		사실은 객체 에서도 불러올 수는 있다.
//		사람들이 실수를 자주 하는 부분이라 허용은 하지만 경고를 한다.
//		객체를 통해 원본을 찾아서 원본 영역에 접근하는 것이라 효율성이 떨어진다.
		System.out.println(sub.sFiled);
		System.out.println(sub.minas(5, 3));
		System.out.println(sub.plus(1, 2));

//		static 과 일반 변수의 차이
		Sub sub2 = new Sub();

		sub2.filed = 1000; // 일반 필드는 어느 한 곳에서 변경해도 다른 쪽에 영향을 받지 않는다.
		System.out.println("sub.filed = " + sub.filed); // 1 출력
		System.out.println("sub2.filed = " + sub2.filed); // 1000 출력

		sub2.sFiled = 3000; // static 필드는 해당 객체의 원본을 건드리므로 모두에게 영향을 준다.
		System.out.println("sub.sFiled = " + sub.sFiled); // 3000 출력
		System.out.println("sub2.sFiled = " + sub2.sFiled); // 3000 출력

	}

}
