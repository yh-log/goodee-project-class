package test.ex03;

//https://school.programmers.co.kr/learn/courses/30/lessons/120815#

public class Solution {
	
    public int solution(int n) {
    	
//    	피자는 6조각
//    	n명이 피자를 주문할 때 모두 같은 수의 피자를 먹으려면 몇 판을 먹어야 하는지
    	
//      피자는 6조각
//      남기면 안된다. -> 딱 떨어지는 배수 찾기
    	
//      1. 일단 한판을 나눠 먹고 남는게 있다면
//      2. 또 시켜서 나눠먹고 남는게 있는지 확인
    	
    	
//    	[풀이 1]
    	
//        int answer = 0;
//        
//        if (n % 6 == 0) {
//			answer = n / 6;
//		} else if (n % 3 == 0) {
//			answer = n / 3;
//		} else if (n % 2 == 0) {
//        	answer = n / 2;
//    	} else {
//    		answer = n / 1;
//    	}
//        return answer;
        
    	
//    	[풀이 2]
    	
//        int piz = 1;
//        
//        while(true) {
//        	if(6*piz % n == 0) {
//        		return piz;
//        	}
//        	
//        	piz++;
//        }
        
        
//    	[풀이 3]
    	
//        int answer = 1;
        
//        System.out.println("인원 : " + n);
//        int remain = 6 % n;
//        System.out.println("남은 조각 수 : " + remain);
//        
//        while(remain > 0) {
//        	answer++;
//        	remain = answer * 6 % n;
//        }
//        
        
    	
//      [풀이 4]
        
    	int answer = 1;
    	System.out.println("인원 : " + n);
        
        while(true) {
        	if(answer*6%n==0) {
        		break;
        	}
        	
        	answer++;
        }
        
        return answer;
        
    }

}
