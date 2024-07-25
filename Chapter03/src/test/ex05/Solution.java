package test.ex05;

//https://school.programmers.co.kr/learn/courses/30/lessons/120841

public class Solution {
	
    public int solution(int[] dot) {
    	int answer = 0;
    	
//      2차원 배열이 아니라 배열에 인덱스가 2개인 것이다.
    	
    	int x = dot[0]; // 인덱스 0번에 들어오는 값
    	int y = dot[1]; // 인덱스 1번에 들어오는 값
    	
    	if( x > 0 && y > 0) {		// 모두 양수면 1
    		answer = 1;
    	} else if(x < 0 && y > 0){	// x만 음수면 2
    		answer = 2;
    	} else if(x < 0 && y < 0) {	// 모두 음수면 3
    		answer = 3;
    	} else if(x > 0 && y < 0) {	// y만 음수면 4
    		answer = 4;
    	}
    	
    	return answer;
    	
    	
//    	x, y 모두 양수면 : 1
//    	x가 음수 y가 양수면 : 2
//    	x가 음수, y도 음수면 : 3
//    	x가 양수, y가 음수면 : 4
    	
//        int x = dot[0] > 0 ? 1 : 0;
//        int y = dot[1] > 0 ? 1 : 0;
//        
//        if( x == 1 && y == 1) {
//        	answer = 1;
//        } else if(x == 0 && y == 1){
//        	answer = 2;
//        } else if(x == 0 && y == 0) {
//        	answer = 3;
//    	} else if(x == 1 && y == 0) {
//    		answer = 4;
//        }
        
        
    }

}
