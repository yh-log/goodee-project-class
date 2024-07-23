package ex02;

public class Two {

	public static void main(String[] args) {
		
		// % 연산은 나머지를 구하는 연산자 이다.
		// % 홀수/짝수 또는 특정 배수를 찾아내는데 많이 활용 된다.
		System.out.println("5%2="+5%2);
		
		// + 를 통해 문자 더하기도 가능하다.
		String str1 = "JDK"+11+0.32; // 문자 + 숫자
		System.out.println(str1);
		
		String str2 = str1+" ADD STRING"; // 문자 + 문자
		System.out.println(str2);
		
		String str3 = 11+0.32+" Version"; // 숫자 + 문자
		System.out.println(str3);
		
		// 110.32 Version
		String str4 = ""+11+0.32+" Version";
		System.out.println(str4);
		
		
	}

}
