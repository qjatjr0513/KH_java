package com.kh.practice.charCheck.controller;

import com.kh.controller.C_CustomException;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}
	
	public int countAlpha(String s)  throws CharCheckException {
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		// 'a' ~ 'z' 'A' ~ 'Z'
		char [] arr = s.toLowerCase().toCharArray(); 
		//ApPlE -> apple -> {'a','p','p','l','e'};
		//apple -> {'a','p','p','l','e'};
		int count = 0;
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				count++;
			}
			if(arr[i] == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		return count;
	}
}
