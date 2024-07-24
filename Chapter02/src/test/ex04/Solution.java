package test.ex04;

//https://school.programmers.co.kr/learn/courses/30/lessons/120807

public class Solution {
	
    public int solution(int num1, int num2) {
    	
//    1. num1 == num2 -> 1
//    2. num1과 num2는 0<= num <= 10000 조건이 필요
    	
//    	★ return은 if문 안에 들어가 있으면 안됨!
//    	★ 그러니까 answer을 정의해주고 if문 밖에 return이 있어야 함
    	
//    if((0 <= num1 && num1 <= 10000) && (0 <= num2 && num2 <= 10000)) 이렇게 쓸 수 있음

    	int answer = 0;
    	
    	if(0 <= num1 && num1 <= 10000) {
    		if(0 <= num2 && num2 <= 10000) {
    			answer =  num1 == num2 ? 1 : -1;
    		} 
    	} return answer; 
    }
    
}
