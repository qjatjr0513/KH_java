package com.kh.chap03_map.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		// 계층구조를 보면 List나 set계열은 Collection을 구현한 클래스다. => 데이터를 추가할때 add메서드 사용.
		// 단. Map은 아니다. => 데이터를 추가할때 put이러는 메소드를 사용(key + value세트로 추가해줘야함)
		
		HashMap<String, Snack> hm = new HashMap<>(); //HashMap<String, Snack> hm = new HashMap<String, Snack>(); 이랑 동일
		
		// 1. put(K key, V value) => map 공간에 key+value 세트로 추가해주는 메소드.
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("새우깡", new Snack("짠맛", 1500));
		hm.put("포테이토칩", new Snack("짠맛", 1500));
		hm.put("칸초", new Snack("단맛", 1600));
		hm.put("칸초", new Snack("단맛", 600));
		
		System.out.println(hm);
		// 저장 순서 유지 x, value가 동일하다고 해도 key값이 중복되지 않기 때문에 잘 저장됨.
		// key값이 동일하다면 나중에 나온 put메서드로 덮어 씌워짐.
		
		// 2. get(Object key) :  V(리턴값 value) => Map에서 해당 키값의 value값을 돌려주는 메서드.
		System.out.println(hm.get("다이제"));
		
		// 3. size() -> map에 담겨있는 개수.
		System.out.println(hm.size());
		
		// 4. replace(K key, V value) => 맵에 해당 key 값을 찾아서 새로 전달된 value로 변경시켜주는 메소드.
		
		hm.replace("포테이토칩", new Snack("단짠단짠", 1000));
		System.out.println(hm.get("포테이토칩"));
		
		// 5. remove(Object key) => 맵에 해당하는 key + value 전체 지워주는 메소드.
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		System.out.println("---------------------------------------------------------");
		
		//ArrayList list = new ArrayList(hm); 사용이 불가능함.
		
//		for(String key : hm) { //사용불가
//			
//		}
		
		//Iterator it = hm.iterator(); //사용불가
		
		// Map을 set으로 바꿔주는 메소드가 있음. (2개)
		// HashMap => set 계열 => Iterator;
		
		// 1. keySet()을 이용한 방법.
		// 1-1) hm에 있는 key들만 뽑아서 set에 담기.
		
		Set<String> keySet= hm.keySet();
		// 1-2) 1번과정에서 작업된 keySet을 Iterator에 담기
		Iterator<String> it = keySet.iterator();
		
		//Iterator<String> it = hm.keySet().iterator(); 이런식으로 메소드체이닝을 이용하기도함.
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		// 1-3) 반복자에 담긴 것들을 순차적으로 뽑기
		while(it.hasNext()) {
			String key = it.next();
			Snack value = hm.get(key);
			System.out.println(key);
			System.out.println(value);
		}
		
		System.out.println("--------------------------------------------------");
		
		// 2. entrySet() 이용하는 방법.
		
		// 1) hm에 있는 모든 key + value를 set에 담는 방법.(집합형태.)
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet에 있는 것들을 Iterator에 담기.
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문을 이용해서 순차적으로 뽑기.
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------------------------------");
		// 이런방법도 있다.
		
		for(Entry<String, Snack> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------------------------------------------------");
		ArrayList<Entry<String, Snack>> list = new ArrayList(entrySet);
		System.out.println(list);
		
		System.out.println("--------------------------------------------------");
		System.out.println(hm.values()); // value들만 모아서 collection으로 만들수도 있음.
	}

}
