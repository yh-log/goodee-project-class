package test.ex03;

//https://school.programmers.co.kr/learn/courses/30/lessons/120826

public class Solution {
	
	

//	0.02ms ~ 0.0ms
//	방법 1. replace 메소드를 활용해 my_string에 letter 제거
	public String solution(String my_string, String letter) {
		
		String answer = my_string.replace(letter, "");
		
        return answer;
        
//      받아줄 접시 없이 아래 처럼도 사용 가능
//      return my_string.replace(letter, "");
    }
	
	
//	0.26ms ~ 0.56ms 
//	방법 2. StringBuffer과 배열을 활용한 풀이
//	my_string 을 배열화 시킨 후 하나 씩 꺼내서 letter과 비교해서 일치하지 않으면 추가해준다.
	public String solution2(String my_string, String letter) {
		
		String answer = "";
		StringBuffer buffer = new StringBuffer();
		
		String[] arr = my_string.split("");
		
		for (String str : arr) {
			if(!str.equals(letter)) {
				buffer.append(str);
			}
		}
		answer = buffer.toString();
		
		return answer;
	}
//			buffer.append(answer);
//		answer = buffer.toString();

}
