package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		CharacterController cc = new CharacterController();
		String s = sc.nextLine();
//		int count = cc.countAlpha(s);
//		
//		System.out.printf("%s에 포한된 영문자 개수 : %d",s,count);
		
		try {
			int count = cc.countAlpha(s);
			System.out.printf("%s에 포한된 영문자 개수 : %d",s,count);
		}catch(CharCheckException e) {
			e.printStackTrace();
		}	
	}
}
