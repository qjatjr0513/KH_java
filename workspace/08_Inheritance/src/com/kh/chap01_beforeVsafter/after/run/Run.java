package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		Desktop d = new Desktop("삼성", "d-01","데스크탑",2000000,true);
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1_300_000, "KT"); 
		Tv t = new Tv("엘지", "t-01", "슈퍼슬림tv", 3_500_000, 60);
		
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		//메소드 오버라이딩 => 재정의한 메소드가 자식 클래스에 없다면 부모클래스에서 가져오고,
		//				  자식클래스에 재정의한 메소드가 있다면 자식클래스의 메소드가 실행우선권을 가짐.
		
		
		/*
		 * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스들을 작성 가능.
		 * - 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할때 용이
		 * => 즉, 프로그램의 생산성 향상 및 유지보수에 크게 기여함.
		 * 
		 * 상속의 특징
		 * - 클래스간의 다중 상속이 불가능하다.(단일 상속만 가능)
		 * ex) 부모님이 여럿일 수 없음.
		 * - 명시되어 있지 않지만 모든 ~ 클래스는 object 클래스의 후손이다.
		 * => object 클래스에 있는 메소드를 쓸 수 있음.
		 * => object 클래스에 있는 메소드가 마음에 안들면 오버라이딩을 통해 재정의가 가능하다. 
		 */
	}

}
