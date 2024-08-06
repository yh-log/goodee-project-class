package chap11.exam04;

public class User1 extends Thread {

	private Computer com;
	
	public User1(Computer com) {
		setName("user1");
		this.com = com;
	}

	@Override
	public void run() {
//		User1 은 받아온 컴퓨터를 가지고 게임해서 500점을 만들어 놓는다.
		com.setScore(500);
	}

}
