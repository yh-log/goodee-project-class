package chap06.ex04;

public class MyCar extends ParentCar {


	public boolean turbo = false;
	
//	일부만 수정 (경우에 따라 부모 메소드를 그대로 사용)
//	껍데기는 부모 원형을 그대로 써야 한다
//	public int run(boolean turbo){ → 이런거 안됨
	@Override
	public int run() {
		
		if(turbo == true) {
			return 200;
		} else {
			return super.run();
		}
	}

//	부모의 run 메소드를 껍데기만 놔두고 완전히 바꿔서 사용
//	@Override
//	public int run() {
//		return 200;
//	}
	

	
	

}
