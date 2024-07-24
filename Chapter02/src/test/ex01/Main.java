package test.ex01;

public class Main {

	public static void main(String[] args) {

		int result = 0; // solution을 받아 줄 접시를 준비

		Solution sol = new Solution();
		result = sol.solution(2, 3);
		System.out.println("2 + 3 = " + result); // 5

		result = sol.solution(100, 2);
		System.out.println("100 + 2 = " + result); // 102
		
		result = sol.solution(50000, 50000);
		System.out.println("50000 + 50000 = " + result); // 100000
		
		result = sol.solution(-50000, -50000);
		System.out.println("(-50000) + (-50000) = " + result); // -100000
		
		
	}

}
