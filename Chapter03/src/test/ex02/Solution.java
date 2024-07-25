package test.ex02;

public class Solution {
	
    public int solution(int n) {
    	int answer = 0;
        
//			1. 1 ~ n까지 출력
//			2. 그 중에서 짝수만 출력
//			3. 짝수만 합하기
    	
    	for (int i = 1; i <= n; i++) {
    		if(i % 2 == 0) {	
    			answer += i;
    		}
    	} 
    	return answer;
    	
//    	[3항 연산자로도 풀이 가능]
//    	for (int i = 1; i <= n; i++) {
//    		answer = i%2==0? answer += i : answer;
//    	}
    	
    	
    	
//      1. n 이하의 짝수를 더하기 if(n % 2 ==0)
    		
//    		for (int i = 1; i < n; i++) {
//    			if(n % 2 ==0) {
//    				answer += n;
//    			}
//			}
//    		return answer;
    			
    		
//    		if(n % 2 == 0) { // n이 짝수면
//    			for(int i = 1; i < n; i++) {
//    				answer += n;
//    			}
//    			
//    		}
//			return answer;
			
//			for(int i = 1; i < n; i++) {
//				if(n % 2 != 0) {
//					continue;
//				}
//				answer = n + n;
//			}
//			return answer;
			
//			1. 짝수를 모두 더한 값 
//			n % 2 == 0 이라면 수를 모두 더해라
			
//			if(n % 2 == 0) {
//				for(int i = 1; i < n; i++) {
//					answer += n;
//				}
//			}
//			return answer;
			
    	
			
    }


}
