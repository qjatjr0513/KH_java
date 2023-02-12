package com.kh.chap01_math;

//import java.lang.*;
//눈에 보이지 않지만 자동으로 항상 import 되어있음.

public class MathRun {

	public static void main(String[] args) {
		// Math mat = new Math();
		
		// Math클래스에 있는 다양한 기능.
		// 파이 => Math클래스안에 상수필드로 정의되어있음.
		System.out.println("파이 : "+Math.PI);
		
		// 올림메소드
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1)); // 반환값 double.
		
		// 반올림 메소드
		System.out.println("반올림 : "+Math.round(num1)); // 반환값 long
		
		//버림 메소드
		System.out.println("버림 : "+Math.floor(num1)); // 반환값 double
		
		//가장 가까운 정수값을 알아낸 후 실수형 반환
		System.out.println("가장가까운 정수값 : "+Math.rint(num1)); //반환값은 double
		
		//절대값
		int num2 = -10;
		System.out.println("절대값 : "+Math.abs(num2));
		
		//최소값
		System.out.println("최소값 : "+Math.min(5, 10));
		
		//최대값
		System.out.println("최대값 : "+Math.max(5, 10));
		
		//제곱근(루트)
		System.out.println("4의 제곱근 : "+Math.sqrt(4)); //반환값은 double
		
		//제곱
		System.out.println("2의 10제곱 : "+Math.pow(2,10)); 
		
		/*
		 * java.lang.Math클래스의 특징
		 * - 모든필드 => 상수필드.
		 * - 모든필드 => static 메소드
		 * 
		 * 모든게 다 static이기 때문에 Math.으로 접근이 가능한것(객체생성 안해도 됨)
		 * Math클래스의 생성자가 private이기 때문에 애초레 생성조차 불가능함.
		 */
		
		
		
		
		
		
		
		
		
		
	}

}
