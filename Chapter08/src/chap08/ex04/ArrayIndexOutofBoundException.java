package chap08.ex04;

public class ArrayIndexOutofBoundException {

	public static void main(String[] args) {

		String[] arr = new String[2]; // 2개 짜리 방 생성
		
		arr[0] = "data1";
		arr[1] = "data2";
		arr[2] = "data3"; // 2번 인덱스는 존재하지 않는다.
		
	}

}
