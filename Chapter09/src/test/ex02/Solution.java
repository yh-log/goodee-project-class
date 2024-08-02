package test.ex02;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894
	
import java.util.HashMap;

public class Solution {
	
//	Tip. 숫자는 0~9만 존재한다. 
//		 각각의 case로 만들 수 있다. 
//	     천억까지 나올 수 있기 때문에 int로 할 수 없다. (long)
//	     숫자가 아닌 문자로 받고 그 문자를 숫자로 바꿔야 한다. (숫자끼리 더하면 1+0이 1이 되어버림)
//	     파스인트, 파스롱
	
//	0~9 까지 10개 밖에 안되므로 각각 케이스를 만들 수 있다. 
//	숫자는 일단 문자열 형태로 붙이고, 나중에 Long형태로 변환 해야 한다.
	
	
//	0.09ms ~ 0.15ms
//	[방법 1] replace로 다  (replace 는 원본은 건드리지 않는다.)
    public long solution(String numbers) {
        long answer = 0;

        numbers = numbers.replace("zero", "0");
        numbers = numbers.replace("one", "1");
        numbers = numbers.replace("two", "2");
        numbers = numbers.replace("three", "3");
        numbers = numbers.replace("four", "4");
        numbers = numbers.replace("five", "5");
        numbers = numbers.replace("six", "6");
        numbers = numbers.replace("seven", "7");
        numbers = numbers.replace("eight", "8");
        numbers = numbers.replace("nine", "9");
        
        answer = Long.parseLong(numbers);
        
        return answer;
    }
    
//    0.10ms ~ 0.16ms ▶ 찾아야하는 값이 앞쪽에 몰려있다면 array가 더 빠르지만
//    					무언가를 많이 찾아야 하는 등은 Map이 더 유리하다.
//    [방법 2] 배열과 for문 이용하기
//    toString() 는 클래스에 사용하는 것이므로 String.valueOf()를 사용
    public long solution2(String numbers) {
    	
    	long answer = 0;
    	
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < number.length; i++) {
        	numbers = numbers.replaceAll(number[i], String.valueOf(i));
        }
        
        answer = Long.parseLong(numbers);
        
        return answer;
    	
    }
    

//  0.11ms ~ 0.18ms
//  [방법 3] 맵을 이용해서 해결하는 방법
    
//  향상된 for문으로 numberMap의 key를 String key에 넣어준다.
//  numbers에 들어오는 문자열을 replace 해준다.
//    → String key에 (numberMap의 key가 들어가 있다.)
//    → numberMap.get(key)를 해주면 numberMap에 key에 해당하는 value 값을 반환한다.
    
    public long solution4(String numbers) {
    	long answer = 0;
    	
    	HashMap<String, String> numberMap = getMap();
    	
    	for (String key : numberMap.keySet()) {
			System.out.println(key);
			numbers = numbers.replace(key, numberMap.get(key));
			System.out.println(numbers);
		}
    	
    	answer = Long.parseLong(numbers);
    	
    	return answer;
    }
    
    private HashMap<String, String> getMap(){
    	HashMap<String, String> map = new HashMap<String, String>();
    	
    	map.put("zero", "0");
    	map.put("one", "1");
    	map.put("two", "2");
    	map.put("three", "3");
    	map.put("four", "4");
    	map.put("five", "5");
    	map.put("six", "6");
    	map.put("seven", "7");
    	map.put("eight", "8");
    	map.put("nine", "9");
    	
    	return map;
    	
    }

}
