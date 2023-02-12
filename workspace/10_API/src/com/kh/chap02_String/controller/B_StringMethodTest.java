package com.kh.chap02_String.controller;

public class B_StringMethodTest {

	//문자열 관련 유용한 메서드.
	public void metho1() {
		
		String str1 = "hello World";
		//1. 문자열.charAt(int index) : char
		//   문자열에서 전달받은 index위치의 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(4);
		System.out.println("ch : "+ch);
		
		//2. 문자열.concat(String str) : String(반환형) -> DB에서 많이 사용
		// 문자열과 전달된 또다른 문자열을 하나로 합쳐서 리턴.
		String str2 = str1.concat("!!");
		System.out.println("Str2 : "+str2);
		
		//3. 문자열.length();
		System.out.println("str1의 길이는 ? "+str1.length());
		
		//4.문자열.substring(int beginIndex)
		// 	문자열의 beginIndex위치부터 끝까지 문자열을 추출해서 리턴.
		// 	문자열.substring(int beginIndex, int endIndex)(많이 사용)
		// 	문자열의 beginIndex위치부터 endIndex -1위치까지 추출해서 리턴.
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,6));//빈칸까지
		System.out.println(str1.substring(0,5));
		//String currentDate = "2022. 08. 09";
		
		
		
		//5. 문자열.replace(char old, char new) : String
		//	 => 문자열의 old문자를 new문자료 변환한 문자열을 리턴.
		String str3 = str1.replace('l', 'c');
		System.out.println(str3);
		
		//6. 문자열.trim() : String
		//	 => 문자열의 앞 뒤 공백을 제거한 문자열 리턴.
		String str4 = "		JA	Va		";
		System.out.println("trim()??"+str4.trim());
		System.out.println("trim()??"+"		JA	Va		".trim()); //이런식으로도 호출 가능
		//7. 문자열.toUpperCase() : String
		//	 => 문자열을 모두 다 대문자로 변경 후 리턴.
		//	 문자열.toLowerCase() : String
		//	 => 문자열을 모두 다 소문자로 변경 후 리턴.
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//8. 문자열.toChararray() : char []
		char [] arr = str1.toCharArray();
		System.out.println(arr[0]);
		for(int i = 0; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		//char [] => String
		char[] arr2 = {'a','p','p','l','e'};
		//9.valueOf(char[] data) : String
		// -> 전달된 char[]에 담긴 문자들을 엮어서 하나의 문자열로 합쳐서리턴.
		System.out.println(String.valueOf(arr2));
	}
}
