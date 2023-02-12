package com.kh.chap04_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Run2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		System.out.println(prop);
		
		try {
			prop.load(new FileInputStream("test.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		/*
		 * .properties 사용하는 경우는 
		 * 해당 프로그램이 기본적으로 가져야할 정보들을 .properties 확장자 문서로 저장해두면
		 * key value모두 문자열이기 때문에 개발자가 아닌 일반 관리자가 해당 문서를 다루기 쉽다.
		 * => jdbc가서 사용할 예정
		 * 
		 * .xml 사용하는 경우는 
		 * .xml확장자 문서는 다양한 프로그래밍 언어간에 호환성이 쉽기 때문.
		 * 
		 */
		
		
	}

}
