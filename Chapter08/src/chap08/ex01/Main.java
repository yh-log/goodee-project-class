package chap08.ex01;

public class Main {

	public static void main(String[] args) {

//		문자열 만들기 (가장 기본적인 방법)
		String str1 = "abcdefg";
		
//		자동완성을 통해서 다양한 생성자가 있음을 알 수 있다. (오버로드)
		String str2 = new String("abcdefg"); // 클래스이기 때문에 생성자로 객체화 가능 (많은 생성자가 오버로드 되어있다.)
		
		char[] alphabet = {'a','b','c','d','e','f','g'};
		String str3 = new String(alphabet);
		
		if (str1.equals(str2) && str2.equals(str3)) {
			System.out.println("모두 같은 문자열");
		}
		System.out.println(str1.charAt(0));
		
	}

}
