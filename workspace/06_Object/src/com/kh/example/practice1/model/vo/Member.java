package com.kh.example.practice1.model.vo;

public class Member {
	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public Member() {
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	public void changeName(String name) {
		this.memberName = name;
		
	}
	
	public void printName() {
		System.out.println(memberName);
	}
}
