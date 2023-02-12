package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	//키보드로 값을 입력받아 인적사항을 출력하는 프로그램.
	public void inputTest1() {
		/*
		 * 자바에서 이미 제공하고 있는 java.util.Scanner 클래스.
		 * Scanner 클래스 안에 작성되어 있는 메소드를 호출해서 사용.
		 */
		Scanner sc =  new Scanner(System.in);
		
		//사용자의 인적사항(키, 나이, 이름)입력받기.
		System.out.print("이름을 입력해 주세요 : ");
		//String name = sc.next(); //키보드로부터 받은 값을 문자열로 돌려주는 메소드
		/*
		 * sc.next();는 사용자가 입력한 값중에 공백이 있을경우에 공백 이전까지만 출력을 함. 
		 * ex) 민 경민-> 민
		 * sc.nextLine();은 사용자가 엔터를 입력하기 전까지 대기상태, 공백과 무관하게 엔터전까지의 값을 전달해줌.
		 * 엔터(\n)앞까지의 값을 메모리에 전달하고, 엔터(\n) 값을 지워줌.
		 */
		
		String name = sc.nextLine();
		
		System.out.print("키를 입력해 주세요(xx.x): ");
		double height = sc.nextDouble(); //키보드로부터 받은 값을 double형 변수로 돌려주는 메소드.(사용자가 엔터를 입력하기 전까지 대기)
		
		sc.nextLine(); //버퍼에 남아있던 엔터를 비워주기 위해 실행, nextLine()앞에 nextInt()나 nextDouble()이 사용되면 nextLine()을 한번 써주고 nextLine()사용 
		System.out.print("주소를 입력해주세요 : ");
		String address = sc.nextLine();
		
		System.out.print("나이를 입력해 주세요 :");
		int age = sc.nextInt(); //키보드로부터 받은 값을 int형 변수로 돌려주는 메소드.(사용자가 엔터를 입력하기 전까지 대기)
		
		//00에 사시는 000님의 키는 000.0이고, 나이는 00입니다.
		System.out.println(address+"에 사시는 "+name+"님의 키는 "+height+"이고, 나이는 "+age+" 입니다.");
	}
	public void inputTest2() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 문자열을 뽑을때 => sc.next(),sc.nextLine()
		 * 정수값을 뽑을때 => sc.nextInt(), sc.nextByte(), sc.nextShort(), sc.nextLong
		 * 실수값을 뽑을때 => sc.nextDouble(), sc.nextFloat()
		 * 
		 * 논리값을 뽑을때 => sc.boolean();
		 * 
		 * 문자값 뽑을때 sc.nextChar()(X)없음.!!
		 */
		
		//인적사항 출력하는 프로그램(이름, 성별(M,F), 나이, 키)
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력해 주세요.(M/F): ");
		char gender = sc.nextLine().charAt(0);
		//"apple" 문자열 길이는 5.
		// 01234 인덱스 순서
		// apple에서 4번 인덱스의 문자는? 'e'
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		//이름: 000, 성별: 0, 나이:00, 키:00.0
		System.out.println("이름 : "+name+", 성별 : "+gender+", 나이 : "+age+", 키 : "+height);
		
		String myName = "홍길동";
		System.out.println(myName.charAt(1)); //charAt()메서드는 문자열 뒤에 사용 가능하다.
	}	
	/*
	 * 정리
	 * 1. 콘솔 창(모니터)에 출력하기 위해 : System.out.print[ln]() 메소드 이용
	 * 2. 콘솔 창(키보드)에 입력받기 위해 : Scanner 이용해서(nextLine, next, nextInt, nextDouble .....)
	 * 
	 * > 주의사항!! <
	 * 1)sc.nextxxx() 메소드 뒤에 sc.nextLine()메소드가 와야될 경우
	 * sc.nextLine()메소드를 한번더 써줘서 버퍼에 남아있는 '엔터(\n)'값을 빼주는 과정이 필수.
	 * 2)'문자'값을 입력받아야 할 경우
	 * sc.nextLine() 메소드를 통해 우선 문자열을 입력받고 그 뒤에 .charAt(순번)메소드를 통해 문자 하나 추출.
	 * 
	 * 
	 */
}
