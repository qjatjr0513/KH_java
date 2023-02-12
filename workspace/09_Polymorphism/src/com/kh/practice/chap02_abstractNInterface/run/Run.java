package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		String[] arr = pc.method();
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println(" ");
		}
	}

}
