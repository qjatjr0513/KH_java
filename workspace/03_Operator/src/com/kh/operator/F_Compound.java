package com.kh.operator;

public class F_Compound {
	/*
	 * 복합대입연산자 (=) : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 *  a = a+1;  a+=1 
	 *  연산처리속도가 빨라지므로 복합대입연산자를 사용하는것을 권장함.
	 *  
	 *  +, -, <, /, <, %, *
	 *  a = a+3 => a+=3;
	 *  a = a-3 => a-=3;
	 *  a = a*3 => a*=3;
	 *  a = a/3 => a/=3;
	 *  a = a%3 => a%=3;
	 */
	public void method1() {
		int num = 12;
		System.out.println("현재 num의 값은 ? " +num); //12
		
		num += 3;
		System.out.println("3증가시킨 num의 값은 ? " +num); //15
		
		num -= 3;
		System.out.println("3감소시킨 num의 값은 ? " +num); //12
		
		num *= 6;
		System.out.println("6배 증가시킨 num의 값은 ? " +num); //72
		
		num /= 2;
		System.out.println("2로 나눈 num의 값은 ? " +num);//36
		
		num %= 4;
		System.out.println("4로 나눈 나머지 num 값은 ? " +num);//0
		
		System.out.println("최종 num의 값은 ? "+num);
		
		//+=는 문자열에서도 사용이 가능하다!
		String str = "Hello";
		str += "World";
		
		System.out.println(str);
	}
}
