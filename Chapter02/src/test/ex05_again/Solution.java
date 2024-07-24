package test.ex05_again;

//https://school.programmers.co.kr/learn/courses/30/lessons/120830

//	[조건]
//	양꼬치 10 -> 음료 -1 (*서비스 음료는 무조건 마신다.)
//	양꼬치 n = 12000 , 음료 k = 2000

public class Solution {
	
    public int solution(int n, int k) {
    	
//    	[강사님 코드]
//        n : 양꼬치 12,000
//        k : 음료수 2,000
//        f : n/10 나눈 값 (소수점 없이)
    	
//    	int yang = 12000 * n;
//    	int drink = 2000 * k;
//    	int free = (n/10) * 2000; // int는 자동으로 소숫점을 버림
//    	
//    	int answer = yang + drink - free;
//    	
//    	return answer;
    	
    	
//    	[내가 작성한 코드]
    	
//    	이 코드도 가능은 하지만 n의 범위만 지정, k의 범위 지정 필요
//    	조금 더 간결한 코드진행을 고민해보면 좋을 듯
        int answer = 0;

        if(n > 0 && n < 1000) {
        	if(n >= 10) {
        		answer = (n * 12000) + ((k - (n/10)) * 2000);
        	} else {
        		answer = (n * 12000) + (k * 2000);
        	}
        } return answer;
        
        
        
        
        
//        if(n > 0 && n < 1000 && n >= 10 ) {
////        	이 조건을 걸어주면 n / 10 보다 k가 더 작을 경우 0이 반환됨
//        	if(k >= (n/10) && k < 1000) {
//        		answer = (n*12000) + ((k-(n/10)) * 2000);
//        	} else {
//        		answer = (n*12000) + (k * 2000);
//        	}
//        }
        
//      이렇게 하면 k에 제한을 걸 수 없음
//        if(n > 0 && n < 1000 && n >= 10 ) {
//       		answer = (n*12000) + ((k-(n/10)) * 2000);
//        	} else {
//        		answer = (n*12000) + (k * 2000);
//        }
//        
//        return answer;
//    }
    
//    if(n > 0 && n < 1000 && n >= 10 ) {
//    	if(k >= 0 && k < 1000) {
//    		answer = (n*12000) + ((k-(n/10)) * 2000);
//    	} else {
//    		answer = (n*12000) + (k * 2000);
//    	}
//    }

}

}