package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				continue;
			}			
			for(int i = 1; i<=num;i++) {
				System.out.print(i + " ");
					
			}
			break;
			}		
		}
	
	public void practice2() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
		// “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}

		}
	}
	
	public void practice3() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<= num; i++) {
			sum += i;
			if(num==i) {
				System.out.print(num +" = ");
			}else {
				System.out.print(i+" + ");
			}
		}
		System.out.print(sum); 
	}
	
	public void practice4() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
		//력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt(); // 4
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt(); // 8
			if(num1 < 1 || num2 < 1) {				
				System.out.println("1 이상의 숫자를 입력해주세요");
				continue;
			}
			if(num2 >= num1) {
				//num2가 num1보다 크거나 같은 경우
				for(int i = num1; i <= num2 ; i++) { //4 5 6 7 8 
					System.out.print(i+ " ");	
				}			
			}else {
				//num1이 num2보다 큰경우
				for(int i = num2; i <= num1 ; i++) { //4 5 6 7 8 
					System.out.print(i+ " ");	
				}			
			}
			break;
		}
	}
	
	public void practice5() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
		//“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num > 9) {
				System.out.println("9이하의 숫자를 입력해주세요");
				continue;
			}
			
			for(int i = num; i<=9; i++) {
				System.out.printf("==== %d단 ====\n", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %d\n", i, j, (i*j));
				}
			}
			break;
		}
	}
	
	public void practice6() {
		//사용자로부터 시작 숫자와 공차를 입력 받아
		//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		//단, 출력되는 숫자는 총 10개입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int a = sc.nextInt();
		
		for(int i = 0; i< 10; i++) {
			System.out.print(num + " ");
			num += a;
		}
		
//		for(int i = num; i<=(num + 9*a); i+=a) {
//			System.out.println(i +" ");
//		}
//		System.out.println();
		
	}
	
	public void practice7() {
//		정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		“0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			if(op.equals("/") && num2 ==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue;
			}
			switch(op) {
			case "+" :
				System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 + num2)); 
				break;
			case "-" : 
				System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 - num2));
				break;
			case "*" : 
				System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 * num2));
				break;
			case "/" : 
				System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 / num2)); //%f는 기본적으로 소수점 6번째 자리까지 표현
				break;
			case "%" : 
				System.out.printf("%d %s %d = %d\n",num1, op, num2, (num1 % num2));
				break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
			
		}		
	}
	
	public void practice8() {
//		*
//		**
//		***
//		****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
//		//*
//		for(int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		//**
//		for(int j = 0; j < 2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		//***
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		// ****
//		for (int j = 0; j < 4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
//		****
//		***
//		**
//		*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
//		//****
//		for(int j = 0; j < 4; j++) {
//			System.out.println("*");
//		}
//		System.out.println(); //개행(\n)
//		
//		//***\n
//		for(int j = 0; j < 3; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		//**\n
//		for(int j = 0; j < 2; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		//*\n
//		for(int j = 0; j<1; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
		for(int i=0; i < num; i++) {
			for(int j=0; j < num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		//   *
		//  **
		// ***
		//****
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); 
		
//		//   *\n
//		for(int j = 0; j < 3; j++) { // 3 2 1 0 ...감소.
//			System.out.print(" ");
//		}
//		for(int j = 0; j<1; j++) { // 1 2 3 4 ... 증가.
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//  **\n
//		for(int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		
//		// ***\n
//		for (int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//****\n
//		for (int j = 0; j < 0; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		for(int j = 1; j<= num; j++) {
			for(int i = 0; i < (num - j); i++) {
				System.out.print(" ");
			}
			for(int i = 0; i < j; i++) {
				System.out.print("*");			
			}
			System.out.println();
			
		}
	}
	
	public void practice11() {
		//****
		// ***
		//  **
		//   *
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
//		//****\n
//		for(int j = 0; j < 0; j++) {
//			System.out.println(" ");
//		}
//		for(int j = 0; j < 4; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		// ***\n
//		for(int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		//  **\n
//		for (int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//  *\n
//		for (int j = 0; j < 3; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i; j++) { //num=4 => 0 1 2 3
				System.out.print(" ");
			}
			for(int j = 0; j< num-i; j++) { // 4 3 2 1 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice12() {
		//    *
		//   ***
		//  *****
		// *******
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
//		//   *\n
//		for(int j = 0; j < 3; j++) {
//			System.out.println(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		//  ***\n
//		for (int j = 0; j < 2; j++) {
//			System.out.println(" ");
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		// *****\n
//		for (int j = 0; j < 1; j++) {
//			System.out.println(" ");
//		}
//		for (int j = 0; j < 5; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//
//		//*******\n
//		for (int j = 0; j < 0; j++) {
//			System.out.println(" ");
//		}
//		for (int j = 0; j < 7; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
		
//		for(int i = 0; i < num; i++) { 
//			for(int j = 0; j < num-i; j++) { //3 2 1 0
//				System.out.print(" ");
//			}
//			for(int j = 0; j< 1+i; j++) { // 1 3 5 7
//				System.out.print("*");
//			}
//			for(int j = 0; j < 1-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j< i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <= num; i++) { //3 2 1 0 -> 1 2 3 4
			for(int j = 0; j < num - i; j++) { //3 2 1 0 
				System.out.print(" ");
			}
			for(int j = 0; j< (i * 2 - 1); j++) { // 1=> (1*2-1) 3=> (2*2-1) 5=> (3*2-1) 7 => (4*2-1)
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice13() {
		//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		//소수? n부터 1까지 나누었을때 나누어 떨어지는 수가 1과 자기 자신 뿐인 수를 말함
		//ex) 2 , 3 , 5 , 7 ...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		// 37
		// 2 3 4 5 .... 36 (소수 알고리즘.)
		// Math.sqrt() -> 루트 구하는 메서드.
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println("소수가 아닙니다.");
				return; 
			}
		}
		System.out.println("소수입니다.");
	}
	
	public void practice14() {
		//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		int count = 0;
//		for(int j = 2; j<= num; j++) {
//			//첫번째 방법
//			boolean isPrime = true;
//			for(int i = 2; i < j; i++) {//Math.sqrt(j)
//				if(j % i == 0) {
//					isPrime = false;
//					 break;
//				}
//			}
//			if(isPrime) {
//				count++;
//				System.out.print(j+ " "); //소수라면 2 3 5 7 9 11				
//			}
//		}
		//두번째 방법
		loop1: //for문에 라벨표시
		for(int j = 2; j <= num; j++) {
			loop2:
			for(int i = 2; i<j; i++) {
				if(j%i == 0) {
					continue loop1; // break loop1; //명명한 라벨로 돌아간다.
				}
			}
			System.out.print(j+" ");
			count++;
		}
		
		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다.", num, count);
	}
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0 || i % 3 ==0) {
				System.out.print(i + " ");
			}
			if(i % 2 == 0 && i % 3 ==0 ) {
				count++;
			}
		}
		System.out.println("\ncount : "+count);
	}
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			for(int j = 0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= num; i++) {
			for(int j = 0; j<=num-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<num+1; j++) {
				if((i==1 || i==5) || (j==1 || j==5)){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}
	public void practice18() {
		//  *
		// ***
		//*****
		// ***
		//	*
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) { // 0 1 2
			for(int j = 0; j<num-i; j++) { // 2 1 0
				System.out.print(" ");
			}
			for(int j = 0; j<(i * 2-1); j++) { // 1->(1*2-1) 3-> (2*2-1) 5->(3*2-1)
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<=num-1; i++) { //0 1 -> 1 2
			for (int j = 0; j < i; j++) { // 1 2
				System.out.print(" ");
			}
			for (int j = 0; j < ((num-i)*2-1); j++) { // 3(2*2-1) 1(1*2-1) // 2 1 
				System.out.print("*");
			}
			System.out.println();
		}
		
//		//  *\n
//		for(int j = 0; j<2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j<1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ***\n
//		for (int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//*****\n
//		for (int j = 0; j < 0; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 5; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ***\n
//		for (int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// *\n
//		for (int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for (int j = 0; j < 1; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
	}
	
	public void practice19() {
		//  *
		// * *
		//*   *
		// * *
		//  *
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		
		for(int i = 1; i <= num; i++) { // 0 1 2
			for(int j = 0; j<num-i; j++) { // 2 1 0
				System.out.print(" ");
			}
			for(int j = 0; j<(i * 2-1); j++) { // 1->(1*2-1) 3-> (2*2-1) 5->(3*2-1)
				//내부반복문 시작할때와 내부반복문 제일 마지막에 * 을 찍는다.
				if(j == 0 || j == (i * 2-2)) {
					System.out.print("*");					
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 1; i<=num-1; i++) { //0 1 -> 1 2
			for (int j = 0; j < i; j++) { // 1 2
				System.out.print(" ");
			}
			for (int j = 0; j < ((num-i)*2-1); j++) { // 3(2*2-1) 1(1*2-1) // 2 1 
				if(j == 0 || j == (num-i)*2 -2) {
					System.out.print("*");					
				}else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
		
//		for(int i = 0; i<3; i++) {
//			System.out.println(" ");
//		}
//		for(int i = 0; i<1; i++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		for(int i = 0; i<2; i++) {
//			System.out.println(" ");
//		}
//		for(int i = 0; i<3; i++) {
//			System.out.println(" ");
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		for(int i = 0; i<3; i++) {
//			System.out.println(" ");
//		}
//		for(int i = 0; i<1; i++) {
//			System.out.println("*");
//		}
//		System.out.println();
	}
	
	
}


