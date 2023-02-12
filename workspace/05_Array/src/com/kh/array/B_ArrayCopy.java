package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	/*
	 * 배열 복사
	 * 1. 얕은 복사 : 배열의 "주소값"을 공유(복사).
	 * 2. 깊은 복사 : 동일한 새로운 배열을 만들어서 실제 내부값들도 복사.
	 */
	
	//얕은 복사실습
	public void method1() {
		
		//원본 배열 셋팅
		int [] origin = {1, 2, 3, 4, 5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		int[] copy = origin;
		System.out.println("\n== 복사본 배열 출력 ==");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n== 복사본 배열 수정후 출력 ==");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		
		System.out.println("\n== 복사본 배열 수정후 출력 ==");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println("\n원본의 주소값 : "+origin.hashCode());
		System.out.println("\n복사본 배열의 주소값 : "+copy.hashCode());
	}
	
	//깊은복사를 하는 4가지 방법
	public void method2() {
		//1. for문을 활용한 방법.
		
		int [] origin = {1,2,3,4,5};
		
		int [] copy = new int[origin.length];
		/*
		 * copy[0] = origin[0]
		 * copy[1] = origin[1]
		 *....
		 * copy[n] = origin[n]
		 */
		for(int i = 0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		copy[2] = 99;
		System.out.println("\n == 변경 후 복사본 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		System.out.println("\n == 변경 후 원본 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println("\n원본의 주솟값 : "+origin.hashCode());
		System.out.println("복사본의 주솟값 : "+copy.hashCode());
	}
	public void method3() {
		
		//2. 새로운 배열을 생성한 후 System.arraycopy 메소드를 활용.
		int[] origin = {1,2,3,4,5};
		
		int [] copy = new int[10];
		// System.arraycopy( 원본 배열명 , 원본 배열의 복사를 시작할 인덱스, 복사본 배열명, 복사본 배열의 복사될 시작 인덱스, 복사할 갯수);
		System.arraycopy(origin, 0, copy, 0, 5); //1 2 3 4 5 0 0 0 0 0
		System.arraycopy(origin, 0, copy, 2, 5); //1번. 0 0 1 2 3 4 5 0 0 0
		System.arraycopy(origin, 0, copy, 1, 3); //2번. 0 1 2 3 0 0 0 0 0 0
		System.arraycopy(origin, 2, copy, 1, 3); //3번. 0 3 4 5 0 0 0 0 0 0
		
		//System.arraycopy(origin, 2, copy, 10, 3); 범위 벗어나서 에러가 발생함 !!!
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
		System.out.println("\n원본 주솟값 : "+origin.hashCode());
		System.out.println("복사본 주솟값 : "+copy.hashCode());
		
	}
	
	public void method4() {
		
		// 3. Arrays 클래스에서 제공하는 copyof라는 메서드를 이용해서 복사를 함.
		int [] origin = {1,2,3,4,5};
		
		// 복사본 배열 = Arrays.copyof(원본 배열 , 복사할 갯수);
		int [] copy = Arrays.copyOf(origin, 3);
		
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		/*
		 * 번외
		 * [참고]
		 * 임포트 안해도 쓸 수 있음. java.lang패키지 안에 존재하는 클래스는 임포트 하지 않아도 사용가능!
		 * java.lang.Math
		 * java.lang.System
		 * java.lang.String
		 * 
		 * 임포트함.
		 * java.util.Arays
		 */
		
		/*
		 * 2. System.arraycopy : 몇번 인덱스부터 몇개를 어느 위치의 인덱스에 복사할건지 다 지정 가능함.
		 * 
		 * 3. Arrays.copyof : 무조건 원본 배열의 0번 인덱스부터 내가 제시한 갯수만큼 복사 진행됨.
		 * 					  내가 제시한 길이가 원본 배열보다 크다면 나머지는 0으로 채워서 복사해줌.
		 */
	}
	public void method5() {
		// 4. clone 메서드를 사용하여 복사.
		
		int[] origin = {4,1,3,2,5};
		
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone(); // 인덱스 지정할 수 없음. 복사할 갯수도 지정할 수 없습니다.
		
		
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		
		System.out.println("원본 주소값 : "+origin.hashCode());
		System.out.println("복사본 주소값 : "+copy.hashCode());
		
		//번외(1. 정렬하는방법, 2. 배열 내용 출력하는 방법.)
		Arrays.sort(copy);
		// Arrays.sort()
		//배열 정렬하는법.!
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		//배열에 담긴 값을 보여주는 메서드
		System.out.println("\n"+Arrays.toString(copy));
	}
}
