package chap08.ex02;

import java.util.Iterator;

public class StringArrUtils {

	public static void main(String[] args) {

//		문자열 = 문자 배열임을 착안해 만든 기능
		String string = "abcdefg";
		
		String strResult;
		int intResult;
		boolean boolResult;
		
//		문자 길이 (이력서 쓸 때 문자열 길이를 넘어가는지 아닌지 체크할 때 주로 사용)
		intResult =  string.length();
		System.out.println(string + "의 길이 : " + intResult);
		
		System.out.println(string.length());
		
//		특정 인덱스의 값 가져오기
		char charResult = string.charAt(3);
		System.out.println("3번 인덱스의 값 : " + charResult);
		
//		우리가 만든 문자열을 -> 문자배열로 변환할 수 있다.
//		문자열 -> 배열
		char[] arr =  string.toCharArray();
		System.out.println(arr);
		
//		배열 -> 문자열
		arr = new char[]{'가', '나', '다', '라', '마'};
		string = arr.toString(); 
		string = String.valueOf(arr);
		String str = new String(arr); // 생성자..^^
		System.out.println("문자 배열을 문자열로 : " + string + str);
		
//		검색 : 특정한 문자열이 있는 위치를 알려준다. (처음만)
		string = "abcdabcdabcd";
		intResult = string.indexOf("c"); // 2번 6번 10번 인덱스에 있다. 
		System.out.println("c의 index : " + intResult);
		
		intResult = string.lastIndexOf("c");
		System.out.println("c의 index : " + intResult);
		
		
//		3개의 c를 모두 찾는 방법은?
//		arr = string.toCharArray();
//		System.out.println(arr);

		
		intResult = string.indexOf("g"); // indexOf는 찾는 값이 없으면 -1 반환
		System.out.println(intResult);
		
		intResult = string.indexOf("c");
		
//		indexOf => 더이상 찾을게 없으면 -1을 반환하므로 -1보다 클 경우 반복
		while(intResult > -1) {
			System.out.println("c의 index 값 : " + intResult); // intResult의 값은 2로 시작
			intResult = string.indexOf("c", intResult + 1); // 기존 index 2에서 +1을 해서 intResult에 넣어주기
		}
		
		System.out.println();
		
//		전통적인 방법
		for (int i = 0; i < string.length(); i++) {
//			System.out.println(string.charAt(i));
			if(string.charAt(i) == 'c') {
				System.out.println("c의 index : " + i);
			}
			
		}
		
		System.out.println();
		
//		자바의 메소드를 활용 (코드리뷰)
		intResult = 0;
		while(intResult > -1) {
			intResult = string.indexOf("c", intResult);
			if(intResult > -1) {
				System.out.println("c의 위치 : " + intResult);
				intResult++;
			}
		}
		
	}

}
