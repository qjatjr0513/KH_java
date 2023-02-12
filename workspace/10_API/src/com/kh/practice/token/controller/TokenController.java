package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		//a b c d
		StringBuffer sb = new StringBuffer();
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		return sb.toString();
	}
	
	public String firstCap(String input) {
		String result = input.substring(0,1);
		//apple ----> a
		String result2 = input.substring(1);
		//apple ----> pple
				
		return result.toUpperCase()+result2;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		char[] arr = input.toCharArray();
		
		for(char ch : arr) {
			if(ch == one) {
				count ++;
			}
		}
		return count;
	}
}
