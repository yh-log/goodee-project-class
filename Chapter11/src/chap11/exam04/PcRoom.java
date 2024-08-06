package chap11.exam04;

public class PcRoom {

	public static void main(String[] args) {

//		컴퓨터 1대 준비
		Computer com = new Computer();
		
//		User1 과 User2를 불러 컴퓨터를 사용하라고 한다.
		User1 user1 = new User1(com);
		user1.start(); // 500점
		
		User2 user2 = new User2(com);
		user2.start(); // 100점
	}

}
