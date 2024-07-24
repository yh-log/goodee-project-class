package ex04;

public class Main {

	public static void main(String[] args) {

//		대입 연산자
		int result = 0;
		System.out.println("result = 0 : " + result);
	
		
//		복합 대입 연산자
//		result = result + 10
		result += 10;
		System.out.println("result += 10 : " + result);
		
//		result = result - 5;
		result -= 5;
		System.out.println("result -= 5 : " + result); // 5
		
//		result = result * 2;
		result *= 2;
		System.out.println("result *= 2 : " + result); // 10
		
//		result = result / 2;
		result /= 2;
		System.out.println("result /= 2 : " + result); // 5
		
//		result = result % 2;
		result %= 2;
		System.out.println("result %= 2 : " + result); // 1
		
		
//		대입 연산자 *응용*
		
		System.out.println(); // 그냥 한줄 비우기
		String str = "A";
		str += "B";
		str += "C";
		str += "D";
		System.out.println(str);
		
//		1~5 까지 더하기
		int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		System.out.println("1+2+3+4+5 = " + num); // 1+2+3+4+5 = 15   
		
		
		
	}

}