package com.kh.operator;

public class C_Arithmethic {
	// 산술연산자(이항연산자 -> 값을 2개 가지고 연산)
	// +, -, *, /, %
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		//System.out.println("num1 + num2 ? "+num1+num2);//num1 + num2 ?103
		System.out.println("num1 + num2 ? "+ (num1+num2));//13
		
		System.out.println("num1 - num2 ? "+ (num1-num2));//7
		System.out.println("num1 * num2 ? "+ (num1 * num2));//30 가독성을 위해 ()를 추가해줌.(추가하지 않아도 에러 x)
		System.out.println("num1 / num2 ? "+ (num1 / num2));//3
		System.out.println("num1 % num2 ? "+ (num1 % num2));//1
		
		//실수로 산술연술 연습
		double a = 35;//35.0
		double b = 10;//10.0
				
		System.out.println(a / b);//3.5
		System.out.println(a % b);//5.0
	}
	
	public void quiz() {
		int a = 5;
		int b = 10;
		
		int c = (++a) + b; //a = 6, b = 10, c = 16
		int d = c /a; // a = 6, b = 10, c = 16, d = 2
		int e = c % a;// a = 6, b = 10, c = 16, d = 2, e = 4
		int f = e++; // a = 6, b = 10, c = 16, d = 2, e = 4(5), f=4
		int g = (--b) + (d--); //a = 6, b = 9, c = 16, d = 2(1), e = 5, f=4, g = 11
		int h = 2;//a = 6, b = 9, c = 16, d = 1, e = 5, f=4, g = 11. H = 2
		int i = (a++)+b /(--c/f) * (g-- -d) %(++e + h);
		//a = 6(7), b = 9, c = 15, d = 1, e = 6, f=4, g = 11(10), H = 2
		//(6) + 9 /(15 / 4) * (11 - 1) % (6 + 2);
		//6 + 9 / 3 * 10 % 8
		//6 + 3* 10 %8
		//6 + 30 %8
		//6 + 6 
		//i = 12
		//a = 7, b = 9, c = 15, d = 1, e = 6, f=4, g = 10, H = 2, i = 12
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		System.out.println("g : "+g);
		System.out.println("h : "+h);
		System.out.println("i : "+i);
		
		
	}
}
