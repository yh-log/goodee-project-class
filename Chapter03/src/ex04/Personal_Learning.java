package ex04;

// 중첩 for문 연습 (구구단)

public class Personal_Learning {

	public static void main(String[] args) {

//		int num = 1; // 해당 구조에서는 num을 정의해 줄 필요가 없었음
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			System.out.println("-----------");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + " = " + (i *j));
				
			}
			
		}
		
	}

}
