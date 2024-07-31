package chap08.ex02;

public class StringUtils {

	public static void main(String[] args) {
		String string = "abcdefg";
		String strResult;
		int intResult;
		boolean boolResult;
		
	//	String 에서 사용 가능한 메소드들...
		
		/*문자열비교*/
		boolResult = string.equals("abc");
		System.out.println("두 문자는 같나요?" + boolResult);
		
		string = "[img]uploadFle.png";
		intResult = string.compareTo("[img]uploadFle.jpg");
		System.out.println("두 문자가 같나요?" + intResult);
//		같으면 0을 반환
//		앞에서 부터 탐색하다가 다른 문자를 발견하면 차이를 계산하고 멈춘다.
//		p(112) - j(106) = 값을 반환한다. (p에서 j를 뺀 값을 반환한다.) 아스키코드 값
		
//		문자열의 포함 여부
//		왼쪽의 문자열 안에 오른쪽 값이 포함되어 있는가?
		boolResult = string.contains("png");
		System.out.println("jpg가 포함 되어 있는가? " + boolResult);
		
		/*문자열 교체*/
//		특정한 문자열을 발견하면 지정한 문자열로 변경하여 새로운 변수로 내보낸다.
		String newStr = string.replace("png", "mp4");
		System.out.println("기존 문자열 : " + string);
		System.out.println("새로운 문자열 : " + newStr);
		
		/*공백 제거*/
//		모든 공백 제거		
		string = "my name is kim y h";
		newStr = string.replace(" ", "");
		System.out.println(string + " => " + newStr);
		
//		앞 뒤 공백제거
		string = "  가나다라마다사  ";
		newStr = string.trim();
		System.out.println("앞뒤" + string + "공백을 제거");
		System.out.println("앞뒤" + newStr + "공백을 제거");
		
		
		/*시작과 끝 체크*/
//		끝 : 확장자 검색 
//		시작 : 규정을 볼 때
		string = "[img]uploadFile.png"; // img로 시작하면 이미지 or png로 끝나면 이미지다는 것을 찾아줌
		
//		특정 문자열로 시작하는가?
		boolResult = string.startsWith("[img]");
		System.out.println("[img] 시작 여부 : " + boolResult);
		
//		특정 문자열로 끝나는가?
		boolResult = string.endsWith(".png");
		System.out.println(".png로 끝나는지 여부 : " + boolResult);
		
		/*반복*/
		newStr =  "*".repeat(4); // 번호를 받아서 뒷 번호를 바꿀 때 사용
		System.out.println("010+1234+"+newStr);
	}

}
