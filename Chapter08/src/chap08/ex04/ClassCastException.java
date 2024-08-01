package chap08.ex04;

public class ClassCastException {

	public static void main(String[] args) {

//		부모형태에서 자식 형태로 돌아갈 때 잘못 돌아가는 경우 
		
		// 다형성 (Object 최상위 부모 -> 모든걸 다 담을 수 있다 => 공간을 낭비할 수 있다. = 나에게 다시 돌아갈 때 잘못돌아갈 위험이 있다. = 나의 고유 특성을 잃는다.
// 		Object 는 java의 최상위 객체로써 안담기는게 없는 컵이다.
		Object value = 1234; 
		
//		명시적 형변환을 통해 자식 형태로 다시 되돌아 간다. 
		String str = (String) value; // 원래 숫자형태가 문자로 집을 잘못 찾아 들어가는 경우
		
		
	}

}
