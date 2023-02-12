package com.kh.practice2.func;

public class CastingPractice {
	public void method() {
		int iNum1 = 10;
		int iNum2 =4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); //2
		System.out.println((int)dNum); //2
		
		System.out.println( iNum2 * dNum ); // 10.0
        System.out.println( (float) iNum1 ); // 10.0
        
        System.out.println( iNum1 / (double)iNum2 ); // 2.5
        System.out.println( dNum ); // 2.5
        
        System.out.println( (int)fNum ); // 3
        System.out.println( iNum1 / (int)fNum ); // 3

        System.out.println( iNum1 / fNum );// 3.3333333 float 최대 소수점 7자리까지 표현
        System.out.println( iNum1 / (double)fNum ); // 3.3333333333333335 
        //double 최대 소수점 자리수 표현 3이 무한으로 나와서 마지막에 5가 나옴(소수는 부정확하다.)
        
        System.out.printf("%.16f" , iNum1 / (double)fNum);
        
        System.out.println( ch ); // 'A'
        System.out.println( (int)ch ); // 65
        System.out.println( (int)ch +  iNum1 ); // 75
        System.out.println( (ch + (char)iNum1) ); // 'K'

	}
}
