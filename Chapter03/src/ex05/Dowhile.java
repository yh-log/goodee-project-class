package ex05;

public class Dowhile {

	public static void main(String[] args) {

		int cnt = 11;
		
//		while : 조건 체크 -> 반복 실행
		while (cnt < 10) { 	// cnt가 10보다 작은지 확인
			cnt++;			// 10보다 작으면 증가
		}
		System.out.println("while cnt : " + cnt);
		
//		do while : 일단 실행 -> 조건 체크
		cnt = 11;
		
		do {
			cnt++;
		} while (cnt < 10);
		System.out.println("do while cnt : " + cnt);
		
//		while 과 do while은 조건이 부합할 때 같은 결과를 낸다.
//		하지만 조건에 맞지 않는 경우 다른 결과를 낸다.
//		예 : 선불제 버스와 후불제 버스의 차이
		
		
	}

}
