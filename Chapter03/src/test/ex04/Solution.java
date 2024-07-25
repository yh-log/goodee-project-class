package test.ex04;

//https://school.programmers.co.kr/learn/courses/30/lessons/120824

public class Solution {
	
    public int[] solution(int[] num_list) {
    	
//    	num_list 는 정수가 담긴 리스트
//    	num_list 의 원소 중 짝수의 개수와 홀수의 개수를 담은 배열을 리턴
    	
//    	일단은 짝수일 때 ( ? % 2 == 0)
//    		   홀수일 때 ( ? % 2 != 0)
//    	개수를 담아야 하니까 for문으로 돌려야 함
    	 	
        int[] answer = new int[2];
        
        int count1 = 0;
        int count2 = 0;
        
        
        for (int i = 0; i < num_list.length; i++) {
			if(num_list[i] % 2 == 0) {
				count1++;
			} else {
				count2++;
			}
        	
        }
        
        answer[0] = count1;
        answer[1] = count2;
        
        
        return answer;
    }
    
    
    public int[] solution2(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
    
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
