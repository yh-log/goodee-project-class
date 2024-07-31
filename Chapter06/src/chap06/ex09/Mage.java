package chap06.ex09;

public class Mage {

	public static void main(String[] args) {

//		다형성을 활용하여 하나의 변수로 여러 마법을 대응할 수 있다. (= 번수 하나에 여러가지 객체가 들어간다.)
//		마법 추가시에도 상대적으로 적은 코드를 사용 했다. 
		Spell spell = null;
		spell = new Fire();
		System.out.println(spell.casting());
		
		spell = new Fire();
		System.out.println(spell.casting());
		
		spell = new Light();
		System.out.println(spell.casting());
		
		
	}

}