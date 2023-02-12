package com.kh.lamda;

public class Lamda {
	/*
	 * 람다식이란? 익명함수(제목이 없는 함수)처럼 구동됨. java8이후부터 사용가능
	 * 실제로는 익명구현객체(이름없는클래스)를 생성하여 내부에 내가 작성한 코드를 실행시키는 방식으로 구동됨.
	 * 
	 * 람다식 장점: 표현이 간결해지고, 가독성 좋음, 내부적으로 람다식을 활용한 좋은 메서드가 많다.
	 * 
	 * [표현식]
	 * 변수 변수명 = (매개변수) -> {구현코드};
	 */
	
	//람다식 기본활용
	//1) 매개변수가 없고 리턴값도 없는 람다식
	@FunctionalInterface // 내부적으로 1개의 미구현함수를 지닌 인터페이스 (람다식 사용할인터페이스)
	public interface lamda{
		void test();
	}
	//2) 매개변수가 있고 리턴값은 없는 람다식
	@FunctionalInterface
	public interface lamda2{
		void test2(int number);
	}
	//3) 매개변수가 없고 리턴값은 있는 람다식
	@FunctionalInterface
	public interface lamda3{
		String test3();
	}
	//4) 매개변수도 있고 리턴값도 있는람다식
	@FunctionalInterface
	public interface lamda4{
		int test(int a);
	}
	
	public static void main(String[] args) {
		lamda l;
		l = () ->{
			System.out.println("첫번째 람다식");
		};
		l.test();
		
		lamda2 l2 = (a) -> {
			System.out.println("안녕하세요"+a);
		};
		l2.test2(3);
		
		lamda3 l3 = () -> {
			return "반환형 있음";
		};
		l3 = () -> "너 사탄들렸어?";
		
		System.out.println(l3.test3());
		lamda4 l4 = a -> a*a; // 매개변수가 하나면 () 생략가능, + 코드가 한줄이면 중괄호 생략가능
		// + 단순return문이면 return 생략가능
		
		System.out.println(l4.test(10));
	}
	

}
