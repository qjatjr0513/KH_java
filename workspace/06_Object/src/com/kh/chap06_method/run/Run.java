package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class Run {

	public static void main(String[] args) {
		//1. MethodTeset1
		MethodTest1 mt1 = new MethodTest1();
		mt1.method1();//static 안붙은 메소드
		
		System.out.println(mt1.method2());
		
		mt1.method3(45, 50);
		
		System.out.println(mt1.method4(10, 10));
		
		System.out.println("==================================");
		System.out.println(MethodTest2.method(10, 32, '+'));
	}

}
