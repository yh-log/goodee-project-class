package ex03;

//import java.util.Iterator;

public class StmtElseIf {

	public static void main(String[] args) {

		String item = "오렌지주스";
		
//		자판기에 가지고 있는 음료(콜라, 생수, 오렌지주스, 사이다, 에너지음료, 이온음료, 냉커피, 식혜)
//		item에 들어있는 값이 자판기에 있느면 "000" 이 나왔습니다. 라고 출력
//		없으면 해당 음료는 없습니다. 라고 출력
		
//		[if와 else if 사용]
		
		if (item.equals("콜라")) {
			System.out.println("콜라가 나왔습니다.");
		} else if (item.equals("생수")) {
			System.out.println("생수가 나왔습니다.");
		} else if (item.equals("오렌지주스")) {
			System.out.println("오렌지주스가 나왔습니다.");
		} else if (item.equals("사이다")) {
			System.out.println("사이다가 나왔습니다.");
		} else if (item.equals("에너지음료")) {
			System.out.println("에너지음료가 나왔습니다.");
		} else if (item.equals("이온음료")) {
			System.out.println("이온음료가 나왔습니다.");
		} else if (item.equals("냉커피")) {
			System.out.println("냉커피가 나왔습니다.");
		} else if (item.equals("식혜")) {
			System.out.println("식혜가 나왔습니다.");
		} else {
			System.out.println("해당하는 음료는 없습니다.");
		}
		
		
////		for문을 이용해 풀어보기 ★ 개인
////		
//		String[] drink = {"콜라", "생수", "오렌지주스", "사이다", "에너지음료", "이온음료", "냉커피", "식혜"};
//		
//		String item2 = "생수";
//		
////		break를 넣어줘야할 것 같은데.... 
//		
//		for (String str : drink) { 
//			if(str.equals(item2)) {
//				System.out.println(str + "가 나왔습니다.");
//			} else {
//				System.out.println("해당 음료는 없습니다.");
//			}
//		}
		
	}

}
