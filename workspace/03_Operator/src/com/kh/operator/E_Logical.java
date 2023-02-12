package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리 연산자(이항연산자)
	 * 두개의 논리값을 연산하는 연산자
	 * 논리값 (논리연산자) 논리값 => 결과도 논리값(boolean)
	 * 
	 * AND 연산자 : 논리값 && 논리값
	 * 			=>왼쪽 오른쪽 둘다 true여야 최종적으로 true 반환이됨. 둘중 하나라도 false라면 false반환.
	 * OR 연산자 : 논리값 || 논리값
	 * 			=>왼쪽 , 오른쪽 어느값이라도 true가 있으면 true반환. 둘다 false라면 false반환.
	 */
	public void method1() {
		//사용자가 입력한 정수값이 양수 "이면서(이고)" 짝수인지 확인.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력해주세요 : ");
		int num = sc.nextInt();
		
		boolean result = (num >0) && (num%2) == 0;
		//&& 의미 : 그리고, ~이면서, ~이고
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? : "+result);
	}
	
	public void method2() {
		//사용자가 입력한 값이 1이상 100이하의 수인지 확인.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값 1개를 입력해 주세요. :");
		int num = sc.nextInt();
		
		boolean result = 1 <= num && num <= 100;
		System.out.println("사용자가 입력하 값이 1이상 100이하의 수인가요 ?" +result);
		
		/*
		 * &&(And): 그리고, ~이면서, ~이고, ~뿐만아니라.
		 * 			두개의 조건 모두 true여야 결과값도 true
		 * 			둘중 하나라도 false라면 결과값은 false
		 * 
		 */
		
	}
	
	public void method3() {
		//사용자가 입력한 값이 영문 대문자인지 확인하는 프로그램!.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어를 한단어 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		//boolean result = ch >= 65 && ch <= 90;
		boolean result = ch >= 'A' && ch <= 'Z';
		System.out.println(result);
		//'A'65, 'Z' 90
		
	}
	public void method4() {
		//사용자가 입력한 값이 'y' 'Y'인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 하시려면 y를 입력해주세요. : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = ch == 'y' || ch == 'Y';
		//|| : 또는 , ~이거나
		System.out.println("사용자가 입력한 값이 y나 Y입니까 ? : "+result);
		
		/*
		 * ||(OR): 또는 ~이거나
		 * 두개의 값중 하나라도 true이면 결과도 true
		 * 두개의 값(조건의 결과값)이 모두 false라면 결과도 false 
		 */
		
	}
	
	/*
	 * 정리 :
	 * && : 두개의 조건이 모두 true여야 결과값이 true임(AND == ~이고, 이면서, 그리고)
	 * 
	 * &&연산자는 연산자기준으로 왼쪽(앞)의 결과가 false라면 뒤의 조건식은 실행하지 않음.
	 * 
	 * a && b && c && d
	 * 
	 * || : 두개의 조건중 하나가 true면 결과값이 true임(|| == 또는 , ~이거나)
	 * || 연산자는 연산자기준으로 왼쪽(앞)의 결과가 true라면 뒤의 조건식은 실행하지 않음.
	 * 
	 * 
	 */
	
	public void method5() {
		int num1 = 10;
		
		boolean result1 = (num1 < 5) && (++num1 >0);//false
		System.out.printf("result1 : %s, num1 : %d \n",result1, num1);
		
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		System.out.printf("result2 : %s, num2 : %d \n",result2, num2);
		
        //boolean result3 = false && (++num2 >0);
		boolean result3 = true || (++num2 >0);
		// 뒤의 비교연산구문이 deadcode라고 한다.
		//실행시 오류는 안나는데 궅이 쓸필요 없는데 왜써? 라는 뜻.
		
	}
}
