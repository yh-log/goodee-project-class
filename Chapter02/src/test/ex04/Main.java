package test.ex04;

//https://school.programmers.co.kr/learn/courses/30/lessons/120807

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int result = 0;
		
		result = sol.solution(2, 3);
		System.out.println("-1 : "+result);
		
		
		result = sol.solution(11, 11);
		System.out.println("1 : "+result);
		
		result = sol.solution(7, 99);
		System.out.println("-1 : "+result);
		
		result = sol.solution(-7, 10001);
		System.out.println("0 : "+result);
		

	}

}
