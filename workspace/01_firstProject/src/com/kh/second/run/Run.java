package com.kh.second.run;

import com.kh.second.MyName;


public class Run {
	public static void main(String[] args) {
		//다른클래스의 일반메소드 사용방법.
		//[표현법]클래스이름 클래스별칭 = new 클래스이름();
		MyName mn = new MyName();
		//클래스별칭.일반메소드();
		mn.sayMyName();//노란경고는 sayName에 static키워드가 붙었기 때문.
		
		//static키워드 붙은경우 사용방법.
		//[표현법] 클래스이름.클래스안의일반메소드명();
		//MyName.sayMyName();
	}
}
