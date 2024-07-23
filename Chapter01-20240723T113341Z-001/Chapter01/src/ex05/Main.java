package ex05;

public class Main {

	public static void main(String[] input) {
		// 빵이 구워져 나오면 받아줄 접시를 준비
		String dish = toaster("통밀빵");
		System.out.println(dish);
	}
	
	//반환타입 메서드이름(매개변수)
	static String toaster(String input) {
		System.out.println(input+" 이 구워진다.");
		return "구워진"+input;
	}
	

}
