package ex02;

public class Main { // class
	
	String str = "some text"; // 클래스 안에서 사용 가능

	public static void main(String[] args) { // method

		int number = 123; // 메서드 안에서 사용 가능
		
		for (int i = 0; i < 10; i++) {//statement
			int sum = number+i;// for 문 밖을 나갈 수 없다.
			System.out.println(sum);
		}
		//System.out.println(sum); // sum 은 for 문 밖을 나갈수 없다.
	}

}
