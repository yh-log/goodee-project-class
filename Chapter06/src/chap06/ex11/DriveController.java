package chap06.ex11;

public class DriveController {
	
	public static void main(String[] args) {
		
//		1. 레이서 섭외
		Racer racer = new Racer();
		
		Car car = null;
		
//		2. 차량 준비
		car = new Audi();
		System.out.println(racer.drive(car));  // 3. 레이스 시작
		
		car = new Benz();
		System.out.println(racer.drive(car));
		
		car = new Bmw();
		System.out.println(racer.drive(car));
		
	}

}
