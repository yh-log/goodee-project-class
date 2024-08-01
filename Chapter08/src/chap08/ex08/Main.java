package chap08.ex08;

public class Main {

	public static void main(String[] args) {

//		회원 가입
		JoinMember join = new JoinMember();
		
		String id = "admin";
		String age = "19";
		
//		실행예외 (알아서 하라고 안알려준다.)
		try {
			join.reservedCheck(id);
		} catch (Exception e) { // 다형성
			e.printStackTrace(); // 개발 후 보안상의 문제로 주석처리 해 줘야 한다.
		}
		
//		일반예외 (이클립스가 알려준다.)
		try {
			join.ageCheck(age);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (AdultException e) {
			e.printStackTrace();
		}
		
		
	}

}
