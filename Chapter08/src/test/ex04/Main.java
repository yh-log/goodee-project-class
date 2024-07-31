package test.ex04;

//https://school.programmers.co.kr/learn/courses/30/lessons/120892

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		String result = "";
		
		result = sol.solution2("dfjardstddetckdaccccdegk", 4);
		System.out.println("attack".equals(result));
		System.out.println(result);
		
		
		result = sol.solution2("pfqallllabwaoclk", 2);
		System.out.println("fallback".equals(result));
		System.out.println(result);
		
	}

}
