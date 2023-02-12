package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	/*
	 *while문
	 *[표현법]
	 *
	 * [초기식]-> 필수는 아님.
	 *while(조건식){
	 *	반복적으로 실행할 내용.
	 *	[증감식] -> 필수는 아님
	 *}
	 *
	 *for문과 다르게 초기식 증감식이 필수는 아님.
	 *분기문에서 초기식, 증감식 없이 작성하는 방법 배울것.
	 *
	 */
	
	public void method1() {
		//for문을 while문으로 바꿔보기.
		/*
		 * 
		 * for(int i = 0; i < 5; i++){
		 * 	System.out.println("안녕하세요");
		 * }
		 * 
		 */
		int i =0;
		while(i < 5) {
			System.out.println("안녕하세요.");
			
			System.out.println("i의 값은? "+i);
			i++;
		}
		System.out.println(i);
	}
	
	public void method2() {
		// 1 2 3 4 5
		// A_For 예제 2번 while문으로 변경.
		int i = 1;
		while(i <= 5) {
			//System.out.print(i+" ");
			//i++;
			System.out.print(i++ +" ");
		}
	}
	
	public void method3() {
		//1~10사이의 홀수만 출력.
		int i = 1;
		while(i < 10) {
			System.out.print(i +" ");
			i+=2;
		}
		System.out.println();
		System.out.println("i의 값은? "+i);
		
		i = 1;
		while(i<10) {
			if(i%2 == 1) {
				System.out.print(i+ " ");
			}
			i++;
		}
	}
	
	public void method4() {
		//1부터 랜덤값(1 ~ 100)까지의 총 합계
		
		int random = (int)(Math.random()*100 + 1);
		
		int sum = 0;
		
		
//		int i = 1;
//		while(i <= random) {
//			//sum += i;
//			//i++
//			sum += i++;
//		}
		//System.out.printf("1부터 %d 까지의 총 합계 : %d", random, sum);
		//멋들어지게 코드 줄이기
		while(random > 0) {
			sum += random--;
		}
		System.out.printf("1부터 %d 까지의 총 합계 : %d", random, sum);
	}
	
	public void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int i = 0;
		int strLength = str.length();
		while(i < strLength) {
			System.out.println(str.charAt(i++));
			//i++;
		}
	}
	
	/*
	 * do--while문 //실무에서 많이 사용하지 않음
	 * [표현법]
	 * do{
	 * 	 실행할 코드 -> 조건식이 true/false던 "무조건" 1번은 실행하고, 그 후에 조건검사를 함.
	 * }while(조건식);
	 * 
	 * while문과 do-while문의 차이점은 
	 * while문은 처음 수행할 때도 조건검사를 하고 true여야 안의 내용이 실행되는데
	 * 단, do while문은 첫 실행은 별도의 조건검사 없이. "무조건" 한번은 실행됨
	 * 
	 */
	
	public void method6() {
		// 애초에 조건이 맞지 않아도 무조건 한번은 실행함.
		
		int num = 1;
		do {
			System.out.println("안녕하세요");
		}while(num == 0);
	}
	
	public void method7() {
		// 1 2 3 4 5
		int i = 1;
		do {
			System.out.print(i++ +" ");
		}while(i <= 5);
	}
	
	public void method8(){
		//1부터 사용자가 입력한 숫자까지 총 합계
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i++;
			
		}while(i <= num);
		System.out.printf("1부터 %d까지의 총 합계 : %d", num, sum);
	}
}
