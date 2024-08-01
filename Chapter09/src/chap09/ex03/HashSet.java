package chap09.ex03;

import java.net.MulticastSocket;
import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {

//		클래스 이름을 잘 지어야 하는 이유
//		내가 객체화 하려는 클래스와 현재 클래스가 이름이 겹친다면 풀 패키지 경로로 객체화가 진행된다.
//		문제가 생기는것은 아니지만 가독성이 좋지 않다.
		Set<String> set = new java.util.HashSet<String>();
		
//		데이터 추가
		set.add("JAVA");
		set.add("JSP");
		set.add("DB");
		set.add("SPRING BOOT");
		set.add("JAVA"); // 중복
		System.out.println(set.size());
		
		Set<Member> member = new java.util.HashSet<Member>();
		member.add(new Member());
		member.add(new Member());// 중복
		System.out.println(member.size()); // 객체는 복사본이기 때문에 일련번호가 달라서 다른 값이다.
		
//		하나씩 꺼내기
//		1. Iterator 로 하나씩 쪼개기 좋게 만든다.
		Iterator<String> iter = set.iterator();
		
//		2. next() 로 하나씩 꺼낸다.
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		
//		데이터 삭제
		set.remove("DB");
		System.out.println();
		
		for (String item : set) {
			System.out.println("향상된 for : " + item);
		}
		
//		clear() / isEmpty()
		if(!set.isEmpty()) {
			set.clear();
		}
		System.out.println(set);
	}

}

class Member{
	
	
	
	
	
	
}
