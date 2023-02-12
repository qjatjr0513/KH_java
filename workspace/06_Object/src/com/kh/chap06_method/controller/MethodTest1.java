package com.kh.chap06_method.controller;

public class MethodTest1 {
	/*
	 * 메소드
	 * [표현법]
	 * 
	 * 접근제한자 [예약어] 반환할 값의 자료형 메소드명([매개변수]){
	 * 			수행할 코드;
	 * 			[return 반환할 값] <- 반환형이 void일 경우 생략가능.
	 * }
	 * 
	 * 메소드를 정의한 후 항상 여러번 호출해서 쓸수있다.
	 */
	
	//1. 매개변수 없고, 반환형도 없는 메서드.
	
	public void method1() {
		System.out.println("매개변수가 없고, 반환형도 없는 매서드 입니다.");
		
		//1부터 10까지 합계 구해서 출력하시오.
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += 1;
		}
		
		System.out.println("총 합계 : "+sum);
		
		//return; void메서드 같은 경우 생략되어있음. JVM이 자동으로 생성.
	}
	
	//2. 매개변수 없고, 반환형 있는 메서드
	public int method2() {
		System.out.println("매개변수 없고, 반환형은 있는 메서드입니다.");
		
		// 1~ 100까지 랜덤값을 반환하는 메서드.
		int random = (int)(Math.random()*100 + 1);
		
		return random;
	}
	
	//3. 매개변수가 있고, 반환형은 없는 매서드.
	public void method3(int num1, int num2) {
		System.out.println("매개변수가 있고, 반환형은 없는 매서드 잆니다.");
		
		//num1값과 num2의 값을 비교하여 더 큰 값을 출력하는 메소드.
		
		//출력예시
		//xx와 xx중 더 큰값은 xx입니다.
		int bigger = num1;
		if(num1 <num2) {
			bigger = num2;
		}
		
		System.out.printf("%d와 %d중 더 큰값은 %d입니다.", num1, num2, bigger);
	}
	
	//4. 매개변수도 있고, 반환형도 있는 메서드.
	public int method4(int a, int b) {
		System.out.println("\n매개변수도 있고, 반환형도 있는 메서드입니다.");
		//두 매개변수를 곱한 결과를 반환함.
		return a*b;
	}
}
