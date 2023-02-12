package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * CheckedException은 반드시 예외처리를 해줘야 하는 예외들.
	 * (즉, 예측 불가한 곳에서 발생하기 때문에 미리 예외 처리 구문을 작성해 둬야함.)
	 * => 주로 외부 객체와 어떤 입출력하는 상황에서 발생.
	 * 
	 */
	
	public void method1() throws IOException {
//		try {
//			method2();			
//		}catch(IOException e) {
//			System.out.println("예외가 발생했다");
//		}
//		try {
//			method2();			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		method2();
	}
	
	public void method2() throws IOException{
		//Scanner sc = new Scanner(System.in);
		
		//Scanner와 같이 키보드로 입력받을 수 있는 객체 (단, 문자열만 가능)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //스케너 보다 문자열 처리 효율이 좋음(코딩 테스트에서 많이 사용)
		
		System.out.print("아무 문자열 입력해주세요 : ");
		// 방법1. try ~ catch문 이용
//		try {
//			String str = br.readLine();
//			System.out.println("문자열의 길이"+str.length());
//			// 이 메소드 호출시 IOException가 발생할수 있음을 컴파일 단계에서 에러로 알려줌.
//		}catch(IOException e) {
//			System.out.println("예외발생!!");
//		}
//		
//		try {
//			int num = Integer.parseInt(br.readLine());
//			System.out.println("문자열의 길이"+num);
//			// 이 메소드 호출시 IOException가 발생할수 있음을 컴파일 단계에서 에러로 알려줌.
//		}catch(IOException e) {
//			System.out.println("예외발생!!");
//		}
		
		// 방법 2. throws : 지금 해당 매서드에서(method2) 예외처리를 하지않고, 이 메소드를 호출한곳(method1)으로
		//IOException예외처리를 떠넘기겠다 라는 뜻.
		String str = br.readLine(); 
	}
	
	/*					예외의 발생시점								예외처리
	 * RuntimeException 프로그램 실행 시 => 런타임 에러(컴파일 에러 x) => 필수가 아님 => uncheckedException
	 * RuntimeException 그 외			=> 컴파일 에러 				=> 필수		=> checkedException
	 * 
	 */
	
	
	
	
	
	
	
}
