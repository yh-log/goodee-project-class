package ex01;

public class One {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		
		x++; // 증가가 나중에 된다.
		System.out.println("x++ : "+x);
		++y; // 증가가 먼저 된다.
		System.out.println("++y : "+y);
		
		x = 1;
		y = 1;
		int result = (++x) + 10;
		int result2 = (y++) + 10;
		System.out.println("result : "+result);		//  x가 먼저 증가해서 2가 되고, 10과 더해져서 12가 된다.
		System.out.println("result2 : "+result2);	//  y가 10과 더해져서 11이 되고, 나중에 y 는 1 증가해서 2가 된다.
		
		// ++ 가 뒤에 붙는 다는 건 어떤 액션 이후에 증가한다는것이다.
		// ++ 가 뒤에 붙는다? -> 카운트 할때 주료 사용
		// ++ 가 앞에 붙는다? -> 증가한 값을 다른곳에 이용 할때
		
		
	}

}
