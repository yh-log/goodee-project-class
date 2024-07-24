package test.ex03;

//https://school.programmers.co.kr/learn/courses/30/lessons/12937

public class Solution {

	public String solution(int num) {
		String answer = num % 2 == 0 ? "Even" : "Odd";
//		1. num을 받아서 홀/짝 판별
//		2. num % 2 결과가 0이 나오면 Even
		
		return answer;
		
	}
	
	public String solutino2(int num) {
		if(num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
	
	public String solution3(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
		
	}
	
}
