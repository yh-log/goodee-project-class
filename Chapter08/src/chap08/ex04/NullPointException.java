package chap08.ex04;

public class NullPointException {

	public static void main(String[] args) {

//		null 인 값을 가지고 무언가를 할고 할 때 발생하는 예외
		String data = null; // 숫자는 null이 존재하지 않는다.
		data.contains("a");
		
	}

}
