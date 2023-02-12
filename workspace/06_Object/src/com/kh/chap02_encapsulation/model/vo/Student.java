package com.kh.chap02_encapsulation.model.vo;

public class Student {
	/*
	 * 7. 캡슐화 과정을 통해 완벽한 클래스의 형태를 갖추게 하자.
	 * 캡슐화란 ? 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나로
	 * 클래스에서의 가장 중요한 목적인 "데이터의 접근제한"을 원칙으로
	 * 외부로부터 "데이터의 접근을 막고"
	 * 대신에 "데이터를 간접적으로나마 처리(값을 대입, 갑을 변환)"할 메소드를 클래스 내부에 작성해서 관리하는 방식
	 * 
	 * 캡슐화를 하지 않으면 ? 외부로부터 직접 접근이 가능하기 때문에 함부로 값이 변질되거나 조회를 막지 못하는 문제 발생.
	 * 
	 * 	1) 정보은닉 : private
	 * 				필드들을 외부로부터 직접 접근을 막기 위해 public 대신에 private 접근제한자를 사용.
	 * 				예) 학생들이 본인의 성적을 함부로 바꿀 수 없게, 다른 학생의 성적이 함부로 조회되지 않도록.
	 * 
	 * 	2) setter / getter 메소드
	 * 		간접적으로나마 접근해서 값을 담거나(변경하거나) 그 값을 가져올 수 있는 메소드가 setter / getter 메소드임.
	 * 		예) 선생님은 학생의 성적을 기록하거나, 조회할 수 있는 권한이 있다.
	 * 
	 */
	
	//필드부
	//[표현법] 접근제한자 자료형 필드명;
	/*
	 * [필드부]
	 * 필드 == 멤버변수 == 인스턴스변수
	 * 
	 */
	private String name;
	private int age;
	private double height;
	
	
	
	//메서드부
	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * [표현법]
	 * 접근제한자 반환형 메소드명(매개변수 => 생략 가능함.){
	 * 		//기능구현
	 * }
	 * 
	 * 
	 */
	
	//setter메소드
	
	//이 메소드에 접근 가능하도록 public 접근제한자를 사용함.
	//이름값을 기록 및 수정할 수 있는 기능의 메소드(객체의 name필드값에 대입하는 용도)
	public void setName(String name) {
		//매개변수 : 해당 이  메소드 호출 시 전달되는 값을 받아주기 위한 변수 선언문(이 메소드에서만 사용가능함.)
		//만약 필드명과 매개변수명이 동일하다면 메소드{}내에 해당변수명 제시시 해당 영역에서 만들어진 변수가 우선순위가 높음.
		//따라서 두 값을 구분하려면 this라는 키워드를 사용해야함.
		this.name = name;//this.에는 해당 객체의 주소값이 담겨있음!
	}
	
	//나이값을 기록 및 수정할 수 이쓴ㄴ 기능의 메서드 (set메서드)
	public void setAge(int age) {
		
		this.age = age;
	}
	// 키값을 기록 및 수정할 수 있는 기능의 메서드 (set메서드)
	public void setHeight(double height) {
		
		this.height = height;
	}
	
	//getter 
	//데이터를 반환해주는 기능의 메소드.
	public String getName() {
		return name; // return 결과값; -> 결과값을 돌려주겠다.
		//return은 결과값을 반환한 후 메서드 종료시킴.
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	
	public void method1() {
		
		return;
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 돌려주는 용도의 메소드.
	public String info() {
		// xxx님의 나이는 xx살이고, 키는 xxx.xcm 입니다.
		return name+ "님의 나이는 "+age+"살이고 , 키는 "+height+"cm입니다.";
	}
	
	
	
	
	
}
