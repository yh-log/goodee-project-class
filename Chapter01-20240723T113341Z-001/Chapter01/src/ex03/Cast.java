package ex03;

public class Cast {

	public static void main(String[] args) { // 뭔지는 모르지만 이게 있어야 자바 프로그램이 동작 된다.
		
		// 큰 컵 에서 작은 컵으로 이동하거나, 형태가 다른 컵으로 이동할때 명시적 형변환
		// 이클립스에서 자동으로 잡아준다.
		char charVal;
		int intVal;
		long longVal;
		float floatVal;
		double doubleVal;
		
		
		intVal = 74;
		charVal = (char) intVal; // 명시적 형변환
		System.out.println(charVal);
		
		longVal = 500;
		intVal = (int) longVal;
		
		doubleVal = 3.14;
		floatVal = (float) doubleVal;
		


	}

}
