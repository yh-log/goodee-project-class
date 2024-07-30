package chap06.ex09;

public class Fire extends Spell {

	@Override
	public String casting() {
		return "화염" + super.casting(); // 코드의 재사용성이 높다. 
	}

	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return super.speed() + 50;
	}

}
