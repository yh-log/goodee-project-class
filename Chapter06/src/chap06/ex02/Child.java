package chap06.ex02;

public class Child extends Parent {

	public Child() {
		
//		super(); // 부모 생성자를 부르는 키워드(생락되어 있다. _ 너무 당연하기 때문에)
//		생략하지 않을 때에는 생성자처럼 무언가를 강제로 넣어주는 경우에사용한다.
//		super(); 를 사용할 경우 가장 위에 있어야 한다. (부모가 가장 위에 있어야 하니까)
		
		System.out.println("자식 생성자 호출");
		
	}

}
