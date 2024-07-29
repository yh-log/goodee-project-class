package chap05.ex12.prv;

public class Computer {
	
	private boolean power = false;
	private int panSpeed;
	private int temp;

//	getter, setter 메소드를 통해 원하는 부분만 열어주는 기능을 한다.
	
	
//	boolean은 상태(t/f)만 있기 때문에 참인 값, 거짓인 값이 아닌 참과 거짓인 상태로 들어가기 때문에 is가 들어간다.
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
		if(this.power == true) {
			this.panSpeed = 50;
			this.temp = 60;
		}
	}

//	public int getPanSpeed() {
//		return panSpeed;
//	}

	public void setPanSpeed(int panSpeed) {
		this.panSpeed = panSpeed;
//		110 - 팬속도 = 현재온도 (로 설정하기)
		this.temp = 110 - this.panSpeed;
	
	}

	public int getTemp() {
		return temp;
	}

//	public void setTemp(int temp) {
//		this.temp = temp;
//	}
	
	
	
}
