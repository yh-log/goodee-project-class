package chap09.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

		List<Integer> score = new ArrayList<Integer>();
		
		score.add(70);	// 0
		score.add(80);	// 1
		score.add(50);	// 2
		score.add(90);	// 3
		score.add(100);	// 4
		score.add(90);	// 5
		
//		데이터 수정 - 특정 인덱스의 값을 덮어쓴다.
		int prev = score.set(3, 95);
		System.out.println("변경전 값: " + prev);
		System.out.println(score);
		
//		특정값 검색(포함여부)
		System.out.println("95 있음? " + score.contains(95));
		
//		특정값 검색(인덱스 반환)
		System.out.println("95의 위치 : "+score.indexOf(95));
		
//		모든 데이터 삭제
		score.clear();
		
//		score를 완전히 비우고 싶다면 차라리 객체를 다시 선언하자
//		score = new ArrayList<Integer>();
		
//		데이터가 있는지 없는지 확인
		System.out.println(score.isEmpty());
	}

}
