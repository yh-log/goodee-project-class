package ex02;

public class InOut {

	public static void main(String[] args) {

//		10 개 짜리 배열 생성
		int[] score = new int[10]; // 인덱스 0 ~ 9
		
//		넣기
		score[0] = 10; // 방 번호 지정 후 넣어야 한다.
		score[1] = 50;
		score[2] = 70;
		
//		크기 확인
		int len = score.length;
		System.out.println("배열길이 : " + len);
		
//		0~9번 방에 10~100까지의 값을 넣어보자
		
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		score[5] = 60;
		score[6] = 70;
		score[7] = 80;
		score[8] = 90;
		score[9] = 100;
		
//		0~9까지 증가가 가능한가
//		10~100까지 증가가 가능한가
		
		for (int i = 0; i < score.length; i++) {
			score[i] = (i+1) * 10;
		}
		System.out.println("0번방의 값 : " + score[0]);
		System.out.println("1번방의 값 : " + score[1]);
		System.out.println("2번방의 값 : " + score[2]);
		System.out.println("3번방의 값 : " + score[3]);
		System.out.println("4번방의 값 : " + score[4]);
		System.out.println("5번방의 값 : " + score[5]);
		System.out.println("6번방의 값 : " + score[6]);
		System.out.println("7번방의 값 : " + score[7]);
		System.out.println("8번방의 값 : " + score[8]);
		System.out.println("9번방의 값 : " + score[9]);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + "번방의 값 : " + score[i]);
		}
		
		
		
	}

}
