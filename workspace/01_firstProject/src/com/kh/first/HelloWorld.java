package com.kh.first; //패키지 선언부.

//한줄짜리 주석

/*
 * 패키지 명명규칙
 * 1. 패키지명은 소문자로 작성해야한다.
 * 2. 패키지는 적어도 3단계이상으로 작성하기를 권장한다.
 * ex) com.회사명(kh).프로젝트명
 * ex2)kh 회원관리 프로젝트 com.kh.member
 * 3. 패키지명의 2단계까지는 도메인의 역순으로 작성한다.
 * ex)www.naver.com -> com.naver.네이버 프로젝트명
 * ex2) www.google.com -> com.google.프로젝트명
 * 
 * 클래스 명명규칙.
 * 1. 클래스명의 첫글자는 대문자로 작성하길 권장한다.
 * (클래스의 풀네임 -> 패키지명 + 클래스명)
 * ex)com.kh.first.HelloWorld
 * 2. 같은 패키지안에 동일한 클래스명은 존재할수없다.
 * 3. 디폴트패키지에 클래스를 작성하는것 권장하지 않음
 * 3-1. 관리가 힒듬
 * 3-2. 디폴트패키지에 클래스 작성하는경우 다른패키지의 클래스에서 해당클래스를 사용할 수 없음.
 */

public class HelloWorld { //클래스 선언부
	/*
	 * 메인메소드 특징.
	 * 1. 메인메소드 고정된 틀을 가지고 있음.(public static void main(String[]args){})
	 * 2. 메인메소드는 모든 자바프로그램의 시작점(entry-point)
	 * 3. 모든자바프로그램은 반드시 1개의 메인메소드가 포함되어야만 합니다.
	 * 
	 * 일반메소드 특징.
	 * 1. 스스로 실행(호출)할 수 없음.
	 */
   public static void main(String[]args) { //메인 메소드 선언부
      System.out.println("Hi Everyone!!");
      //일반메소드호출.
      //[표현법] 일반메소드 이름();
      printMyname();
   }
   
   public static void printMyname() {
	   System.out.println("안녕하세요. 제이름은 민경민입니다.");
   }
   

}