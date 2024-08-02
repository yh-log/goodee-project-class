package test.ex03;

public class Main {

	public static void main(String[] args) {

		Solution sol = new Solution();
	
		int result = 0;
		
		int[] a = {1,4,2};
		int[] b = {5,4,4};
		
		result = sol.solution2(a, b);
		System.out.println(result);
		
		int[] c = {1,2};
		int[] d = {3,4};
		System.out.println(sol.solution2(c, d));
		
	}

} 


