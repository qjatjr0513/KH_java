package com.kh.chap04_Field.model.vo;

//필드에서 사용가능한 접근제어자.
public class FieldTest2 {
	
	/*
	 * (+)public => 어디서든 (같은 패키지, 다른 패키지) 접근 가능.
	 * (#)protected => 같은 패키지라면 무조건 접근 가능, 다른 패키지라면 "상속"구조인 클래스에서만 접근 가능.
	 * (~)default => 오로지 같은 패키지에서만 접근 가능.
	 * (-)private => 오직 해당 클래스에서만 접근 가능.
	 * 
	 * 위에서 부터 아래로 내려올수록 접근할 수 있는 범위가 제한됨.
	 * 
	 * +,#,~,-는 클래스 다이어그램 표기법.
	 * 
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
}
