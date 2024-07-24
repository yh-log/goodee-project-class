package ex03;

public class Japangi {

	public static void main(String[] args) {

		String item = "커피";
		
//		자판기에 가지고 있는 음료(콜라, 생수, 오렌지주스, 사이다, 에너지음료, 이온음료, 냉커피, 식혜)
//		item에 들어있는 값이 자판기에 있느면 "000" 이 나왔습니다. 라고 출력
//		없으면 해당 음료는 없습니다. 라고 출력
		
		switch (item) { // jdk 1.6 이하는 switch 문에 문자열을 쓸 수 없다. * item이 String이면 에러가 난다. (char, int 등은 상관 없음)
		
			case "콜라" : 	// 해당 케이스면 아래를 실행시켜라
				System.out.println("콜라가 나왔습니다.");
				break; 		// 빠져 나가라 (프로그램은 코드블록에서 시작하면 끝까지 달리기 때문에 중간에 빠져나오려면 break를 사용해야 한다.)
				
			case "생수" : 
				System.out.println("생수가 나왔습니다.");
				break;
				
			case "오렌지주스" :
				System.out.println("오렌지주스가 나왔습니다.");
				break;
				
			case "사이다" : 
				System.out.println("사이다가 나왔습니다.");
				break;
				
			case "에너지음료" : 
				System.out.println("에너지음료가 나왔습니다.");
				break;
				
			case "이온음료" : 
				System.out.println("이온음료가 나왔습니다.");
				break;
				
			case "냉커피" : 
				System.out.println("냉커피가 나왔습니다.");
				break;
				
			case "식혜" : 
				System.out.println("식혜가 나왔습니다.");
				break;
				
			default: 		// 어떠한 케이스에도 해당되지 않으면 아래를 실행시켜라
				System.out.println("해당음료는 없습니다.");
				break;
		}
		
	}

}
