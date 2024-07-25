package test.ex01;

//https://school.programmers.co.kr/learn/courses/30/lessons/120829

public class Main {

	public static void main(String[] args) {

		int result = 0;
		
		Solution sol = new Solution();
		
		result = sol.solution(70);
		System.out.println(result);
		
		result = sol.solution(91);
		System.out.println(result);
		
		result = sol.solution(180);
		System.out.println(result);
		
		result = sol.solution(90);
		System.out.println(result);
		
//		다른 테스트
		result = sol.solution(190);
		System.out.println(result);
		
		result = sol.solution(0);
		System.out.println(result);
		
		result = sol.solution(88);
		System.out.println(result);
		
		result = sol.solution(-8);
		System.out.println(result);
	}

}
