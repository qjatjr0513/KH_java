package com.kh.chap02_set.part01_hashset.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashset.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<String>();

		// 1. 값 추가 : add(추가할 값)
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		//hs1.add(50); // <Object(기본)> -> <String> 변경되어서 String 타입만 저장 가능
		
		System.out.println(hs1); // 저장 순서유지 x, 중복 저장 x
		
		// 2. 크기 구하기 : size()
		
		System.out.println(hs1.size());
		// 3. 값 삭제 : remove(삭제할 값)
		
		hs1.remove("여러분");
		System.out.println(hs1);
		
		//4. 모든 값을 삭제 : clear();
		hs1.clear();
		System.out.println(hs1);
		
		System.out.println("----------------------------------------");
		
		HashSet<Student> hs2 = new HashSet<Student>();
		hs2.add(new Student("홍길동", 25, 80));
		hs2.add(new Student("손흥민", 26, 98));
		hs2.add(new Student("박지성", 28, 100));
		hs2.add(new Student("홍길동", 25, 80));
		
		Student std = new Student("홍길동", 25, 80);
		Student std2 = new Student("홍길동", 25, 80);
		
		System.out.println(hs2);
		System.out.println("std와 std2는 같은가?"+std.equals(std2));
		
		System.out.println("std의 해쉬코드"+std.hashCode());
		System.out.println("std2의 해쉬코드"+std2.hashCode());
		
		//저장순서 유지 x, 중복저장 x -> 근데 중복저장이 됨.
		// 값이 추가될때, equals(), hashcode()로 비교한 후, true면 동일한 객체로 판단함.
	
		// HashSet에 객체를 담을때 내부적으로 equals()로 비교 + hashCode()값이 일치하는지도 비교.
		// equals()한 결과가 true이고 hashcode()값이 일치한다면 동일 객체로 판단(중복저장 불가)
		
		// Object 클래스에 있는 equals() : 두 객체의 주소값을 가지고 비교해서 일치하면 true / 일치하지 않으면 false
		// Object 클래스에 있는 hashCode() : 두 객체의 주소값을 기반으로 해서 해시코드 값 만들어서 변환하여 비교.
		
		// 객체의 각 필드값이 일치하면 동일한 객체로 판단이 되서 중복저장이 안되게끔 하고싶으면 오버라이딩을 해줘야함.
		
		// Student 클래스에 equals()오버라이딩 : 세 필드 값이 일치하면 true / 하나라도 일치하지 않으면 false 반환
		// Student 클래스에 hashCode()오버라이딩 : 세 필드 값 기반으로 해서 해시코드 값을 만들어서 반환.
		
		System.out.println("-------------------------------------------------------------");
		
		// set => 무작위 객체가 저장되어있음. => index 개념이 없음. => 반복문 활용 불가.
		// 그렇다면, 담겨있는 객체를 순차적으로 접근하고자 할 때?
		
		// 1.  for문 활용.(단, 향상된 for문만 사용 가능)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------------------------------");
		
		//2. ArrayList 활용
		ArrayList<Student> list = new ArrayList<Student>(hs2); //hs2에 담겨있는 객체들이 추가된채로 리스트가 생성됨.
		//list.addAll(hs2);
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 3. HashSet 클래스에서 제공하는 Iterator 반복자를 이용한 방법.
		//hs2에 담겨있는 객체들을 Iterator에 담는 과정.
		System.out.println("-------------------------------------------------------------");
		Iterator<Student> it = hs2.iterator();
		
		while(it.hasNext()) { // it에 next로 빼올 값이 남아있으면 true / 없으면 false;
			System.out.println(it.next());
			// StringTokenizer와 비슷한 원리이다. 
		}
		// .iterator() : List 계열과 set 계열에서만 사용 가능한 메소드. (Map 계열에서는 사용불가)
		
	}

}
