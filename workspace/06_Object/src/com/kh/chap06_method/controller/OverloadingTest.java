package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * - 한 클래스 내에 같은 메소드 명으로 정의할 수 있는 방법.
	 * - 매개변수의 자료형의 개수, 순서가 다르게 작성되어야한다.
	 * - 단, 매개변수명, 접근제한, 반환형은 메소드 오버로딩에 영향을 주지않는다.
	 * 
	 */
	
	public void test() {
		//메소드 오버로딩의 대표적 케이스 : println
		//System.out.println
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, String b) {
		
	}
	
	public void test(String b, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	// 매개변수명과는 상관없이 자료형의 갯수와 순서가 같아서 에러가 발생했다. 
	// 매개변수의 자료형의 개수와 순서가 다르게 작성되어야 한다.
//	public void test(int c, int d) {
//		
//	}
	
	public void test(int a, int b, String c) {
		
	}
	
	//반환형이 다르다고 오버로딩이 적용되지 않음.
	//메소드를 호출하는 시점에 매개변수가 동일하기 때문에 에러가 발생함.
	//즉, 반환형과 상관없이 매개변수의 자료형과 순서가 다르게 작성되어야한다.
//	public int test(int a, int b, String c) {
//		
//		return 1;
//	}
	
	// 접근제한자 다르다고 오버로딩이 적용되지 않음.
//	private void test(int a, int b, String c) {
//		
//	}
}
