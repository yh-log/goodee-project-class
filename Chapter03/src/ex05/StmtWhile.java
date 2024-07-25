package ex05;

public class StmtWhile {

	public static void main(String[] args) {

		int cup = 1;
		
		while (true) { // 조건이 참이면 while은 계속 반복한다.
			System.out.println(cup + "잔 떠오기");
			cup++;
			if (cup > 10) {
				break;
			}
		}
		
		
//		unrecheable code : 위의 while 문이 무한으로 반복되기 때문에 아래 코드까지 닿을 수 없다는 뜻
//		해결방법 1 : 아래 코드를 지운다.
//		해결방법 2 : 위 반복문이 끝날수 있는 조건을 정해 준다.
//		cup = 1;
//		System.out.println("다 떠왔습니다.");
		
	}

}
