package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	//반복문
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나.
	 *어떤 실행코드를 "반복적"으로 수행시켜줌.
	 *
	 * 크게 두종류로 나뉨(FOR문, while문(do-while문))
	 * 
	 * [표현법]
	 * for(초기식;조건식;증감식){ // 세미콜론(;)으로 각 식 구분. 무조건 세미콜론 있어야함.
	 * 	반복적으로 실행시킬 코드
	 * }
	 * 
	 * -	초기식 : 반복문이 시작될때 "초기에 단 한번만 실행"되는 구문
	 * 				(반복문에서 사용할 변수를 선언 및 초기화 구문) 
	 * 				예) int i = 0;
	 * 
	 * - 	조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 				조건식이 true일 경우 반복문 실행
	 * 				조건식이 false가 되는 순간 반복문 멈추고 빠져나옴
	 * 				(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * 
	 * - 	증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 				(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 * 				예) i++, i--, i+=1
	 * 
	 * for문 안에 초기식, 조건식, 증감식 각각 생략 가능하긴함. 단! 세미콜론(;)은 반드시 작성해야한다.
	 * for(;;){
	 * 
	 * }
	 */
	
	public void method1() {
		//"안녕하세요"를 5번 반복해서 출력;
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("안녕하세요");
		}
		for(int i = 1; i <= 5; i++) { //1에서 부터 5보다 작거나 같을때까지 반복 실행
			System.out.println("안녕하세요");
		}
		for(int i = 16; i < 21; i++) {
			System.out.println("안녕하세요");
		}
		for(int i = 1; i < 10; i+=2) { //1, 3, 5, 7, 9
			System.out.println("안녕하세요");
		}
//		for(;;) {
//			System.out.println("안녕하세요");
//		} //무한 반복
	}
	
	public void method2() {
		// 1 ~ 5까지 출력
		// i의 값이 1에서 6보다 작을때 까지 1씩 증가할 동안 반복 수행
		// 1 2 3 4 5
		for(int i = 1; i < 6; i++) {
			System.out.print(i+" ");// 1 2 3 4 5 
		}
		
		//i의 값은 1이고 5보다 작거나 같을때까지 i의 값을 1씩 증가시키면서 반복수행해.
		for(int i = 1; i <= 5; i++) { 
			System.out.println(i);
		}
	}
	
	public void method3() {
		//5 4 3 2 1
		for(int i = 5; i >= 1;i--) {
			System.out.print(i+" ");
		}
	}
	
	public void method4() {
		//i값이 1에서 부터 10까지 홀수만 출력
		// 1 3 5 7 9
		// i%2 ==1
		for (int i = 1; i < 10; i+=2) { //반복 5회 효율성이 좋음
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1 ; i < 10; i++) { //반복문이 9번실행
			if(i % 2 == 1) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void method5() {
		// 1 2 3 4 5 6 7 8 9 10
		
		for(int i = 0; i<=9; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	//산술연산+반복문 응용.
	public void method6() {
		//1 ~ 10까지의 총 합계.
		int sum = 0;
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * .....
		 * sum += 10;
		 */
		for(int i = 0; i<=10; i++) {
			sum +=i;
			System.out.println("1에서부터 10까지의 총 합계 : "+sum);
		}
		
		System.out.println("최종합계 : "+sum);	
	}
	
	//산술연산 + 스케너 + 반복문
	public void method7() {
		//1에서부터 입력한 수까지 모두 더해서 출력해보기.
		Scanner sc = new Scanner(System.in);
		/*
		 * int num = sc.nextInt();
		 * 
		 * int sum =0;
		 * 
		 * sum += 1;
		 * ....
		 * sum += num;
		 */
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		//1에서부터 num까지 총 합계
		System.out.printf("1에서부터 %d까지 총 합계: %d\n",num, sum);
	}
	
	public void method8() {
		// 1에서부터 random(1 ~ 10)값까지 총 합계
		// Math.random();
		// 0.0 <= random <= 1.0 *10 -> 10.0
		// 0.0 <= random <= 9.999999999999
		// int 강제 형변환시
		//2 <= random <= 9 
		//1 <= random <= 10 
		
		//Math ma = new Math(); 이렇게는 사용하지 않음/
		int random = (int)(Math.random() * 10 + 1);
		//[표현법]
		//Math.random() * 출력하고자 하는 갯수 + 시작수
		// 시작수 <= random < (출력하고자 하는 갯수 + 시작수)
		System.out.println("1 ~ 10사이의 랜덤값 : "+random);
		
		int sum = 0;
		
		for(int  i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 총 합은 : %d", random, sum);
	}
	
	public void method9() {
		String str = "apple";
		
		/*
		 * a -> str.charAt(0)
		 * p -> str.charAt(1)
		 * p -> str.charAt(2)
		 * l -> str.charAt(3)
		 * e -> str.charAt(4)
		 */
		//int i, j, k(변수명 많이 사용)
		for(int i = 0; i < 5; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		//민경민 경민 alsrudals rudals
		
		System.out.println("문자열의 길이는 ? "+str.length());
		
		int strLength = str.length();
		
		//길이값을 변수에 담아서 사용하는게 효율이 더 좋다.
		for(int i = 0;  i < strLength; i++) {
			System.out.println(str.charAt(i));
		}
		//동일한 반복문
		for(int i = 0;  i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method11() {
		// 구구단 (2단)출력
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 */
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", 2, i, (2 * i));
		}
	}
	
	//구구단 + Scanner
	public void method12() {
		// 사용자에게 단수(2~9)를 입력 받아 아래와 같이 구구단 표현.
		//2~9에서 벗어나는 수를 입력한 경우. 잘못입력했습니다.
		
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * 2 X 4 = 8
		 * 2 X 5 = 10
		 * 2 X 6 = 12
		 * 2 X 7 = 14
		 * 2 X 8 = 16
		 * 2 X 9 = 18
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("단수(2~9) 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
			}
		}else {
			System.out.println("잘못 입력했습니다. (2 ~ 9 사이의 정수를 입력해주세요.)");
			method12();
		}
	}
	int random = (int)(Math.random() * 10 + 1);
	public void method13() {
		//구구단 출력
		//단수를 random 값으로 받아서 출력(2 ~ 9)
		int dan = (int)(Math.random() * 8 + 2); // 0.0 <= random <=0.9999999 => Math.random(), 2.0 <= random <= 7.9999999 + 2(9.99999999999)		
		// Math.random() -> 0.0 <= random <= 0.9999999999
		// Math.random() -> 2 <= random <= 9
		
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan * i));
		}
	}
	//중첩 반복문
	public void method14() {
		// 1 2 3 4 5
		//연이어서 5번 출력
		/*
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 *  1 2 3 4 5
		 */
		for(int j = 1; j <= 5; j++) {
			for(int i = 1; i <= 5 ;i++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
	
	public void method15() {
		//별찍기.
		//*****
		//*****
		//*****
		//*****
		//*****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method16() {
		//별찍기
		//1**** -> 1행 1열 숫자가 있고, 나머지는 별
		//*2*** -> 2행 2열 숫자가 있고, 나머지는 별
		//**3** -> 3행 3열 숫자가 있고, 나머지는 별
		//***4* 
		//****5
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == j) {
				System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	//중첩반복문
	public void method17() {
		//출력예시
		//12345
		
		//23456
		
		//34567
		
		//45678
		
		//56789
		
		//행 : 가로(외부 for문)
		//열 : 세로(내부 for문)
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 1+i; j <= 5+i; j++) {
//				System.out.print(j);//12345
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j+i);//12345
			}
			System.out.println();
		}
	}
	
}
