package chap05.ex07.membercall;

public class Car {
	
	int gear = 0;
	boolean on = false;

	public Car() {
//		혹시 모르니 초기화
		this.gear = 0;
		this.on = false;
		
	}
	
	void start() {
		if (on == false) {
			on = true;
			System.out.println("시동이 걸렸습니다.");
		} else {
			System.out.println("이미 시동이 걸려 있습니다.");
		}
		
	}
	
	void change(int gear) {
		this.gear = gear;
		System.out.println(this.gear + " 단으로 변경 되었습니다.");
	}

}
