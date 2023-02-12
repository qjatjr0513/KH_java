package com.kh.operator;

public class A_LogicalNegation {
	/*
	 * 논리 부정 연산자 ! (단항연산자)
	 * 
	 * !논리값 = 논리값
	 * 
	 * 논리값(true / false)를 반대로 바꿔주는 연산자. 
	 */
	public void method() {
		System.out.println("true의 부정은?" + !true);
		System.out.println("false의 부정은?" + !false);
		
		boolean b1 = true;
		boolean b2 = !b1;
		
		//sysout + lCtrl + space
		System.out.println("b1 : "+b1);
		System.out.println("b2 : "+b2);
		
		boolean b3 = !(5>3);
		System.out.println("b3 : "+b3);
	}
}
