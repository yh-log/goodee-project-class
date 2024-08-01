package chap09.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

//		1. 선수 등장
		ArrayList<String> arr = new ArrayList<String>();
		LinkedList<String> lnk = new LinkedList<String>();
		
//		2. 장소(조건) 준비
		for (int i = 0; i <= 100; i++) {
			arr.add("data");
			lnk.add("data");
		}
		
		long startTime = 0; // 출발시간을 넣기 위한 변수 선언
		long endTime = 0;	// 도착시간을 넣기 위한 변수 선언
		
//		3. A 출발 (시작시간 체크)
		startTime = System.currentTimeMillis();
		
//		4. A 달린다.
		for (int i = 1; i <= 100000; i++) {
			arr.add(55, "add data");
		}
		
//		5. A 도착 (도착시간 체크)
		endTime = System.currentTimeMillis();
		
//		6. 결과 (도착시간 - 시작시간)
		System.out.println("ArrayList 결과: " + (endTime - startTime) + "ms");
		
//		3. B 출발 (시작시간 체크)
		startTime = System.currentTimeMillis();
		
//		4. B 달린다.
		for (int i = 1; i <= 100000; i++) {
			lnk.add(55, "add data");
		}
		
//		5. B 도착 (도착시간 체크)
		endTime = System.currentTimeMillis();
		
//		6. 결과 (도착시간 - 시작시간)
		System.out.println("LinkdeList 결과: " + (endTime - startTime) + "ms");
		
	}

}
