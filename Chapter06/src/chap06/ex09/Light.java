package chap06.ex09;

public class Light extends Spell {

	@Override
	public String casting() {
		return "번개" + super.casting();
	}

	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return super.speed() + 150;
	}

}
