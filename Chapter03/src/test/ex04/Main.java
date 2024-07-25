package test.ex04;

//https://school.programmers.co.kr/learn/courses/30/lessons/120824

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
		
		int[] num_list1 = {1, 2, 3, 4, 5};
		
		int[] result = sol.solution(num_list1);
		
		int[] num_list2 = {1, 3, 5, 7};
		
		int[] result2 = sol.solution(num_list2);
		
		System.out.println(result[0] + "," + result[1]);
		System.out.println(result2[0] + "," + result2[1]);
		
		
				
		
	}

}
