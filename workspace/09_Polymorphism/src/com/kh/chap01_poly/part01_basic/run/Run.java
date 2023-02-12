package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {
		
		// 명심할 사항 '=' 대입연산자 기준 왼쪽과 오른쪽은 동일한 자료형이어야함.
		
		// 1. 부모타입 레퍼런스로 부모객체를 다루는 경우.
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우.");
		Parent p1 = new Parent();
		p1.printParent();
		// p1은 현재 자식객체로 접근이 불가능함.
		
		// 2. 자식타입 레퍼런스로 자식 객체를 다루는 경우
		System.out.println("2. 자식타입 레퍼런스로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		// 기본생성자에 슈퍼생성자를 호출하는 구문 항상 있음.
		// 따라서 부모 객체 사용 가능함.
		c1.printChild1();
		
		c1.printParent();//((Parent) c1).printParent();
		// 자식 클래스에서 부모클래스로 자동 형변환됨.
		
		// 3. 부모타입 레퍼런스로 자식 객체를 다루는 경우(다형성 적용)
		System.out.println("3. 부모타입 레퍼런스로 자식 객체를 다루는 경우(다형성 적용)");
		Parent p2 = /*(Parent)*/ new Child1(); // 자동형변환
		// 양쪽의 자료형이 다른데도 불구하고 오류발생하지 않는다.
		// Parent형으로 자동형변환되고 있음.
		// "상속 구조"에서의 클래스간의 형변환이 가능함.
		
		//int a = 10;
		//double b = a; //자동형변환
		
		p2.printParent();// Parent 내부에 있는 메서드 당연히 접근가능.
		((Child1) p2).printChild1();
		//원래는 접근이 불가능하나, 강제형변환 시켜서 접근이 가능해짐.
		
		/*
		 * 클래스 간에 형변환은 상속 구조에서만 가능함.
		 * 
		 * 1. UpCasting
		 * 	  자식타입 -> 부모타입으로 형변환
		 * 	  생략가능(자동형변환되기때문에)
		 * 	  ex) 자식객체.부모메서드();
		 * 	  부모변수 = new 자식객체
		 * 
		 * 2. DownCasting
		 * 	  부모 타입 => 자식타입으로 형변환
		 *    생략 불가능(강제형변환 시켜줘야함)
		 * 	  ex) ((자식)부모).자식메서드();
		 * 
		 */
		
		//다형성을 쓰는 이유
		// - 부모타입으로부터 파생된 여러가지 타입의 자식 객체를
		// 하나의 부모클래스로 다룰수 있음!!
		
		// 다형성 배우기전.
		Child1 [] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,2);
		arr1[1] = new Child1(3,4,5);
		
		Child2 [] arr2 = new Child2[2];
		arr2[0] = new Child2(3,5,7);
		arr2[1] = new Child2(7,8,6);
		
		// 다형성을 적용하게 된다면 부모타입 레퍼런스로 다양한 자식객체를 받을 수 있음.
		System.out.println("========== 다형성 적용 후 ===========");
		Parent []arr = new Parent[4];
		arr[0] = new Child1(1,2,3);
		arr[1] = new Child2(5,5,5);
		arr[2] = new Child1(7,8,5);
		arr[3] = new Child2(6,6,6);
		//하나의 부모타입으로 여러 자식객체들을 받을 수 있음. 즉 생산성 증대, 유지보수 증가.
		
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child1)arr[2]).printChild1();
		((Child2)arr[3]).printChild2();
		System.out.println("=========================");
		
		// 반복문 활용..
		for(int i = 0; i<arr.length; i++) {
			//특정 클래스만 사용해야하는 경우.																																														
			//((Child1)arr[0]).printChild1();
			
			//instanceof 연산자 -> true / false
			// 현재 레퍼런스가 실제로 어떤 클래스 타입을 참조하고 있는지 확인할때 사용.
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				arr[i].print();			
				/*
				 * 동적 바인딩 : 프로그램이 실행되기전에 자동으로 컴파일되면서 정적바인딩(레퍼런스타입의 메소드를 가리킴)
				 * 단, 실질적으로 참조하고 있는 자식클래스에 해당 메소드가 오버라이딩 되어있다면
				 * 프로그램 실행시 동적으로 그 자식클래스의 오버라이딩된 메소드를 찾아가서 실행. 
				 * 
				 * 
				 */
			}
			
		}
		
		
	}

}
