package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/* 
	 * 변수 : 하나의 공간에 하나의 값만 담을 수 있음.
	 * ex) int i = 0;
	 * 
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있음.("같은 자료형의 값"으로만 담을 수 있다.)
	 * 		 정확히 예기하자면 배열의 각 인덱스 자리에 실제 값이 담김(인덱스는 0부터 시작.)
	 * ex) int [] a = new int[3]; // int형의 자료가 들어갈 수 있는 방 3개를 만든다.
	 * 							  // 방 [0] , [1], [2]를 만드는것.
	 * 							  // 인덱스는 항상 0부터 시작한다.(중요)
	 * 							  // 배열의 크기 = 3, 마지막 인덱스 = 2
	 * 							  // 크기 = n, 마지막 인덱스 = n-1
	 * 
	 * 		a[0] = 10;
	 * 		a[1] = 15;
	 * 		a[2] = 40;
	 * 
	 */
	
	public void method1() {
		//배열을 써야하는 이유.
		
		//0, 1, 2, 3, 4
//		int num1 = 0;
//		int num2 = 1;
//		int num3 = 2;
//		int num4 = 3;
//		int num5 = 4;
//		
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		
//		int sum = num1+num2+num3+num4+num5;
		
		/*
		 * 1. 배열 선언
		 * [표현법]
		 * 자료형 배열명 [];
		 * 자료형 [] 배열명;
		 */
		int a;
		int arr [];
		int [] arr2;
		
		/*
		 * 2. 배열 할당.
		 * 이 배열에 몇개의 값들을 보관할건지 크기를 지정해주는 과정.
		 * 지정한 갯수만큼 값이 들어가는 "방"이 만들어짐
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 * 
		 */
		arr = new int[5];
		
		// 배열 선언과 동시에 할당.
		/*
		 * [표현법]
		 * 자료형 [] 배열명 = new 자료형 [방크기];
		 */
		int [] arr3 = new int[5];
		
		//값을 할당하는 방법.
//		arr3[0] = 0;
//		arr3[1] = 1;
//		arr3[2] = 2;
//		arr3[3] = 3;
//		arr3[4] = 4;
		
		//반복문으로 배열에 값을 할당.
		for(int i = 0; i<5; i++) {
			arr3[i] = i;
		}
		//반복문으로 배열에 담긴값 출력.
		for(int i=0; i<5; i++) {
			//System.out.println(arr3[i]);
			System.out.printf("%d인덱스의 값 : %d\n", i, arr3[i]);
		}
		System.out.println(arr3);
	}
	
	public void method2() {
		int a = 10;
		
		int [] iArr = new int [5];
		
		//System.out.println(iArr[4]);
		System.out.println(iArr);//
		//10진수 => 우리가 자주쓰는 숫자.
		System.out.println("iArr의 주솟값(10진수로)"+iArr.hashCode());
		
		double [] dArr = new double[3];
		System.out.println(dArr);
		System.out.println("dArr의 주솟값(10진수로) : "+dArr.hashCode());
		
		/*
		 * 기본자료형 : (char, float, byte, long, short, int, boolean, double)
		 * => 실제 값(리터럴)을 바로 담을 수 있는 변수 => 일반 변수.
		 * 
		 * 그외 자료형 : (char[], float[], byte[], long[], short[], int[],..., String, Scanner)
		 * => 주소 값을 가지고 있는 변수. => 참조변수 (레퍼런스 변수)
		 *  
		 */
	}
	
	public void method3() {
		
		int[] iArr = new int[3];
		double[] dArr = new double[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println(iArr[i]);
		}
		for(int i =0; i<3; i++) {
			System.out.println(dArr[i]);
		}
		//배열의 크기
		//배열명.length
		
		System.out.println("iArr의 크기는 ? "+iArr.length);
		System.out.println("dArr의 크기는 ? "+dArr.length);
		
		for(int i = 0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int i = 0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
	
	public void method4() {
		int result = 0; //int형 자료 기본값 0
		
		int [] iArr = null;
		
		System.out.println(iArr); //null
		//System.out.println(iArr.length);
		if(iArr != null) { // null 체크하는 방법.
			System.out.println(iArr.hashCode());			
		}
		
		/*
		 * 기본값이 null인 변수를 가지고 메소드를 호출하거나 특정 어딘가에 접근하고자 하면 발생.
		 * ex) iArr.length
		 * 	   iArr.hashCode();
		 * 
		 * 
		 * 
		 * 
		 */
	}
	
	public void method5() {
		
		int [] arr = new int[5];
		
		/*
		 * arr[0] = 2
		 * arr[1] = 4
		 * arr[2] = 6
		 * arr[3] = 8
		 * arr[4] = 10
		 */
		
		for(int i = 1; i<= arr.length; i++) {
			arr[i-1] = (2*i);
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//arr[6] = 12; // ArrayIndexOutOfBoundsException발생!(범위에서 벗어난 인덱스)
		/*
		 * 배열의 단점
		 * 한번 지정한 크기는 변경이 불가능.
		 * => 배열의 크기를 변경하고자 한다면 어쩔 수 없이 배열을 새로 선언해야한다.
		 */
		System.out.println("\n변경전 arr의 해시코드 값 "+ arr.hashCode());
		
		arr = new int[7];
		System.out.println("arr의 해시코드 값"+arr.hashCode());
		/*
		 * new 연산자 선언시 항상 고유한 주소값이 부여, 기존에 생성 된 주소와 절대 안겹침.
		 * 기존에 참고하고 있던 연결이 끊기고 새로운 곳을 참조하게 되는 경우
		 * 연결이 끊어진 기존의 배열은 Heap영역에 두둥실 떠다님
		 * 일정시간이 지나면 "가비지컬렉터(GC)"가 자동으로 삭제시켜줌. : 자동 메모리 관리
		 * 
		 * 현재 연결되어있는 고리를 끊고자 한다면 ?
		 */
		
		arr = null; //아무것도 존재하지 않음
		
		System.out.println(arr);
	}
	
	public void method6() {
		// 선언과 동시에 할당
		int [] arr = new int[4];
		//반복문으로 대입
		
		// 선언과 동시에 할당하고 초기화까지 하는 방법.
		// 방법 1.
		int [] arr1 = new int [] {0, 1, 2, 3, 4};
		
		//방법 2. 
		int[] arr2 = { 0, 1, 2, 3, 4 };
		//.eqauls()
		System.out.println(arr1 == arr2); //주솟값 간의 동등 비교연산 수행됨.
	}
	
	public void method7() {
		//1. 크기 10짜리 정수배열 선언.
		
		//2. 반복문 활용해서 0번 인덱스부터 ~ 마지막 인덱스까지 순차적으로 접근하면서 값대입
		//값 -> 랜덤값(1~100)
		
		//3. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스까지 배열에 담긴 값을 출력
		// 출력예시)  arr[x] : xx
		int [] arr = new int[10]; 
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100 +1);
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 배열의 사이즈 값을 입력 받은 후, 해당 크기만큼 배열 생성.
		System.out.print("배열의 사이즈 : ");
		int size = sc.nextInt();
		
		String [] arr = new String [size];
		
		sc.nextLine();
		// 2. 반복문을 활용해서 사용자에게 과일명을 입력받아 그 값을 인덱스 자리에 대입	
		for(int i = 0; i < arr.length; i++) {
			System.out.print("과일명 : ");
			arr[i] = sc.nextLine();
		}
		// 3. 과일명을 한줄로 스페이스바로 공간을 나누어 출력.
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}
	}
	
	public void method9() {
		// 1. 사용자에게 문자열 입력 받고.
		
		// 2. char 배열 생성해두기 (배열 크기 == 문자열의 길이만큼)
		
		// 3. 문자열에서 각 인덱스별로 문자를 뽑아서 char배열의 각 인덱스에 담기
		
		// 4. char 배열의 각 인덱스에 잘 담겨있는지 반복문 활용해서 출력해보기.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int strLength  = str.length();
		char []arr = new char[strLength];
		
		for(int i =0;  i<arr.length; i++) {
			arr[i]= str.charAt(i);
		}
		for(int i =0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %c\n", i, arr[i]);
		}
		
	}
	
	public void method10(){
		// 1. 크기 10짜리 정수배열 선언.
		int []arr = new int[10];
		// 2. 반복문 활용해서 0번 인덱스부터 ~ 마지막 인덱스까지 순차적으로 접근하면서 값대입
		// 값 -> 랜덤값(1~100)
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] =  (int)(Math.random()*100+1);
		}
		// 3. 반복문 활용해서 0번 인덱스 ~ 마지막 인덱스까지 배열에 담긴 값을 출력과 동시에 
		//짝수인 값들만 더하고, 마지막에 출력
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d\n",i,arr[i]); // 출력예시) arr[x] : xx
			if(arr[i]%2 ==0) {
				sum += arr[i];
			}
			//4. 짝수들의 총합 : xx
		}
		System.out.println("짝수들의 총합 : "+sum);
		
		
		
	}
}
