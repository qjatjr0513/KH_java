package com.kh.chap06_method.controller;

public class MethodTest2 {
	/*
	 * static 메소드
	 * [표현법]
	 * 접근제한자 static 예약어 반환형 메소드명([매개변수]){
	 * 수행내용
	 * [return 반환값];
	 * }
	 * 
	 * - 호출시 객체 생성할 필요 없음(static 필드와 동일)
	 * - 프로그램 시작시에 정적메모리(static메모리영역)에 메소드가 자동으로 저장되어있음.
	 * - 클래스명.메소드명(전달값);으로 호출가능. ex)Math.random()
	 * - 예약어, 매개변수, return구문(void인경우)은 생략 가능.
	 * 
	 */
	int num = 50;
	
	static int num3 = 50;
	public static int method(int num1, int num2, char op) {
		System.out.println("매개변수도 있고, 반환형도 있는 static 메서드입니다.");
		//+ - * / % <-
		//num1과 num2의 op을 실행후 반환.
		int result = 0;
		switch(op) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-': 
			result = num1 - num2;
			break; 
		case '*': 
			result = num1 * num2;
			break;
		case '/' : 
			result = num1 / num2;
			break;
		case '%' : 
			result = num1 % num2;
			break;
		default :System.out.println("연산자를 잘못 입력하셨습니다.");
			return 0;
		}
		
		return result + num3;// static에 정의한 매개변수명이 switch문의 num2와 동일한 경우 우선순위는 switch문의 num2가 더 높다.
		
		/*
		 * static 메서드 안에서는 static이 아닌 field 멤버가 접근이 불가능함.
		 * 스태틱 메서드는 프로그램 시작 시 정적메모리영역(static)에 들어가게 되는데,
		 * 이때 스태틱으로 선언된 필드(전역변수 포함) 함께 정적 메모리 영역에 들어갈것. 따라서 사용이 가능함.
		 * 단, 스태틱으로 선언되지 않은 전역변수는 스태틱 메모리에 올라가는 시점에서 사용이 불가능하므로 에러 발생.
		 * 즉, 같은 범위에 있어야한다.
		 * 
		 */
	}
}
