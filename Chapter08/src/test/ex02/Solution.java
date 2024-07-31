package test.ex02;

//https://school.programmers.co.kr/learn/courses/30/lessons/120825

public class Solution {
	
//	my_string에 있는 문자를 쪼개서 n번 만큼 반복해줘야 한다. 
//	[방법 고민]
//	* my_string에 있는 문자를 하나씩 쪼개기 -> char 배열로 만들기
//	* 하나씩 쪼갠 문자를 n번 만큼 반복하기 -> for
//	* 문자열을 n번 반복해주는 메소드 -> .repeat(n)
	
//	[설명] 1. my_string에 들어오는 문자열을 하나씩 꺼내 n번 반복해주는 것으로 2중 for문 사용
//		   2. 첫 번째 for문 에서는 my_string에 들어오는 문자열의 길이 만큼 반복
//		   3. 두 번째 for문 에서는 my_string의 1번째 문자열을 n번 반복 (0부터 시작하므로 <=가 아닌 < 사용)
//		   4. answer에 my_string을 .charAt(i)을 사용해서 i번 인덱스에 있는 문자를 꺼내 누적합으로 넣어준다.
//		   5. n번 반복했으면 다시 밖에 있는 for문으로 나가 my_string의 문자열이 끝날때까지 반복한다.
	
    public String solution(String my_string, int n) {
        String answer = "";
        
//      i 한번에 j를 n번 만큼 반복한다.
        for (int i = 0; i < my_string.length(); i++) {
        	for (int j = 0; j < n; j++) {
        		answer += my_string.charAt(i);
        	}
        }

        return answer;
    }
    
//  13.09ms ~ 18.73ms (객체를 많이 만들고 계속 쫒아가서 찾으니까 시간이 오래걸림)
    public String solution4(String my_string, int n) {
    	String answer = "";
    	
    	for(int i = 0; i < my_string.length(); i++) {
    		var c = my_string.charAt(i);
    		for(int j = 0; j < n; j++) {
    			answer  += c;
    		}
    		
    	}
    	
    	return answer;
    
    }
    
//  StringBuffer 사용 (0.08ms ~ 0.12ms) *누적합을 쓰는 것보다 StringBuffer을 사용하는게 더 빠르다.
    public String solution5(String my_string, int n) {
    	String answer = "";
    	
    	StringBuffer buffer = new StringBuffer();
    	
    	for(int i = 0; i < my_string.length(); i++) {
    		var c = my_string.charAt(i);  // var은 지역변수에 사용 가능
    		for(int j = 0; j < n; j++) {
    			buffer.append(c);
    		}
    		
    	}
    	answer = buffer.toString();
    	
    	return answer;
    
    }
    
    
    public String solution6(String my_string, int n) {
    	String answer = "";
    	
    	StringBuffer buffer = new StringBuffer();
    	
    	String[] arr = my_string.split(""); // 특정 구분자를 기준으로 쪼개서 배열로 반환
    	
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < n; j++) {
    			buffer.append(arr[i]);
    		}
    		
    	}
    	answer = buffer.toString();
    	
    	return answer;
    
    }
    
//    
    public String solution2(String my_string, int n) {
    	String answer = "";
    	
    	String[] arr = my_string.split("");
    	
    	for (int i = 0; i < arr.length; i++) {
			answer += arr[i].repeat(n);
			
		}
    	
    	return answer;
    	
    }
    
    
//        int len = my_string.length() * n;
    
//        char[] arr = new char[len]; 
    
//        char[] arr = my_string.toCharArray(); // my_string에 들어오는 문자열을 char[] 로 바꿔 문자열 하나씩 쪼개기
    
    
    
//        for(int i = arr[0]; i >= n; i++) {
////        	arr[i]. = my_string.repeat(n);
//        	
//        	my_string.charAt(i);
//        	arr[i] = (char) (my_string.charAt(i) * n);
//        }
    
//    .repeat() 를 사용하는 방법으로도 풀어보기
    public String solution3(String my_string, int n) {
    	String answer = "";
    	
    	int len = my_string.length() * n; // len은 문자열 * n의 수
    	
    	int count = 0;
    	
    	char[] arr = new char[len]; // 배열의 크기는 len (문자열 * n)
//    	my_string.toCharArray(); // my_string에 들어오는 문자열을 배열로 바꿈
    	
    	for (int i = 0; i >= len; i++) {
   			arr[i] += my_string.charAt(i) * n;
    	
    	}

    	answer = new String(arr);
    	
    	return answer;
    	
    }

}
