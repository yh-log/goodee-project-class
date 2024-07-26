package chap05.ex04.myapi;

public class Main {

	public static void main(String[] args) {
		
		MyapiClass myApi = new MyapiClass();
		
		
//		우리가 Application 을 Programing 하는데
//		더하기라는 엄청 복잡한 기능을 plus() 메서드로 간단하게 해결 하였다.
		int result = myApi.plus(10, 20);
		System.out.println(result);
		
		
		
		
	}

}
