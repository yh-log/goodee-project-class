package chap11.exam04;

public class User2 extends Thread {

	private Computer com;
	
	public User2(Computer com) {
		setName("user2");
		this.com = com;
	}

	@Override
	public void run() {
//		User2 은 받아온 컴퓨터를 가지고 게임해서 100점을 만들어 놓는다.
		com.setScore(100);
	}

}
