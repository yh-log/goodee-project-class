package chap09.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		Array List 선언
//		<> 제너릭 : 데이터 타입을 선언 (class는 많은 데이터 타입이 들어갈 수 있듯이 제너릭도 그렇다.)
//		단! 클래스 형태로만 들어가야 한다. int를 쓰고 싶으면 Integer을 써야한다.

//		ArrayList<String> list = new ArrayList<String>(3); // 초기 크기를 지정할 수 있으나 넘어가도 상관없다. (보통 안한다.)		
		
		List<String> list = new ArrayList<String>(3); // 다형성
		
//		데이터 추가
		list.add("collection"); // 0번 인덱스에 들어간다.
		list.add("thread"); // 1번 인덱스에 들어간다.
		list.add("java IO"); // 2번 인덱스에 들어간다.
		list.add("network"); // 3번 인덱스에 들어간다. <- 배열이었으면 바로 예외 발생
		list.add(3, "lambda"); // 특정 인덱스를 지정해서 넣을 수 있다. (해당 자리의 값은 인덱스가 한칸 뒤로 밀린다.)
		
		System.out.println(list); // syso 로도 볼 수 있다. 
		
//		list.size()로 크기를 알 수 있다.
		System.out.println(list.size());
		
//		list.get(index) 로 특정 인덱스의 값을 꺼내올 수 있다. 
//		for문을 이용해 list의 모든 값을 하나씩 출력해보자
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		
		
//		데이터 삭제
		String val =  list.remove(0);
		System.out.println("내가 지운 값 : " + val);
		
//		System.out.println(list.remove(0));
		
//		같은 값이 들어가 있어도 최초 발견된 값만 지워준다. 
		System.out.println(list.remove("network"));
		
		for (String str : list) {
			System.out.println(str);
		}
		
		
	}

}
