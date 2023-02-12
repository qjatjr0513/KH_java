package com.kh.enumBasic;

import java.util.Arrays;

// 1) 기본 사용법
public enum Day1 {
	MONDAY,// static, final 키워드들 붙이지 않았는데 자동으로 들어가있음.
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURSDAY,
	SUNDAY
}
//2) enum안의 각 상수요소마다 값을 더 추가시키고 싶은 경우.
// 	 비슷한 상수필드끼리 매칭시킬때 사용함.
enum Day2 {
	//1) 각 요소 우측에 매칭시킬 값을 추가시킴  
	MONDAY("MON"),
	TUESDAY("TUE"),
	WEDNESDAY("WEN"),
	THURSDAY("THU"),
	FRIDAY("FRI"),
	SATURSDAY("SAT"),
	SUNDAY("SUN");
	
	//2) 필드값 추가(매칭시킬값의 자료형으로)
	private final String shortName;
	
	//3) 생성자 추가
	Day2(String shortName){
		this.shortName = shortName;
	}
	
	//4) getter메서드 작성
	public String shortName() {
		return shortName;
	}
}
// 매핑시킬 값이 여러개인경우.
enum Day3 {
	//1) 각 요소 우측에 매칭시킬 값을 추가시킴  
	MONDAY("MON", 1),
	TUESDAY("TUE", 2),
	WEDNESDAY("WEN", 3),
	THURSDAY("THU", 4),
	FRIDAY("FRI", 5),
	SATURSDAY("SAT", 6),
	SUNDAY("SUN", 7);
	
	//2) 필드값 추가(매칭시킬값의 자료형으로)
	private final String shortName;
	private final int day;
	
	//3) 생성자 추가
	Day3(String shortName, int day){
		this.shortName = shortName;
		this.day = day;
	}
	
	//4) getter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	// 필드 값을 통해 enum 찾는 메서드 추가.
	public static Day3 valueOfShorName(String shortName) {
		Day3 days[] = Day3.values();
		for(int i=0; i< days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
			}
		}
		return null;
//		return Arrays.stream(values()).filter(value -> value.shortName.equals(shortName)).findAny().orElse(null);
	}
	
	public static Day3 valueOfDay(int day) {
		Day3 days[] = Day3.values();
		for(int i=0; i< days.length; i++) {
			if(days[i].day == day) {
				return days[i];
			}
		}
		return null;
	}
	
	
}
// 각 요소마다 함수추가.
enum Day4 {
	//1) 각 요소 우측에 매칭시킬 값을 추가시킴  
	MONDAY("MON", 1){
		//함수 추가 2단계) 추상메서드로 상수에서 오버라이딩
		@Override
		public void printDay() { System.out.println("월요일입니다.");}
	},
	TUESDAY("TUE", 2){
		@Override
		public void printDay() { System.out.println("화요일입니다.");}
	},
	WEDNESDAY("WEN", 3){
		@Override
		public void printDay() { System.out.println("수요일입니다.");}
	},
	THURSDAY("THU", 4){
		@Override
		public void printDay() { System.out.println("목요일입니다.");}
	},
	FRIDAY("FRI", 5){
		@Override
		public void printDay() { System.out.println("금요일입니다.");}
	},
	SATURSDAY("SAT", 6){
		@Override
		public void printDay() { System.out.println("토요일입니다.");}
	},
	SUNDAY("SUN", 7){
		@Override
		public void printDay() { System.out.println("일요일입니다.");}
	};
	// 상수별 함수추가 1단계
	// 상수내부함수를 실행시키기위한 추상메서드 선언.
	public abstract void printDay();
	
	
	//2) 필드값 추가(매칭시킬값의 자료형으로)
	private final String shortName;
	private final int day;
	
	//3) 생성자 추가
	Day4(String shortName, int day){
		this.shortName = shortName;
		this.day = day;
	}
	
	//4) getter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	// 필드 값을 통해 enum 찾는 메서드 추가.
	public static Day4 valueOfShorName(String shortName) {
		Day4 days[] = Day4.values();
		for(int i=0; i< days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
			}
		}
		return null;
//		return Arrays.stream(values()).filter(value -> value.shortName.equals(shortName)).findAny().orElse(null);
	}
	
	public static Day4 valueOfDay(int day) {
		Day4 days[] = Day4.values();
		for(int i=0; i< days.length; i++) {
			if(days[i].day == day) {
				return days[i];
			}
		}
		return null;
	}
	
	public void printDay1() {
		switch(this) {
		case MONDAY : System.out.println("월요일"); break;
		case TUESDAY : System.out.println("화요일"); break;
		case WEDNESDAY : System.out.println("수요일"); break;
		case THURSDAY : System.out.println("목요일"); break;
		case FRIDAY : System.out.println("목요일"); break;
		case SATURSDAY : System.out.println("토요일"); break;
		case SUNDAY : System.out.println("일요일"); break;
		}
	}
	// 위 방법으로 작성하게되는 경우 새로운 상수필드가 추가되면 해당 case문도 수정해줘야함.
}