package chap06.ex09;

public class Ice extends Spell {

	@Override
	public String casting() {
		return "얼음" + super.casting();
	}

}
