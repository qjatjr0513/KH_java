package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자(단항연산자) ++, --
	 * ++ : 변수에 담긴 값을 1 증가 시키는 연산자.
	 * ++변수값(전위 연산자) , 변수값++(후위 연산자) 
	 * -- : 변수에 담긴 값을 1 감소 시키는 연산자.
	 * --변수값, 변수값-- 
	 * 전위연산자 -> (선 증가 or 선 감소) 후 처리
	 * 
	 * 후위연산자 -> 선처리(후 감소 or 후 증가)
	 */
	public void method1() {
		//전위연산테스트
		int num = 10;
		System.out.println("전위연산전 num의 값은?"+num);//10
		System.out.println("연산 1회 후 num의 값은?"+ ++num);//11
		System.out.println("연산 2회 후 num의 값은?"+ ++num);//12
		System.out.println("연산 3회 후 num의 값은?"+ ++num);//13
		
		System.out.println("최종 num의 값은?"+num);//13
		
		System.out.println("===============================");
		
		//후위연산테스트
		int num2 = 10;
		System.out.println("후위연산전 num2의 값은?"+num2);//10
		System.out.println("연산 1회 후 num2의 값은?"+ num2++);//10
		System.out.println("연산 2회 후 num2의 값은?"+ num2++);//11
		System.out.println("연산 3회 후 num2의 값은?"+ num2++);//12
		
		System.out.println("최종 num2의 값은?"+num2);//13
		
	}
	
	public void method2() {
		//전위연산
		int a = 10;
		int b = ++a; //a값을 먼저 증가 시키고 나서 b라는 변수에 대입을 합니다.
		//++a => int a = a+1;
		System.out.printf("a : %d, b : %d\n", a, b);// a : 11, b : 11
		
		//후위연산
		int c = 10;
		int d = c++;
		System.out.printf("c : %d, d: %d\n", c, d); // c : 11, d : 10
		
		System.out.println("===========================");
		
		int num = 20;
		System.out.println("현재 num ? "+num);//20
		System.out.println("++num ? "+ ++num);//21
		System.out.println("num++ ? "+ num++);//21(22)
		System.out.println("--num ? "+ --num);//21
		System.out.println("num-- ? "+ num--);//21(20)
		
		System.out.println("최종 num? "+num);//20
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = num1++ *3;//int result1 = 20*3;
		
		System.out.printf("num1 = %d, result1 = %d\n", num1, result1); //21, 60
		
		int num2 = 20;
		int result2 = ++num2 *3;//int result2 = 21*3;
		
		System.out.printf("num2 = %d, result2 = %d\n", num2, result2); //21, 63
	}
	
	public void method4() {
		int a = 10;
		int b = 20;
		int c = 30;
		
		//선출력 금지!!
		System.out.println(a++);//a = 10(11)
		System.out.println((++a) + (b++));//12 + 20 = 32,a = 12, b =20(21) 
		System.out.println((a++) + (--b) + (--c));//61 a = 12(13), b = 20, c = 29
		System.out.printf("a : %d, b : %d, c: %d\n", a, b, c); // a : 13, b:20 ,c:29
	}
	
}
