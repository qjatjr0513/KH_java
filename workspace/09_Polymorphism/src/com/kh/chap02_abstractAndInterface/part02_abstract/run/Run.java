package com.kh.chap02_abstractAndInterface.part02_abstract.run;

import com.kh.chap02_abstractAndInterface.part02_abstract.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part02_abstract.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part02_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		Sports[] s = new Sports[2];
		
		s[0] = new Basketball();
		s[1] = new Football();
		
		for(Sports sport : s) {
			//sport.rule();
		}
		
		// Sports s2 = new Sports();
		// 추상클래스로 절대 객체 생성 불가.
		// 왜냐면 미완성된 클래스이기 때문.
		Sports s3; // 단, 객체 생성만 불가능하고, 레퍼런스 변수(주소값 저장하는 변수)로는 사용이 가능하다.
		
		/*
		 * 추상 클래스
		 *  - 미완성된 클래스 abstract class
		 *  - 객체 생성불가(단, 레퍼런스 변수로는 선언가능.)
		 *  - 추상메소드가 존재하는 순간 반드시 추상클래스로 정의
		 * 	  (일반필드 + 일반 메소드 + [추상메소드(생략가능)])
		 * 	  하지만 추상메소드가 없어도 추상클래스로 만들수도 있긴함.
		 * 	  언제 => 클래스가 아직 구체적이지 않은 덜 구현된 상태인것 같을때(개념적)(자주 사용하는 목적)
		 *		  => 현재 이 클래스를 객체 생성이 불가능하게끔 하고자 할때(기술적)(잘 사용하지 않음)
		 * 	- 다형성 적용 가능
		 * 
		 * 	추상 메소드
		 * 	- 미완성된 메소드로 몸통부 {}가 구현되어 있지 않은 메소드를 뜻함.
		 * 	- 자식클래스에서 오버라이딩을 통해 완성됨(강제로 무조건 오버라이딩해야함)
		 * 		=> 오버라이딩 하지 않을 경우 에러발생
		 * 		=> 메소드 사용의 통일성 확보 목적
		 * 		=> 표준화된 틀을 제공할 목적.
		 * 
		 */
	}

}
