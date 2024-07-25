package test.ex05;

//https://school.programmers.co.kr/learn/courses/30/lessons/120841

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		
		int[] dot1 = {3, 4};
		int[] dot2 = {-3, 4};
		int[] dot3 = {-3, -4};
		int[] dot4 = {3, -4};
		
		System.out.println(sol.solution(dot1));
		System.out.println(sol.solution(dot2));
		System.out.println(sol.solution(dot3));
		System.out.println(sol.solution(dot4));
		
	}

}
