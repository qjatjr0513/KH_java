package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		//모든 클래스는 Object클래스의 후손으로, Object안의 메소드들은 다 가져다 쓸 수 있음.
		
		Book bk = new Book("수학의 정석", "수학쌤", 15000);
		
		/*
		 * 출력문 안에 레퍼런스변수(참조형변수(주소값을 참조하는 변수) == 직접만든 자료형들이 포함됨.)를 제시해서 호출하는 경우
		 * 내부적으로 JVM이 자동으로 !! toString메소드를 호출함.
		 * 
		 * 부모클래스인 Object클래스에 있는 toString()의 원래 기능
		 * 클래스이름@주솟값을 문자열형태로 반환.
		 * 
		 */
		
		System.out.println(bk/*.toString() */);
		System.out.println(bk.toString());
		
		// toString 메서드 오버라이딩 전;
		// 클래스이름 @ 주솟값.
		// toString 메서드 오버라이딩 후;
		// title : 수학의 정석, author : 수학쌤, price  : 15000
	}

}
