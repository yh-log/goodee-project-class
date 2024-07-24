package test.ex02;

//https://school.programmers.co.kr/learn/courses/30/lessons/120803

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int result = 0;
		
		result = sol.solution(2, 3);
		System.out.println(result);
		
		result = sol.solution(100, 2);
		System.out.println(result);

		result = sol.solution(50000, 50000);
		System.out.println(result);
		
		result = sol.solution(-50000, -50000);
		System.out.println(result);
		
		result = sol.solution(-50000, 50000);
		System.out.println(result);
		
		
	}

}
