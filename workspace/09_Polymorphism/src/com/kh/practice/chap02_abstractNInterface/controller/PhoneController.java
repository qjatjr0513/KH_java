package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] phone = new Phone[2];
		 phone[0] = new GalaxyNote9();
		 phone[1] = new V40();
		 
		for(int i = 0; i<phone.length;i++) {
			if(phone[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)phone[i]).printInformation();
			}
			if(phone[i] instanceof V40) {
				result[i] = ((V40)phone[i]).printInformation();
			}
		}
		
		 return result;
	}
}
