package chap09.ex05;

public class Towel {
	
	private String color; // 외부에서 못건들게 private로 접근제한자 설정

	public Towel(String color) {
		this.color = color; // this 쓰기 싫으면 매개변수의 이름을 다르게 해주면 된다.
	}
	
	
//	색상을 직접 건들지는 못하고 확인만 하도록 set은 하지 않고 get만 넣어줌
//	그렇다면 값을 어떻게 넣는가? -> setter가 없어도 생성자를 통해서도 넣을 수 있다.
	public String getColor() {
		return color;
	}
	
	

}
