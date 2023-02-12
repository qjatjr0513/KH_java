package com.kh.variable;

public class C_Cast {
	
	/*
	 * 형변환: 값의 자료형을 바꾸는 개념.
	 * 
	 * 컴퓨터 상에서 값 처리 규칙
	 * 1. 대입연산자(=)를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 함!
	 * 		=> 즉, 같은 자료형에 해당하는 값만 대입이 가능하다.
	 * 		=>다른 자료형의 값을 대입하고자 한다면 "형변환이"이 필수!
	 * [표현법] 자료형 변수명 = (바꿀 자료형)값;
	 * ex) long a = (long)9999999999; 
	 * 
	 * 2. 같은 자료형끼리만 연산 가능.
	 * 		=>즉, 다른자료형끼리 연산을 수행하고 싶으면 한 구문은 "형변환"을 해야함.
	 * [표현법] 값 + (바꿀 자료형) 값;
	 *  ex) int a = 3;
	 * 		double b = 3.14;
	 * a+(int) b;
	 *  
	 * 형변환의 종류.
	 * 1. 자동형변환 => 자동으로 형변환이 진해되기 때문에 내가 직접 형변환을 진행할 필요가 없음.
	 * 			ex)작은 바이트의 자료형 => 큰 바이트의 자료형의로의 형변환시.
	 * 
	 * 2. 강제(명시적)형변환 => 자동형변환이 되지 않아 내가 직접 강제로 형변화 해야하는 경우 
	 * 			ex) 큰 바이트의 자료형 => 작은 바이트의 자료형으로의 형변환시.
	 * 
	 * [표현법] (바꿀자료형) 값;
	 * 
	 * (바꿀자료형)== 형변환연산자 == cast연산자
	 * 
	 * 주의사항
	 * boolean(논리자료형)은 형변환 불가.
	 *
	 */
	//자동 형변환.
	public void autoCasting() {
		
		//1. int(4byte)->double(8byte)
		int i1 =10;
		
		double d1 = /*(double)*/ i1;
		
		System.out.println("d1 : "+d1); //10.0
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/ i2 + d2; //정수(int) + 실수(double).
		
		System.out.println("result : "+result); //15.3
		
		//2. int(4byte)->long(8byte)
		int i3 = 1000;
		long l1 = /*(long)*/ i3;
		
		long l2 = 10000000000l;
		
		//3. 특이케이스 long(8byte) -> float(4byte)
		//정수가 실수로 담길때에는 큰사이즈의 자료형이어도 작은 사이즈의 실수변수에 대입 가능.
		long l3 = 1000000000l;
		float f1 = l3;
		
		//4. 특이케이스 char(2byte) <-> int(4byte) 형변환
		char ch = 65;
		System.out.println("ch : "+ ch);
		
		int i4 = 'A';
		System.out.println("i4 : "+ i4); //65
		
		int sum = 'A' + 10;
		System.out.println("sum : "+sum);
		System.out.println("sum : "+ (char)sum); //=> 강제형변환.
		
		//5. 특이케이스 byte(1byte), short(2byte) 연산시
		byte b1 = 1;
		byte b2 = 10;
		
		byte b3 = (byte)(b1 + b2); //11은 int 자료형임!
	}
	
	//강제(명시적)형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 하는 경우.
	public void forceCasting() {
		
		//1. double(8byte) -> float(4byte)
		
		double d1 = 8.0;
		float f1 = (float)d1;
		System.out.println("f1 : "+f1);
		//2. double(8byte) -> int(4byte)
		double d2 = 10.89;
		int i1 = (int)d2;
		
		System.out.println("i1 : "+i1); //10 소수점 아래는 버림.
		
		int i2 = 10;
		double d3 = 5.89;
		
		int sum = (int)(i2 + d3);//15 강제형변환
		System.out.println("sum : "+sum);
		
		int sum2 = i2 + (int)d3;//15 강제 형변환(한개의 변수만 변환시키는 방법)
		System.out.println("sum2 : "+sum2);
		
		double sum3 = i2 + d3; //15.89 정확한 실행 결과를 원할때 사용.
		
		//번외 데이터손실테스트.
		int i3 = 290;
		byte b1 = (byte) i3;
		//-127 ~ 128
		
		System.out.println("b1 : "+b1);
	}
	
	
	
	
	
	
	
	
	
	
	
}
