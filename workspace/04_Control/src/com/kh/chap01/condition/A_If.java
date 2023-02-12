package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 기본적으로 프로그램의 진행은 순차적으로 진행됨.
	 * 단, 이 순차적인 흐름을 바꾸고자 한다면 제어문을 통해서 직접 제어가 가능함.
	 * 
	 * 선택적으로 실행시키고자할때 -> 제어문
	 * 반복적으로 실행시키고자할때 -> 반복문
	 * 그외의 흐름제어시 | -> 분기문
	 * 
	 * 조건문
	 * 조건식을 통해 참이냐 거짓이냐를 판단해서 그에 해당하는 코드 실행.
	 * 
	 * 조건식의 결과는 항상 true/false여야함!
	 * 보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(AND,OR)을 주로 사용.
	 * 
	 * 조건문은 크게 if문(단독 if, if~else, if~elseif, 중복 if문), switch문 으로 나뉨
	 * 
	 */
	public void method1() {
		//삼항연산자를 조건문으로 바꿔보자.
		
		/*
		 * [표현법]
		 * if문
		 * 
		 * if(조건식){
		 * 		//조건식이 true인 경우 실행될 코드작성
		 * }
		 * => 조건식의 결과가 참인경우 중괄호블럭 안의 코드가 실행됨.
		 * => 조건식의 결과가 거짓인경우 중괄호 블럭 안의 코드 무시하고 넘어감.
		 */
		
		//사용자에게 정수를 입력받고 양수인지, 양수가 아닌지 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
//		num > 0 ? "양수다" : "양수가 아니다";
		
		if(num > 0) {
			System.out.println("양수다.");
		}
		if(num <= 0) {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		/*
		 * if ~else문.
		 * [표현법]
		 * 
		 * if(조건식){
		 *	//조건식이 참이면 실행될 코드
		 *} else{
		 *	//조건식이 거짓(false) 실행될 코드.
		 *}
		 */
		if(num > 0) {
			System.out.println("양수다.");
		}
		else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void method3() {
		
		/*
		 * if ~  else if
		 * [표현법]
		 * 
		 * if(조건식1){
		 * 	// 조건식1의 값이 참인경우 실행될 코드
		 * } else if(조건식2){
		 *	//조건식2의 값이 참인경우 실행될 코드
		 *} else if(조건식3){
		 *	//조건식3의 값이 참인경우 실행될 코드
		 *} [ else {
		 *	//위의 조건들이 모두 거짓일 경우 실행될 코드
		 *} ]
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요. : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다!");
		} else if(num == 0) {
			System.out.println("0이다!");
		}else /* if(num < 0) */{ //시스템의 효율을 위해서 else 사용
			System.out.println("음수다!");
		}
	}
	
	public void method4() {
		//사용자에게 정수값을 입력받고 어린이/청소년/성인 출력
		//if else if문 사용해서 만들어볼게요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		//어린이(13세 이하), 청소년(13세 초과 19세 이하), 성인(19세 초과)
		
//		if(age <= 13) {
//			System.out.println("어린이");
//		} else if (/* age > 13 && */age <= 19) {
//			System.out.println("청소년");
//		} else /* if(age > 19) */ { //ctrl+shift +? = 선택 주석
//			System.out.println("성인");
//		}
		String result = ""; //중괄호 안에서 변수를 사용하고 싶으면 if문 밖에서 선언해줌 
		if(age <= 13) {
			result = "어린이";
		} else if (/* age > 13 && */age <= 19) {
			result = "청소년";
		} else /* if(age > 19) */  { 
			result = "성인";
		}
		System.out.println(result);
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		//이름, 성별 한글자를 입력받아 남자인지 여자인지 출력하는 프로그램.
		//출력문 : xxx은 xx입니다.
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F만 입력) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = "";
		if (gender == 'm' || gender == 'M') {
			result = "남자";
		}
		else if(gender == 'f' || gender == 'F') {
			result = "여자";
		} else {
			//result ="잘못입력하셨습니다.";
			System.out.println("잘못입력하셨습니다.");
			return; // 현재 메소드를 빠져나가는 역할.
		}		
		System.out.printf("%s님은 %s입니다.", name, result);
	}
	
	public void method6() {
		//특이케이스. 문자열간의 동등비교에 관하여(문자열 == 문자열)
		//사용자에게 이름을 입력받아 민경민과 일치하는지 비교하는 프로그램.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		String name2 = "민경민";
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 참조자료형 : String 
		 * 
		 * 문자열.equals(비교할 문자열)
		 *  
		 *  
		 */
		
		
		if(name.equals(name2)) { //!name.equals(name2) => 같지 않다.
			System.out.println("민경민이시군요.");
		}else {
			System.out.println("민경민이 아니군요. 누구세요?");
		}
	}
	
	public void method7() {
		//양수를 입력받고, 짝수 홀수 판별해서 출력하는 프로그램.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		//전제조건 먼저 if 문으로 조건식 만듦.
		if(num > 0) {
			if(num%2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("양수가 아닙니다. 다시 입력하세요.");
			method7();
		}
	}
	
}
