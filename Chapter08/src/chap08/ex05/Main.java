package chap08.ex05;

public class Main {

	public static void main(String[] args) {

		String data1 = "1234";
//		String data2 = "adsfv";
		String data2 = "5678";
		
		try { // 문제가 생길 것 같은 코드

			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			System.out.println(val1 + val2);
			
		} catch (NumberFormatException e) { // 문제가 생겼을 때 처리 내용
			
			System.out.println("숫자만 입력하세요!"); // 문제가 안생기면 실행 x
			
		} finally { // 정상적이든 문제가 생기든 무조건 해야할 코드
			
			System.out.println("data1: " + data1);
			System.out.println("data2: " + data2);
			
		}
	}

}
