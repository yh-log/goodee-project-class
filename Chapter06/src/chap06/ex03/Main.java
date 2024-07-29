package chap06.ex03;

public class Main {

	public static void main(String[] args) {

//		사용자 입장에서는 사용하고 싶은 메소드에 따라 각각 객체화 해야 한다.
//		Operator op = new Operator();
//		System.out.println(op.plus(4, 3));
//		
//		Operator2 op2 = new Operator2();
//		System.out.println(op2.minus(4, 3));
//		
//		Operator3 op3 = new Operator3();
//		System.out.println(op3.multi(3, 2));
//		
//		Operator4 op4 = new Operator4();
//		System.out.println(op4.devide(8, 4));
		
//		상속을 받으면 사용자 입장에서는 Operator 하나만 객체화 해도 많은 메소드를 사용할 수 있다.
		Operator op = new Operator();
		System.out.println(op.plus(4, 3));
		System.out.println(op.minus(4, 3));
		System.out.println(op.multi(3, 2));
		System.out.println(op.devide(8, 4));
		
	}

}
