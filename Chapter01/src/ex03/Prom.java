package ex03;

public class Prom {

	public static void main(String[] args) {
		//묵시적 형변환(Promotion)
		// 작은 컵에서 큰컵으로 옮기기 때문에 별도의 확인 절차가 필요 없다.
		byte byteVal;
		char charVal = 'a';
		int intVal = 0;
		long longVal;
		float floatVal;
		double doubleVal;
		
		// byte -> int
		byteVal = 10;
		intVal = byteVal;
		System.out.println(intVal);
				
		// char -> int
		intVal = charVal;
		System.out.println(intVal); // 문자가 숫자로 변경 할 수 있는 이유는 아스키 코드 때문이다.
		charVal = 'A';
		intVal = charVal;
		System.out.println("65="+intVal);
				
		// int -> long
		longVal = intVal;
				
		//float -> double
		floatVal = 0.01f;
		doubleVal = floatVal;
		
		

	}

}
