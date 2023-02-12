package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.kh.chap03_map.model.vo.Snack;
import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();
	
	public boolean joinMembership(String id, Member m) {
		// 전달 받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환
		boolean result = false; 
		if(map.get(id) == null) {
			map.put(id, m);
			result = true;
		}
		
		return result;
	}
	
	public String logIn(String id, String password) {
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		String name =null;
		if(map.get(id) != null && map.get(id).getPassword().equals(password)) {
			name =  map.get(id).getName();				
		}
		return name;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		boolean result = false;
		if(map.get(id)!= null && map.get(id).getPassword().equals(oldPw)) {
			map.put(id, new Member(newPw, map.get(id).getName()));
			result = true;
		}
		return result;
	}
	
	public void changeName(String id, String newName) {
		//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		Member m =  new Member(map.get(id).getPassword(), newName);
		map.put(id, m);
	}
	
	public TreeMap sameName(String name) {
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것

		TreeMap<String, Member> tm = new TreeMap<String, Member>();
		Set<String> keySet= map.keySet();
		//해설
//		for(String id: keySet) {
//			if(map.get(id).getName().equals(name)){
//				tm.put(id, map.get(id));
//			}
//		}
//		return tm;
		//내가 한 방법
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Member value = map.get(key);
			if(value.getName().equals(name)) {
				tm.put(key, value);				
			}
		}
		return tm;
	}
}
