package chap08.ex03;

public class Main {

	public static void main(String[] args) {

//		사용하기 편리하지만 가비지콜렉터가 3번을 버려야 한다는 문제가 있다.
//		10이상 더하지 않을 경우는 이게 낫다.
		String str = "문자열을";
		str += "추가하면";
		str += "각 객체가 생성된다.";
		System.out.println("String : " + str);
		
		StringBuffer strbf = new StringBuffer("문자열을");
		strbf.append("추가하면");
		strbf.append("한 객체의 크기만 늘어난다");
		System.out.println("StringBuffer : " + strbf.toString());
		
		System.out.println("문자열을 뒤집어주기 : " + strbf.reverse());
	}

}
