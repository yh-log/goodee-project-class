package chap05.ex03.ins;

public class Main {

	public static void main(String[] args) {

//		1. Student 형태를 담을 변수를 준비
//		2. 새로(new) Student 를 복사해서 가져온다.
		Student std = new Student(); 
		Student std2 = new Student();
//		-> std 와 std2는 복사본이기 때문에 서로 다른 일련번호를 가지고 있다.
//		-> 즉 std와 std2를 같지 않다. (그래서 String를 비교할 때 == 이 아닌 equals를 사용)

		System.out.println(std);
		System.out.println(std2);
		
		String str = "안녕하세요";

		
		
		
	}

}
