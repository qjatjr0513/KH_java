package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u = new User();
		
		User u2 = new User("dlqjatjr", "qjatjr", "이범석");
		
		//System.out.println(u2.info());
		
		User u3 = new User("dlqjatjr", "qjatjr", "이범석", 25,'M');

		System.out.println(u3.info());
	}

}
