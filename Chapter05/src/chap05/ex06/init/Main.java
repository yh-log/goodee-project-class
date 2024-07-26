package chap05.ex06.init;

public class Main {

	public static void main(String[] args) {

		Puppy p = new Puppy("멍멍이", "집 지키기");
		
		System.out.println(p.name + " : " + p.goal);
		
		p = new Puppy("이름");
		System.out.println(p.name);
		
		String str = "문자열";
		String str1 = new String("문자열");
//		String 클래스를 오버로드 해둔 것
//		그렇기 때문에 == 을 했을 때 true가 안나옴!
		
		
		
	
	}

}
