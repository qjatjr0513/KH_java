package com.kh.enumBasic;

public class Enum {
	/*
	 *  Enum -> Enumeration(열거)의 약자형
	 *  기존에 저희가 상수를 정의했던 방법중에 final static과 같은 
	 *  문자열 혹은 숫자들을 나타내는 기본자료형값을 Enum을 통해서 표현이 가능
	 * 
	 */
	public static final String MONDAY = "MON";
	public static final String TUESDAY = "TUE";
	public static final String WEDNESDAY = "WEN";
	public static final String THURSDAY = "THU";
	public static final String FRIDAY = "FRI";
	public static final String SATURSDAY = "SAT";
	public static final String SUNDAY = "SUN";
	/*
	 * 위처럼 상수들 정의했을 때 단점
	 * 1) 가독성 떨어짐
	 * 2) 오타가 났을때 원하는 결과가 나오지 않을수 있음.
	 * 3) monday라는 문자열을 저장하고 싶은 경우 새롭게 상수 선언해줘야함.
	 * 4) 위 상수필드를 순회하면서 값을 가져올수 없음.
	 */
	
	enum EnumTest{
		MONDAY,// static, final 키워드들 붙이지 않았는데 자동으로 들어가있음.
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURSDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		//상수에 담긴값 생성하는 방법
		System.out.println(EnumTest.MONDAY);
		System.out.println(EnumTest.MONDAY.name());
		
		//enum으로 만들어둔 클래스는 임포트없이 사용가능하다.
		System.out.println(Day1.MONDAY);
		
		//enum 필드 안에 담긴값을 반환받기.
		System.out.println(Day2.MONDAY.shortName());
		System.out.println(Day3.SUNDAY.day());
		
		// enum 사용가능한 메서드들.
		//1) valueOf -> 일치하는 이름의 enum값을 가져옴.
		System.out.println(Day3.valueOf("MONDAY"));
		//2) values() : 열거형 상수들을 배열형태로 리턴.
		System.out.println("===================================================");
		for(Day3 day : Day3.values()) {
			System.out.println(day);
		}
		//3) 내가 작성한 메서드들.
		System.out.println(Day3.valueOfShorName("MON"));
		System.out.println(Day3.valueOfDay(3));
		
		Day4.MONDAY.printDay();
		
		//상수 사용 이용
		/*
		 * 1) 코드가 간결해져서 가독성이 좋음.
		 * 2) 데이터그룹 관리 및 연관관계 표현에 용이함.
		 * 	  ex) 하나의 요일에 해당하는 데이터를(mon, monday, 1, 월요일)하나의 상수필드로 합칠수 있다.
		 * 	  ex) 휴학유무 (y 1 true, n 0 false)
		 * 3) 상수별로 다른 메서드를 사용해야할때 쉽게 구현이 가능하다.
		 */
	}
	
	
	
	
	
	
	
	
	

}
