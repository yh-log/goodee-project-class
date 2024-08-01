package chap09.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		Map는 add() 가 아닌 put() 을 사용
		map.put("kim", 23);	// 이름, 나이
		map.put("lee", 26);
		map.put("park", 26);// value 중복
		map.put("kim", 30); // key 중복
		
		System.out.println(map.size()); // 3출력
		
		System.out.println(map);
		
//		단일값 가져오기
		System.out.println(map.get("kim"));
		
//		삭제하기
		System.out.println(map.remove("park"));
		
//		map의 모든값 하나씩 뽑아오기
//		1. key만 Set 형태로 뽑아오기
		Set<String> keySet = map.keySet();
		
//		2. Set을 하나씩 가져올 수 있도록 쪼개기 (iterator)
		Iterator<String> iter = keySet.iterator();
		
//		3. key를 하나씩 가져와서 해당되는 value 가져오기
		while(iter.hasNext()) {
			String key = iter.next();
			int val = map.get(key);
			System.out.println(key + " : " + val);
		}
		
		System.out.println();
		
//		Entry(키:값) 을 Set 형태로 뽑아오기
//		1. Entry 를 Set 형태로 가져온다.
		Set<java.util.Map.Entry<String, Integer>> entrySet = map.entrySet();
		
//		2. 하나씩 쪼갠다. (iterator)
		Iterator<java.util.Map.Entry<String, Integer>> entry = entrySet.iterator();
	
//		3. 하나씩 Entry(key:value) 를 가져와 키와 값을 각각 추출한다.
		while (entry.hasNext()) {
			java.util.Map.Entry<String, Integer> en = entry.next();
			String key = en.getKey();
			int age = en.getValue();
			System.out.println(key + " : " + age);
		}
		
		System.out.println();
		
//		keySet과 향상된 for문을 이용한 방법
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
		
		
		
		
		
	}

}
