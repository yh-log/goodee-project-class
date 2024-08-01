package chap08.ex04;

public class NumberFormatException {

	public static void main(String[] args) {

		String data;
		int val;
		
//		"1234" → 1234 로 바꿔보기
		data = "1234";
		val = Integer.parseInt(data);
		System.out.println(val);
		
		data = "1234a";
		val = Integer.parseInt(data);
		System.out.println(val);
		
	}

}
