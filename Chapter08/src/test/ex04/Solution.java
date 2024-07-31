package test.ex04;

//https://school.programmers.co.kr/learn/courses/30/lessons/120892

public class Solution {
	
//	code의 배수만큼만 출력된다.
//	0번 부터가 아닌 1번부터 진행해야하며 (code % == 0)
//	4, 8번째 글자를 출력하려면 3번 7번 인덱스를 출력해야한다.(값에 -1을 해준다.)
	
//	0.07ms ~ 0.35ms
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuffer buffer = new StringBuffer();
        
        for (int i = 1; i <= cipher.length(); i++) {
        	if(i % code == 0) {
        		buffer.append(cipher.charAt(i-1)); // 인덱스는 0부터 시작이기 때문에 -1을 해준다. 
        	}
		}
        
        answer = buffer.toString();
        return answer;
    }
    
//  반복횟수 줄이기
//  0.08ms ~ 0.32ms
    public String solution2(String cipher, int code) {
    	
        String answer = "";
        StringBuffer buffer = new StringBuffer();
        
        for (int i = 1; i <= cipher.length()/code; i++) {
       		buffer.append(cipher.charAt(code*i-1));
		}
        
        answer = buffer.toString();
        return answer;
    }
        
        
//        String[] arr = cipher.split("");
        
//        arr[0] = " ";
        	
//        for (String str : arr) {
//        	if(code % code == 0) {
//				buffer.append(str);
//		}
//        	answer = buffer.toString();
//        }
        
//        for(int i = 0; i >= arr.length; i++) {
//        	if(i % code != 0) {
//        		continue;
//        	}
//        	buffer.append(arr);
//        }
        
//      for(int i = 1; i <= cipher.length(); i++) {
//    	if(i % code == 0) {
//    		arr[i+1] = cipher;
//    	}
//    }
        

}
