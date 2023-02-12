package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person ps = new Person();
		System.out.println(ps.info());
		ps.setId("user1");
		ps.setPwd("pwd1");
		ps.setName("이범석");
		ps.setAge(25);
		ps.setGender('남');
		
		System.out.println(ps.info());
	}
}
