package com.kh.chap01_beforeVsafter.before.run;

import com.kh.chap01_beforeVsafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("삼성", "d-01", "데스크탑", 200000000, true);
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1_300_000, "KT"); 
		
		Tv t = new Tv("엘지", "t-01", "슈퍼슬림tv", 3_500_000, 60);

		System.out.println(d.toString());
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * 매 클래스마다 중복된 코드를 일일히 기술해두게되면
		 * 수정과 같은 유지보수작업시 매번 일일이 찾아서 수정해야하는 번거로움이 생김.
		 * ex)필드명 수정, 새로운 필드 추가시.
		 * 
		 * "상속"이라는 개념을 적용시켜서
		 * 각 클래스마다 중복되는 필드, 메소드들을 단 한번만 다른 클래스에 작성하도록하자.
		 * 그 클래스(부모클래스)를 가져다 쓰는 식으로 작업하면 훨씬 간편할것.
		 * 
		 */
	}

}
