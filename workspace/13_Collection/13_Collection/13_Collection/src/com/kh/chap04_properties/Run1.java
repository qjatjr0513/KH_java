package com.kh.chap04_properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.model.vo.Snack;

public class Run1 {

	public static void main(String[] args) {
		// Properties : Map계열 => key, value 저장된다.
		// 				단, Properties만의 특징이라고 한다면 key, value 모두 String으로 제한되어있음.

		Properties prop = new Properties();
		
//		prop.put("씬다이제", new Snack("초코맛", 1500));
//		
//		System.out.println(prop);
//		System.out.println(prop.get("씬다이제"));
//		
//		// 주로 Properties를 사용하는 경우는 Properties에 담겨 있는 key + value 세트들을 파일로 기록.(storexxx 메소드)
//		// 파일에 기록되어있는 key+value를 가져올때 (loadxxx메소드)가 사용됨.
//		
//		try {
//			prop.store(new FileOutputStream("test.properties"), "테스트");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// 그래서 properties에 값을 추가할때는 보통 어떻게하나 ??
		// 1. setProperty(String key, String value)
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장순서 유지 x, key 값 중복 안됨.
		
		//2. 값을 가져오는건 getProperty(String key) 이용.
		System.out.println(prop.getProperty("Set"));
		
		try {
			//3. store(OutputStream os, String comments) : prop에 담긴 key - value 값들을 파일로 출력.
			prop.store(new FileOutputStream("test.properties"), "코멘트");
			
			prop.storeToXML(new FileOutputStream("test.xml"), "TEST");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
