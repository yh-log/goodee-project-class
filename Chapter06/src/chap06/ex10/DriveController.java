package chap06.ex10;

public class DriveController {
	
	public static void main(String[] args) {
		
//		1. 레이서 섭외
		Racer racer = new Racer();
		
//		2. 차량 준비
		Audi audi = new Audi();
		System.out.println(racer.drive(audi));  // 3. 레이스 시작
		
		Benz benz = new Benz();
		System.out.println(racer.drive(benz));
		
		Bmw bmw = new Bmw();
		System.out.println(racer.drive(bmw));
		
	}

}
