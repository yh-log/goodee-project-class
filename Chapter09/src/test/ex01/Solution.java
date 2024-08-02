package test.ex01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
//	for문을 돌리면 계속 쭉 돌려야 하니까 속도가 너무 느려짐
	
//	공백으로 끊어내면 모스부호의 개수를 알 수 있음
//	앞뒤 공백이 없으니까 trim을 안해줘도 된다.
	
//	1. 각 부호는 공백으로 구분된다. -> 공백으로 끊어내야 한다. spill("")
//  2. 모스부호가 저장된 형태를 잘 살펴보자 -> 어떤식으로 저장해야 할지... (key : value) 구조를 가지고 있다.
	
	/*{ 
		    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
		    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
		    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
		    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
		    '-.--':'y','--..':'z'
		}

	*/
//	0.13ms ~ 0.21ms
    public String solution(String letter) {
        String answer = "";
        
        String[] arr = letter.split(" ");
        
        Map<String, String> morse = new HashMap<String, String>();
        morse.put(".-","a");
        morse.put("-...","b");
        morse.put("-.-.","c");
        morse.put("-..","d");
        morse.put(".","e");
        morse.put("..-.","f");
        morse.put("--.","g");
        morse.put("....","h");
        morse.put("..","i");
        morse.put(".---","j");
        morse.put("-.-","k");
        morse.put(".-..","l");
        morse.put("--","m");
        morse.put("-.","n");
        morse.put("---","o");
        morse.put(".--.","p");
        morse.put("--.-","q");
        morse.put(".-.","r");
        morse.put("...","s");
        morse.put("-","t");
        morse.put("..-","u");
        morse.put("...-","v");
        morse.put(".--","w");
        morse.put("-..-","x");
        morse.put("-.--","y");
        morse.put("--..","z");
        
        StringBuffer sb = new StringBuffer();
        
        for (String str : arr) {
        	sb.append(morse.get(str));
        }
        
        answer = sb.toString();
        
//        for (String str : arr) {
//			answer += morse.get(str);
//		}
        
//        Set<String> key = mos.keySet();
//        
//        for(String keySet : key) {
//        	if(mos.get(keySet).equals(arr)) {
//        		
//        		System.out.println(mos.values());
//        	}
//        	
//        }

//        Set<String> key = mos.keySet();
//        Iterator<String> iter = key.iterator();
        
//        
//        for(String str : arr) {
//        	if()
//        }

//        String[] arr = letter.split(" ");
//        
//        for(int i = 0; i < arr.length; i++) {
//        	if(mos.containsKey(arr[i])) {
//        		answer += mos.get(mos.get(arr[i]));
//        	}
//        }
//        
        
//        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
//        
//        String[] let = letter.split(" ");
//        
//        for(int i = 0; i < let.length; i++) {
//        	for (int j = 0; j < let[]; j++) {
//				
//			}
//        }
        
        
        return answer;
    }
	

}
