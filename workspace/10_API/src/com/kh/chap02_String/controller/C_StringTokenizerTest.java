package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		// 문자열을 분리해서 문자열 배열에 저장하는 방법.
		String str = "Java,Oracle,JDBC,HTML,CSS,JavaScript";
		
		//방법1. 분리된 문자열들을 String[]배열에 차곡차곡 담고자할때..
		//문자열.split(String 구분자) : String[]
		
		String [] arr = str.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("=================================");
		//방법2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을때
		//	    java.util.StringTokenizer 클래스를 이용하는 방법.
		//	    StringTokenizer stn = new StringTokenizer(분리하고자하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println("분리된 문자열의 갯수 : "+stn.countTokens());
		
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
		//System.out.println(stn.nextToken()); //java.util.NoSuchElementException
		
//		int num = stn.countTokens();
//		for(int i = 0; i<num;i++) {
//			System.out.println(stn.nextToken());
//		}
		
		while(stn.hasMoreTokens()) { // stn공간에 남아있는 토큰이 있는동안만 반복하는 반복문.
			System.out.println(stn.nextToken());
		}
	}
}
