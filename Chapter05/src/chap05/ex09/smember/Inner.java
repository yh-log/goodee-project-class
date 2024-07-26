package chap05.ex09.smember;

public class Inner {

//	static member
	public static void main(String[] args) { // 원본 영역에 존재

		st_msg("hello static member"); // 같은 영역의 멤버 끼리는 편하게 부를 수 있다.

//		영역이 다를 경우
//		일반 멤버는 다른 클래스에서 부를때 처럼 객체화 한 후 불러야 한다.
		Inner in = new Inner();
		
		in.h_msg("hello mamber");
	}
	
	static void st_msg(String msg) { // 원본 영역에 존재
		System.out.println("static 멤버 메서드 : " + msg);
		
	}
	
	void h_msg(String msg) { // 복사본 영역에 존재
		System.out.println("멤버 메서드 : " + msg);
		
//		일반 영역에서 static 영역 부르기
		Inner.st_msg("static 멤버 부르기");
	}

}
