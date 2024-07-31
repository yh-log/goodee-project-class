package chap08.ex02;

public class StringArrUtilsCodeReview {
	
//	[개요]
//	이 프로그램은 선택한 문자의 모든 인덱스 위치를 찾아내는 프로그램입니다. 
	
//	[설명]
//	1. 문자열이 담긴 String 타입의 변수를 선언한다. 
//	2. 문자열의 인덱스 위치를 담기 위해 int 타입의 변수를 선언한다.
//	3. 문자열에 포함된 특정 문자열을 모두 찾기 위해 반복문을 사	용한다. *이때 정해진 반복 횟수가 없으므로 for가 아닌 while를 사용한다.
//	4. while이 반복하는 조건은 intResult 가 -1보다 클 경우이며, 이는 더이상 찾을 문자열이 없을 경우 -1을 반환하기 때문이다.
//	5. 반복문이 시작하면 먼저 .indexOf() 메서드를 활용해 c의 위치를 찾아준다.
//	   이때 위치는 intResult의 위치인 0부터 시작한다.
//	6. 이후 무한반복을 막기 위해 if문을 사용해 intResult가 -1보다 클 경우 intResult를 출력해주고, 
//	7. 현재 찾은 인덱스 위치의 다음부터 찾기 위해 intResult를 1 증가시킨다.
//	8. 이후 조건이 만족될 때까지 이를 반복한다. 
	
	public static void main(String[] args) {

		String string = "abcdabcdabcd"; // String 변수인 string 에 "abcdefg"가 문자열로 들어가 있다. 

//		자바의 메소드를 활용 (코드리뷰)
		int intResult = 0; // 문자열 속 배열의 인덱스 값을 구하기 위해 int 타입의 변수 선언 후 0으로 초기화 (인덱스는 0으로 시작)
		
		while (intResult > -1) { // intResult가 -1보다 크면 계속해서 반복 (더이상 찾을 문자열이 없을 경우 -1을 반환하므로)
			intResult = string.indexOf("c", intResult); // intResult의 위치(0)에서 시작해서 문자열 c를 찾아주고 그 값을 intResult에 넣는다.
			if (intResult > -1) { // intResult가 -1보다 클 경우 (if를 사용하는 이유 : 무한반복) -> 무한반복의 이유는? 
				System.out.println("c의 위치 : " + intResult); // "c"의 위치를 출력해주고
				intResult++; // 현재 위치 다음부터 "c"를 찾기 위해 intResult 값을 1 증가 -> 그리고 찾은 c의 위치에서부터 다시 c를 찾는 것을 반복
			}
		}

	}
	
//	indexOf는 찾는 값이 없을 경우 -1을 반환하는데, 우리는 문자열을 1개만 찾는게 아닌 여러 문자열을 찾아야 하니까
//	if로 -1이 아니면 intResult를 1 증가시켜줘서 다음으로 넘어갈 수 있도록 해준다.
//	만약 모두 찾았을 경우 -1이 되면서 if문에도 while문에도 들어가지 않게 된다.
//	===============================================================================
//	if가 없고 ++만 있다면 계속 -1보다 값이 커지므로, 무한반복되고
//	++만 있고 if가  없다면 첫번째 인덱스만 찾는 것을 반복한다.
	
	

}
