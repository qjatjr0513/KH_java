package com.kh.variable;

public class A_Variable {
	//변수의 필요성 알아보기
	
	//시급과 근무시간, 근무일수를 곱해서 월급을 계산하는 프로그램
	public void printVariable() {
		
		//변수 사용전
		System.out.println("시급: 9180");
		System.out.println("근무시간: 6");
		System.out.println("근무일수: 20");
		
		//월급 = 시급 x 근무시간 x 근무일수
		//민경민의 월급은 00000000원 형식으로 출력.
		//자바에서 곱셈은 *를 사용합니다.
		//
		System.out.println("나비스의 월급은 "+(18000*7*20)+"원 입니다.");
		System.out.println("카리나의 월급은"+(18000*7*20)+"원 입니다.");
		System.out.println("윈터의 월급은"+(18000*7*20)+"원 입니다.");
		System.out.println("지젤의 월급은"+(18000*7*20)+"원 입니다.");
		System.out.println("닝닝의 월급은"+(18000*7*20)+"원 입니다.");
		System.out.println();
		//변수 사용후
		int pay = 18000;
		int time = 7;
		int day = 20;
		
		System.out.println("나비스의 월급은"+(pay * time * day)+"원 입니다.");
		System.out.println("카리나의 월급은"+(pay * time * day)+"원 입니다.");
		System.out.println("윈터의 월급은"+(pay * time * day)+"원 입니다.");
		System.out.println("지젤의 월급은"+(pay * time * day)+"원 입니다.");
		System.out.println("닝닝의 월급은"+(pay * time * day)+"원 입니다.");
		/*
		 * 변수를 사용하는 이유.
		 * 1.변수는 우선적으로 값에 의미를 부여할 목적으로 사용(가독성이 좋음)
		 * 2. 단 한번 값으르 기록해 두고 필요할때마자 계속 사용할 목적으로 사용(재사용성)
		 * 3. 유지보수를 쉽게 할 수 있다.
		 */
	}
	//변수의 선언
	public void declareVariable() {
		/*
		 * 변수의 선언(값을 기록하기 위한 변수를 메모리 공간에 확보해 두겠다 = 박스를 만들겠다)
		 * [표현법] 자료형 변수이름;
		 * 
		 * 자료형: 어떤값을 담아낼지, 어떤 크기의 값을 담아낼지에 따라 변수의 크기 및 모양을 지정하는 부분
		 * 변수명: 변수의 이름을 정하는 부분.
		 * 
		 * 주의할점!
		 * 1. 변수명은 소문자로 시작하게끔 이름 지어줄것.(단, 낙타등표기법 지키기)
		 * ex) String userName;(O)
		 * 	   String username;(X)
		 *     String user_name;(언더스코어 표기법)			
		 * 2. 같은 영역({})안에서는 동일한 변수명으로 선언 불가.
		 * 3. 해당영역에 선언된 변수는 해당영역안에서만 사용 가능(다른 일반메소드에서는 사용 불가)
		 */
		
		//1.논리형 자료형(true, false)
		boolean isTrue; //1byte;
	
		//2.숫자형 자료형(byte, short, int, long)
		byte bNum; //1byte;
		short sNum; //2byte;
		int iNum; //4byte;
		long lNum; //8byte;
		
		//3. 실수형 자료형(float, double)
		float fNum; // 4byte;
		double dNum; //8byte;
		
		//4. 문자형 자료형
		char ch; //2byte;
		
		//5.문자열 (참조자료형) -> String은 따로 배울예정
		String str;
		
		/*
		 * 변수에 값을 대입하는 방법.
		 * [표현법] 변수명 = 값;
		 */
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; //long자료형임을 알려주기 위해 소문자, 대문자 l, L을 표기해준다.(L은 권장)
		
		fNum = 4.0f;
		dNum = 4.0d;
		
		ch = 'A';
		str = "ABC";
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	//변수의 초기화
	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 = 값(리터럴);
		 * 
		 * 리터럴: 값 그 자체
		 */
		//1. 논리 자료형
		boolean isTrue = true;
		
		//2. 정수 자료형
		byte bNum = 1;
		short sNum = 20;
		int iNum = 40;
		long lNum = 100L;
		
		//3. 실수형 자료형
		float fNum = 4.313f; // 소수점 7자리까지 커버가능.
		double dNum = 5.65432123;//소수점 15자리 까지 커버가능.
		
		//4. 문자 자료형
		char ch = '홍';
		
		//5. 문자열 자료형(참조 자료형)
		String str = "홍길동";
		
		System.out.println("isTrue : "+ isTrue);
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("iNum : "+iNum);
		System.out.println("lNum : "+lNum);
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		System.out.println("ch : "+ch);
		System.out.println("str : "+str);
		
		int bigInt = 999_999_999;
		System.out.println("bigInt :"+bigInt);
		
	}
	//상수표기법.
	public void constant() {
		
		int age = 20;
		System.out.println("나이는 : "+age);
		
		age = 25;
		System.out.println("5살 더먹은 나이는 : "+age);
		
		final int AGE = 25; //상수는 대문자로 표시하는게 관례.
		//AGE = 26; 에러! 상수는 변경 불가.
		System.out.println("내 나이는! : "+AGE);
	}
}
