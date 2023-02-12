package com.kh.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	
	/*
	 * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * RuntimeException의 자식클래스들.
	 * - ArrayIndexOutOfBoundsException : 배열의 부정확한 인덱스로 접근할 때 발생하는 예외.
	 * - NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 에러.
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외.
	 * - NullPointerException : 래퍼런스가 아직 null임에도 불구하고 접근하려고 할때 발생하는 예외.
	 * - ArithmeticException : 나누기 연산시 0으로 나눌때 발생하는 예외.
	 * -.....
	 * 
	 * 	=> 이러한 RuntimeException과 관련한 예외는 충분히 예측가능한 상황이기 때문에 
	 * 	   예외 자체가 발생이 안되게끔 조건문으로 해결 가능하긴함.
	 * 	   굳이 예외처리를 할 필요가 없음.
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException
		// 사용자에게 두개의 정수값을 입력받아, 나눗셈 연산 결과 출력.
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수(0은 제외) : ");
		int num2 = sc.nextInt();
		
		//해결방법 1. 조건문으로 처리
//		if(num2 != 0) {
//			System.out.println("나눗셈 연산 결과 : "+(num1 / num2));
//		}else {
//			System.out.println("0으로 나눌수 없습니다.");
//		}
		//해결방법 2. 예외처리 구문으로 해결(예외가 발생했을 경우 실행할 내용을 정의해 두는 것.)
		/*
		 * [표현법]
		 * try ~catch문
		 * 
		 * try{
		 * 	//예외가 발생될수 있을법한 구문.
		 * }catch(발생될예외클래스 변수명){
		 * 	//해당예외 발생할 경우 실행할 구문.
		 * }
		 * 
		 */
		try {
			System.out.println("나눗셈 연산 결과 : "+(num1 / num2));
		} catch(ArithmeticException e){
			System.out.println("0으로 나눌수는 없습니다.");
			e.printStackTrace();
			//	오류를 추적할 수 있는 메서드.
			// 	현재 예외가 발생한 정보를 볼수있음.
		}
		
		System.out.println("프로그램 종료.");
	}
	
	public void method2() {
		
		System.out.print("정수 입력(0 제외) : ");
		
		 try {
			 int num = sc.nextInt();
			 // 정수 이외의 값을 입력한 경우, InputMismatchException발생!
			 System.out.println("나눗셈 연산결과 : "+(10 / num));
		 }catch(ArithmeticException e) {
			 System.out.println("0으로 나눌 수 없습니다.");
		 } catch(InputMismatchException e) {
			 System.out.println("정수로 입력해주세요.");
		 }
		
		 System.out.println("프로그램 종료.");
	}
	
	public void method3() {
		// 발생가능한 모든 에러에 대해 예외처리.
		System.out.print("배열의 크기 : ");
//		try {
//			int size = sc.nextInt();
//			
////			if(size > 0) {
////				System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
////				return;
////			}
//			//100번째 인덱스에 담긴 값을 출력.
//			int[] arr = new int[size];
//			
//			System.out.println(arr[100]);
//		}catch(InputMismatchException e) {
//			System.out.println("정수로 입력해주세요");
//		}
//		catch(NegativeArraySizeException e) {
//			System.out.println("배열의 크기는 음수로 제시할 수 없습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("부적절한 인덱스로 접근했습니다.");
//		}
		
		try {
			int size = sc.nextInt();
			

			//100번째 인덱스에 담긴 값을 출력.
			int[] arr = new int[size];
			
			System.out.println(arr[100]);
		}catch(NegativeArraySizeException e) { // 범위가 더작은 exception을 먼저 기술해야됨.
			System.out.println("배열의 크기는 음수일 수 없습니다.");
		}catch(RuntimeException e) {
			//e.printStackTrace();
			System.out.println("예외가 발생했네요. 근데 "
					+ "입력값이 정수가 아니거나, 부적절한 인덱스에 접근했습니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}
	/*
	 * RuntimeException 관련된 예외는 
	 * - 조건문으로 해결이 가능 => 예외 자체가 발생 안되게끔 개발자가 소스코드로 핸들링할 수 있다.
	 * - 예외 처리 구문으로 해결 가능 => 예외가 발생했을때 대비해서 그 때 실행할 내용을 정의해 두는 것.
	 * 
	 * 예측이 가능한 상황 => 조건문으로 해결(권장하는 방법)
	 * 예측이 불가능한 상황 => 예외처리 구문으로 해결.
	 * 
	 * RuntimeException계열은 충분히 예측 가능한 상황이기 때문에 조건문으로 해결하는것을 권장.
	 * 
	 * 
	 */
}
