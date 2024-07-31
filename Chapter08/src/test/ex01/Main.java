package test.ex01;

//https://school.programmers.co.kr/learn/courses/30/lessons/120822

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		String result = null;
		
		result = sol.solution("jaron");
		System.out.println("noraj == " + result);
		
		result = sol.solution("bread");
		System.out.println("daerb == " + result);
		
		System.out.println();
	
		System.out.println("noraj == " + sol.solution2("jaron"));
		System.out.println("daerb == " + sol.solution2("bread"));
		
		System.out.println();
		
		System.out.println("noraj == " + sol.solution3("jaron"));
		System.out.println("daerb == " + sol.solution3("bread"));

		
	}

}
