package ex05;

public class Main {

	public static void main(String[] args) {

//		3항 연산자
		int score = 79; // 91, 90, 80, 79 (테스트 케이스를 뽑아줘야 함)
		
//		char grade = score > 90 ? 'A' : 'B';
//		System.out.println(grade); // B
		
//		score가 90 보다 크면 A, 80보다 크면 B, 아니면 C
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		} // B 출력
		
//		var = condition ? value1 : condition ? value2 : value3 (value3에 condition을 넣을 수 있지만 통상적으로 넣지는 않음)
		char grade = score >= 90 ? 'A' : score >= 80 ? 'B' : 'C';
		System.out.println(grade);
	
	}

}
