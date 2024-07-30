package chap06.ex11;

public class Racer {

	
	/*
	public String drive(Benz car) {
		return car.run();
	}
	
	public String drive(Audi car) {
		return car.run();
	}
	
	public String drive(Bmw car) {
		return car.run();
	}
	*/
	
//	Car 를 상속 받았으면 이 메서드를 다 사용할 수 있다. 
//	매개변수 다형성 (부모를 상속받은 자식들은 모두 사용할 수 있다.)
	public String drive(Car car) {
		return car.run();
	}
}
