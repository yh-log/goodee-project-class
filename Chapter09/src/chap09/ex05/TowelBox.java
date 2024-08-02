package chap09.ex05;

import java.util.Stack;

public class TowelBox {
	
	public static void main(String[] args) {

		Stack<Towel> box = new Stack<Towel>();
		
//		수건 넣기
//		stack에 값을 넣을때는 push()를 사용한다.
		box.push(new Towel("red"));
		box.push(new Towel("orange"));
		box.push(new Towel("yellow"));
		box.push(new Towel("green"));
		box.push(new Towel("blue"));
		box.push(new Towel("navy"));
		box.push(new Towel("purple"));
		
//		수건을 한장씩 빼보기
		Towel t = box.pop();
		System.out.println(t.getColor() + " 수건 꺼냄 " + box.size() + " 장 남음");
		
//		메서드 체이닝 (이전에 가져온 객체에 추가적으로 무언가를 할 수 있는 것)
		System.out.println(box.pop().getColor() + " 수건 꺼냄 " + box.size() + " 장 남음");
	
//		peek 은 쓰고 버리는 것이 아니라 다시 집어 넣는다.
		System.out.println(box.peek().getColor() + " 수건 꺼냄 " + box.size() + " 장 남음");
	
		
//		나머지 5장을 모두 꺼내보자.
//		향상된 for문은 pop()을 사용하지 않기 때문에 순차적으로 빠지게 된다.
//		for (int i = 0; i < box.size(); i++) {
//			System.out.println(box.pop().getColor() + " 수건 꺼냄 " + box.size() + " 장 남음");
//		}
		
		while(box.size() > 0) {
			System.out.println(box.pop().getColor() + " 수건 꺼냄 " + box.size() + " 장 남음");
		}
		
		while(!box.isEmpty()) {
			System.out.println(box.pop().getColor() + " 수건 꺼냄 " + box.size() + " 장 남음");
		}
		
		
	}
	

}
