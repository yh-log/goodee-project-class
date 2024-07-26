package chap05.ex08.over;

public class Calculator {

	/* 매개변수의 갯수와 타입이 동일해서 안됨
	 * double plus(double c, int b) { 
	 * 	return c + b;
	 }*/

	double plus(double c, double c1) {
		return c + c1;
	}

	double plus(double c, long f) {
		return c + f;
	}

	double plus(double c, char g) {
		return c + g;
	}

	String plus(String a, String a1) {
		return a + a1;
	}

	String plus(String a, char g) {
		return a + g;
	}

	String plus(String a, int b) {
		return a + b;
	}

	String plus(String a, double c) {
		return a + c;
	}

	String plus(String a, float e) {
		return a + e;
	}

	String plus(String a, boolean d) {
		return a + d;
	}

	String plus(double c, String a1) {
		return c + a1;
	}

	int plus(int b, int b1) {
		return b + b1;
	}

	double plus(double c, int b) {
		return c + b;
	}

	public float plus(float e, int b) {
		return e + b;

	}

	public long plus(long f, long f1) {
		return f + f1;
	}

	public long plus(int b, long f) {
		return b + f;
	}

}
