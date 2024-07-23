package ex03;

public class Compare {

	public static void main(String[] args) {
		
		// 대입 연산자(=)
		int v1 = 1;
		double v2 = 1.0;
		int v3 = 3;
		String v4 = "JAVA";
		String v5 = new String("JAVA");
		
		// 비교연산
		System.out.println(v1 == v2);
		System.out.println(v1 != v2);
		System.out.println(v1 < v3);
		System.out.println(v4 == v5); // 문자열에 대한 비교는 == 로 하면 안된다.
		System.out.println(v4.equals(v5));
		
		
		int val = 6;
		
		if (val>1 && val <7) {
			System.out.println("val 은 1 초과 7미만 이다.");
		}
		
		if(val%2==0 || val%5==0) {
			System.out.println("val 은 2의 배수 이거나 5의 배수 이다.");
		}
		
		String input_id = "admin";
		String input_pw = "pass";
		
		if (input_id.equals("admin") && input_pw.equals("pass")) {
			System.out.println("로그인에 성공 했습니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
