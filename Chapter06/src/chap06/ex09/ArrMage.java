package chap06.ex09;

public class ArrMage {

	public static void main(String[] args) {
		
//		클래스를 변수로 넣어서 for문으로 casting를 출력해보기.
//		공통점이 있으면 for문과 배열로 만들 수 있다.
//		배열의 타입이 Fire, Ice, Light로 다 다르지만 부모인 Spell 타입으로 선언이 가능함
		
		
//		다형성을 이용하면 아래와 같이 배열등을 활용할 때 유용하다.
//		일반적인 변수(필드)에 활용하므로 필드 다형성이라고 한다.
		Spell[] spell = new Spell[3];
		
		spell[0] = new Fire();
		spell[1] = new Ice();
		spell[2] = new Light();

		for (int i = 0; i < spell.length; i++) {
			System.out.println(spell[i].casting());
			
		}

//		for(Spell arr : spell) {
//			System.out.println(arr.casting() + " " + arr.speed());
//		}
		
		
		
	}

}
