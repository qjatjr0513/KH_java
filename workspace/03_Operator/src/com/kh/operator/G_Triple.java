package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항연산자 : 3개의 값을 가지고 연산하는 연산자
	 * 
	 * [표현법]
	 * 조건식? 조건식의 결과가 true이면 실행할 값 : 조건식의 결과가 false라면 실행할 값.
	 * 
	 * 조건식이란 true나 false가 나오게하는 연산자(주로 비교, 논리연산자를 통해 작성.)
	 */
	public void method1() {
		//사용자가 정수값을 입력하면 그값이 양수인지, 양수가 아닌지 판별한 후 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력해주세요 : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수임." : "양수가 아님."; 
		//System.out.println(result);
		
		System.out.println(num > 0 ? "양수임." : "양수가 아님.");
	}
	
	public void method2() {
		//사용자가 입력한 정수값이 짝수인지 홀수인지 판별후 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 한개 입력해 주세요. : ");
		int num = sc.nextInt();
		
		String str = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		
		//System.out.println(str);
		
		//xxx은 xx입니다.
		System.out.printf("%d은 %s\n", num, str);
	}
	
	public void method3() {
		// 사용자에게 종료의사를 입력받은 후 판별해서 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 눌러주세요. : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ch == 'y'|| ch == 'Y' ? "종료하겠습니다." : "계속 진행하겠습니다.";
		
		System.out.println(result);
		
	}
	
	public void method4() {
		//사용자로부터 영어를 한글자 입력받고 대문자인지, 대문자가 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어를 입력해 주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = ch >= 'A' && ch <='Z' ? "대문자입니다." : "대문자가 아닙니다.";
		
		System.out.println(result);
	}
	
	public void method5() {
		 //사용자가 입력한 정수값이 양수인지 음수인지, 0인지 정확하게 판별하고 출력해보는 프로그램.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		//String result = num > 0 ?  "양수입니다." : (num < 0? "음수입니다." : "0입니다.");
		String result = num > 0 ?  "양수입니다." : (num == 0? "0입니다." : "음수입니다.");
		
		System.out.println(result);
	}
	public void method6() {
		//3개의 값을 입력받음.
		//2개의 값은 정수, 나머지 하나는 +, - '문자'를 입력받아서.
		//+일 경우 2개의 정수를 +연산한 후 출력.
		//-일 경우 2개의 정수를 -연산한 후 출력.
		//+도 -도 아닌 경우. "잘못입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.print("+나 -를 입력해 주세요 : ");
		char op = sc.nextLine().charAt(0);
		
		String result = op == '+' ?  num1 + num2 + "" : (op == '-' ? num1 - num2 +"" : "잘못입력하셨습니다." );
		System.out.println(result);
	}
}
