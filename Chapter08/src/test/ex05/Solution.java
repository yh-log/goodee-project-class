package test.ex05;

//https://school.programmers.co.kr/learn/courses/30/lessons/120839

public class Solution {
	
//	가위 = 2, 바위 = 0, 보 = 5
//	2를 이기려면 0 , 0을 이기려면 5
	
	
//  1.85ms ~ 2.64ms
    public String solution(String rsp) {
        String answer = "";
        
        String[] arr = rsp.split("");
    
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i].equals("2")) {
        		answer += "0";
        	} else if (arr[i].equals("0")) {
        		answer += "5";
        	} else {
        		answer += "2";
        	}
		}
        return answer;
    }
    

//  0.14ms ~ 0.34ms 
//  문자열의 누적합은 효율성이 낮아지므로 StringBuffer 사용
  
//  [설명] 1. rsp에 들어오는 문자열을 하나씩 비교하기 위해 .split("") 메서드를 사용
//    	   2. 하나씩 분리한 문자열을 String 배열 arr에 넣기
//         3. 하나씩 비교해주기 위해 for문을 이용해 배열의 길이만큼 반복
//         4. for문을 반복하면서 if문으로 문자열의 조건에 따라 StringBuffer에 값 넣어주기
//            * 문자열의 길이가 100개까지 늘어나므로 StringBuffer을 이용해 효율성을 높이기
//         5. 완료된 StringBuffer를 문자열로 return하기 위해 .toString()를 이용
//    *split은 속도가 느리다. 
    
    public String solution2(String rsp) {
        
        StringBuffer buffer = new StringBuffer();
        
        String[] arr = rsp.split(""); // charAt 또는 toCharArray 로 해주는 방법도 있음
    
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i].equals("2")) {
        		buffer.append("0");
        	} else if (arr[i].equals("0")) {
        		buffer.append("5");
        	} else {
        		buffer.append("2");
        	}
			
		}
        
        return buffer.toString();
    }
    
    
//  switch를 이용한 방법
//  if 보다는 switch 문이 더 빠르다.
//  0.07ms ~ 0.13ms
    public String soluttion3(String rsp) {
    	StringBuffer buffer = new StringBuffer();
    	
    	for (int i = 0; i < rsp.length(); i++) {

    		switch (rsp.charAt(i)) {
			case '2' :
				buffer.append("0");
				break;
			
			case '0' : 
				buffer.append("5");
				break;
				
			case '5' : 
				buffer.append("2");
				break;
				
			}
    		
		}
    
    	return buffer.toString();
    }
    
    
}
