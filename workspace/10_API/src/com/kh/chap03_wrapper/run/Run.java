package com.kh.chap03_wrapper.run;

public class Run {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * => 기본자료형을 객체로 포장해주는 클래스들을 래퍼 클래스라고함.
		 * 
		 * 기본자료형	<--->	Wrapper클래스
		 * boolean			Boolean
		 * char				Character(많이 사용)
		 * byte				Byte
		 * short			Short
		 * int 				Integer(많이 사용)
		 * long				Long
		 * float			Float
		 * double 			Double
		 * 
		 */
		int num1 = 10;
		int num2 = 15;
		//System.out.println(num1.equals(num2)); //equals는 클래스에 담겨있음, 기본자료형에는 메소드가 담길수없다.
		//일반 자료형에서 객체 자료형의 메소드를 활용하고 싶을때 Wrapper클래스로 변환하여 사용한다.
		//자동형변환이 일어남.
		//기본자료형 -> Wrapper자료형으로 Boxing됨.(기본자료형에서 클래스로 바뀌는 것이기때문에 Boxing이라고 표현)
		
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.compareTo(i1)); 
		//a.compareTo(b) : 두 값을 비교해서 a가 b보다 크면 1, 작으면 -1, 같으면 0을 리턴.
		
		//Wrapper자료형에서 => 기본자료형(UnBoxing)
		int num3 = i1;
		int num4 = i2;
		
		//기본자료형 <---> String
		String str1 = "10";
		String str2 = "15.3";
		
		//1. String ---> 기본자료형 : 파신한다.
		
		int i = Integer.parseInt(str1);// "10" ---> 10
		double d = Double.parseDouble(str2);//"15.3" ---> 15.3
		System.out.println(i+d);
		
		//2. 기본자료형 ---> String
		//    10   --> "10"
		//	  15.3 --> "15.3"
		// String.valueOf(변환할 기본 자료형값) : String 변환된다.
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		System.out.println(strI+strD);
	}

}
