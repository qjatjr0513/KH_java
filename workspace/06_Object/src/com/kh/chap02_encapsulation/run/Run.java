package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student std = new Student(); // 객체생성 == 인스턴스화
		
		//std.name;
		
		std.setName("이범석");
		std.setAge(25);
		std.setHeight(180);
		
		System.out.println("이름은 ? "+std.getName());
		System.out.println("나이는 ? "+std.getAge());
		System.out.println("키는 ? "+std.getHeight());
		
		Student song = new Student();
		// xxx님의 나이는 xx살이고, 키는 xxx.xcm 입니다.
		song.setName("송지호");
		song.setAge(25);
		song.setHeight(160);
		
		
		System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm 입니다.\n", song.getName(), song.getAge(), song.getHeight());
		
		Student song2 = new Student();
		song2.setName("송지호");
		song2.setAge(25);
		song2.setHeight(160);
		
		System.out.println("\n"+song2.info());
		
	}

}
