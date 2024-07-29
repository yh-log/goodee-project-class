package chap06.ex07;

public class Cast {

	public static void main(String[] args) {

		Mammal mal = null;
		
//		부모 형태로 묵시적 형변환(다형성) 하면
		mal = new Dog();
		mal.birth(); // 부모로 부터 받아 재정의(override)
		mal.eat(); // 무모의 특성
//		mal.bark(); // 개의 고유 특성(자기 메서드)는 사용 할 수 없다.
		
//		나의 고유 특성을 살리고 싶다면
//		나의 특성(집) 으로 되돌아 가야 한다.
//		부모 개념에서 -> 자식 개념으로 형변환
	
		Dog dog = (Dog)mal;
		dog.bark();
		
		/* 캐스팅 시 본인의 원형이 아닌 다른 형태로 돌아가려고 하면 
		 * ClassCastException 을 만나게 된다. 
		Cat cat = (Cat) mal;
		cat.mew();
		*/
		
//		상속받은 자식 객체가 캐스팅 시 헷갈리는 경우가 많다. 
//		이럴 경우 아래와 같이 확인 가능 하다.
		if (mal instanceof Cat) { // 원형을 확인하는 키워드
			Cat cat = (Cat) mal;
		} else {
			System.out.println("집 잘못 찾아 오셨어요");
		}
	}

}
