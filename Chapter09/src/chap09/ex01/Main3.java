package chap09.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {

//		List와 Array는 비슷하다.
//		배열을 List로 바꾸는 방법
		
		String[] arr = {"List", "Set", "Map"};
		
//		1. Array → List(Interface) *List는 인터페이스다. 
		List<String> list = Arrays.asList(arr); // 이때 배열의 데이터 타입은 클래스 형태 이어야 한다. (int배열 x, Integer 가능)
		
//		ArrayList<String> list = (ArrayList<String>) Arrays.asList(arr); // 처음부터 이렇게도 가능한가봐!!
		
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.set(2, "HashMap"));
		System.out.println(list);
//		아직 배열의 형태를 벗어난 것은 아니므로 추가는 안된다.
//		list.add("Test"); // 배열이 인터페이스의 껍데기만 가져와서 사용하는 것이기 때문에 배열의 크기를 바꾸는 것은 불가능하다.
		
//		2. 진짜 ArrayList로 변해야 한다. (배열을 for문으로 돌려서 list에 add하는 것도 가능하다)
//		List 값을 한번에 ArrayList에 넣는 방법
//		ArrayList<String> arrList = new ArrayList<String>();
//		arrList.addAll(list);
//		arrList.add("collection");
//		System.out.println(arrList);
//		
		
		
	}

}
