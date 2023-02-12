package com.kh.variable;

public class D_Printf {
	public void printfTest() {
		/*
		 * System.out.println(출력하고자하는값) => 값출력하고 줄바꿈을 넣어줌
		 * System.out.print(출력하고자하는값) => 값출력하고 끝.(줄바꿈 x)
		 * 
		 * System.out.printf("출력하고자 하는 형식", 변수, 변수 ...)(줄바꿈 x)
		 * => f format(형식)을 의미
		 * => 형식에 맞춰서 내용 출력하고 줄바꿈하지 않음.
		 * => 문자열 안에 값()이 들어갈 공간을 형식으로 확보를 해줘야한다.
		 * 
		 * 형식
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열
		 * 
		 */
		
		//정수 테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		//iNum1 : xx , iNum2 : xx
		System.out.println("iNum1 : "+iNum1+" , Inum2 : "+iNum2);
		System.out.printf("iNum1 : %d , iNum2 : %d\n", iNum1, iNum2);

		//10 + 20 = 30
		System.out.println(iNum1+" + "+iNum2+" = "+(iNum1+iNum2));
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, (iNum1+iNum2));
		
		//Lctrl + z 누르면 작성했던 내용이 롤백됨.
		//Lctrl +y 롤백되었던 내용이 원상복귀.
		//Lctrl +shift + c : 한번에 여러줄 주석
		System.out.printf("%5d %-5d\n",iNum1, iNum2);
		
		//실수테스트 
		double dNum = 1.23456789; 
		System.out.printf("dNum : %f\n", dNum);
		
		System.out.printf("dNum : %.1f\n", dNum); //소수점 첫번째자리수까지 표현
		
		//문자와 문자열 테스트.
		char ch = 'a';
		String str = "Hello";
		
		//출력하고자하는 형식 a Hello
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%C %S\n", ch, str);
		
		System.out.printf("%d%n 할인중!\n", 20);
		
		System.out.printf("%15.5f\n", 500.1234);
	}
}
