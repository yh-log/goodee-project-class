package test.ex01;

//https://school.programmers.co.kr/learn/courses/30/lessons/120822

public class Solution {
	
//	개요: 이 코드는 solution 에 매개변수로 주어진 문자열을 역순으로 출력하는 코드입니다.
//	설명: 1. 문자열을 역순으로 출력하는 .reverse() 메소드를 사용해주기 위해 StringBuffer 객체를 선언해줍니다.
//		  2. 이후 StringBuffer 객체인 answer에 매개변수로 주어지는 값을 .reverse()를 사용해 역순으로 바꿔주고
//	      3. 문자열로 출력하기 위해 .toString()를 사용해줍니다. 
	
//	1. StringBuffer 활용 (0.08ms ~ 0.15ms)
	public String solution(String my_string) {
		StringBuffer answer = new StringBuffer(my_string);
        return answer.reverse().toString();
    }
    
//  설명: 1. solution2에 매개변수로 주어지는 문자열을 맨 뒤부터 출력해주기 위해 for문을 사용해줍니다.
//        2. 뒤에부터 출력해야 하기 때문에 i는 my_string 길이의 -1로 줍니다.
//            * 여기서 -1을 해주는 이유는 인덱스의 끝을 만났을 때 -1을 반환하므로 그 전에 시작하기 위함
//        3. 그 뒤 i가 0이 될때까지 i를 1씩 감소해주면서 .charAt()메소드를 사용해 문자열 하나씩 더해
//        4. String 객체인 answer에 누적합으로 문자열을 더해줍니다.
    
	
//  2. 문자 배열을 활용한 방법1  
    public String solution2(String my_string) {
    	String answer = "";
    	
    	for(int i = my_string.length()-1; i >= 0; i--) {
    		answer += my_string.charAt(i);
    	}
    		
    	return answer;
    }
    
//    2-1. 문자 배열을 활용한 방법2 (0.03ms) *강사님
    public String solution3(String my_string) {
    	String answer = "";
    	
    	int len = my_string.length();				// 글자 길이를 파악하고
    		
    	char[] arr = new char[len];					// 길이 크기 만큼의 배열을 준비
    	
    	for(int i = 0; i < len; i++) {				// 순차적으로
    		arr[(len-1)-i] = my_string.charAt(i);	// 글자를 뽑아서 arr의 거꾸로 넣는다.
    	}
    	
    	answer = new String(arr);
    	
    	return answer;
    	
//    	return new String(arr); // answer 객체를 사용하기 싫으면 그릇(answer) 없이 객체 생성하고 바로 던질 수 있다.
    }
    
}
