package chap07.ex03;

public class Mac implements MouseEvent {

	@Override
	public void click(int btn) {
		System.out.println("버튼을 클릭한다.");
	}

	@Override
	public void dblClick(int btn) {
		System.out.println("버튼을 더블 클릭한다.");
	}

	@Override
	public double[] move() {
		// TODO Auto-generated method stub
		return null;
	}

}
