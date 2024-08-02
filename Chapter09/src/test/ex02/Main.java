package test.ex02;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		long result = 0;
		
		result = sol.solution4("onetwothreefourfivesixseveneightnine");
		System.out.println(123456789 ==  result);
		
		result = sol.solution4("onefourzerosixseven");
		System.out.println(14067 == result);
		
		
	}

}
