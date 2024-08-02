package chap09.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {

		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김철호", 99);
		map.put("박동빈", 80);
		map.put("박은비", 75);
		map.put("신솔비", 43);
		map.put("한은정", 52);
		map.put("김민지", 100);
		map.put("김윤경", 80);
		map.put("정철수", 99);
		map.put("안은호", 87);
		map.put("최영일", 75);
		
//		해당하는 키가 있는지? map.containsKey("키이름")
//		박은비 라는 키가 존재하는지 확인
		System.out.println(map.containsKey("박은비"));
		
		if(map.containsKey("박은비")) {
			System.out.println("박은비라는 key가 있습니다.");
		} else {
			System.out.println("박은비는 없습니다.");
		}
		
//		해당하는 값이 있는지? map.containsValue("값")
//		99라는 값이 있는지 확인
		System.out.println(map.containsValue(99));
		
		if(map.containsValue(99)) {
			System.out.println("99라는 value가 있습니다.");
		}else {
			System.out.println("99는 없습니다.");
		}
		
//		해당 점수의 학생을 찾는 방법
//		99점을 맞은 학생의 이름을 구하시오. (김철호, 정철수)
		
		
//		(방법 1) ★ 찾으면 더 이상 불필요한 동작을 하지 않도록 break로 반복문을 끝내줘야 함
		Set<String> keySet = map.keySet();
		
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			int val = map.get(key);
//			System.out.println(key + val);
			if(val == 99) {
				System.out.println(key + " " + val);
			}
		}
		
//		(방법 1 - 강사님)
		
//		Set<String> keySet = map.keySet();
		
		for(String key : keySet) {
			if(map.get(key) == 99) {
				System.out.println(key + "가 99점을 맞은 학생입니다.");
				break;
			}
		}
		
		
//		(방법 2)
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iter2 = entrySet.iterator();
		
		while(iter2.hasNext()) {
			Entry<String, Integer> en = iter2.next();
			String key = en.getKey();
			int val = en.getValue();
			if(val == 99) {
				System.out.println(key + " " + val);
			}
		}
		
//		(방법 2 - 강사님)
		Set<Entry<String, Integer>> entrySet1 = map.entrySet();
		for(Entry<String, Integer> entry : entrySet1) {
			if(entry.getValue() == 99) {
				String key = entry.getKey();
				System.out.println(key + "가 99점을 맞은 학생입니다.");
				break;
			}
		}
		
//		(방법 3)
//		for(String str : map.keySet()) {
//			if(map.)
//		}

//		Set<Entry<String, Integer>> entry = map.entrySet();
//		
//		Iterator<Entry<String, Integer>> itr = entry.iterator();
//
//		Entry<String, Integer> en = itr.next();
//		String key = en.getKey();
		
//		if(map.containsValue(99)) {
//			while(itr.hasNext()) {
//				System.out.println(key);
//				break;
//			}
//		}
//		
////		while(itr.hasNext()) {
////			if(map.containsValue(99)) {
////				Entry<String, Integer> en = itr.next();
////				String key = en.getKey();
////				System.out.println(key);
////			}
////		}
//		
//		while(itr.hasNext()) {
//			if(map.containsValue(99)) {
//				System.out.println(en.getKey());
//				break;
//			}
//		
//		}
//		
//		if(map.containsValue(99)) {
//			System.out.println(en.getKey());
//		}
		
		
//		for (String str : map.keySet()) {
//			if(map.containsValue(99)) {
//				System.out.println(map.get(str));
//		}
//		
//		}
		
	}
	

}
