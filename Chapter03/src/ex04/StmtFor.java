package ex04;

import java.util.Iterator;

public class StmtFor {

	public static void main(String[] args) {

//		for (시작값; 조건; 증감)
//		물 10잔 떠오기
		
//		for (int cup = 1; cup <= 10; cup++) {
//			System.out.println("물" + cup + "잔 떠 왔습니다.");
//		}
		
		System.out.println();
		
		for (int cup = 1; cup <= 10; cup++) {
			System.out.println("물" + cup + "잔 떠 왔습니다.");
			for (int mix = 1; mix <= 2; mix++) {
				System.out.println("커피 믹스 " + mix + "개 넣기");
			}
			System.out.println("커피" + cup + "잔 완성!");
		}
		
	}

}
