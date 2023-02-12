package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {

	// 이 차원 배열 : 일차원 배열을 여러개로 묶은것.
	
	public void method1() {
		// 일차원 배열 선언
		//int[] arr1;
		//int arr2[];

		/*
		 * 이차원 배열 선언 [표현법] 
		 * 1) 자료형 배열명[][]; 
		 * 2) 자료형 [][] 배열명; 
		 * 3) 자료형 [] 배열명 [];
		 */

		int arr1[][];
		int[][] arr2;
		int[] arr3[];
		
		/*
		 * 2. 이차원 배열 할당(크기지정)
		 * 배열명 = new 자료형[행][열]
		 *
		 */
		arr3 = new int [2][3];
		
		int[][] arr4 = new int [1][2];
		
		System.out.println(arr3.length);
		System.out.println(arr3[0][1]);
		System.out.println(arr3[0].length);
		
		/*
		 * 출력(arr3[0][0])
		 * 출력(arr3[0][1])
		 * 출력(arr3[0][2])
		 * 
		 * 출력(arr3[1][0])
		 * 출력(arr3[1][1])
		 * 출력(arr3[1][2])
		 */
		
		for(int i = 0; i<2;i++) {
			for(int j = 0; j<3; j++) {
				System.out.println("i = "+i+", j = "+arr3[i][j]);
			}
		}
	}
	public void method2() {
		 //순서대로 1, 2, 3, 4, 5 ...15 까지 값을 넣을겁니다.
		//틀
		int [][] arr = new int [3][5];
		//출력 예시 arr[x][x] = x
		int num = 0;
		for(int i = 0; i< arr.length;i++) {
			for(int j = 0; j< arr[i].length; j++) {
				arr[i][j] = ++num ;
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}	
		}
	}
	public void method3() {
		//일차원 배열 선언과 동시에 초기화
		int[] iArr = {1, 2, 3, 4, 5};
		
		// [3][5]
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
			}
		}
	}
	
	public void method4() {
		
		/*
		 * 가변 배열
		 * 행의 크기는 정해져 있으나 각각의 행별 열의 갯수가 정해지지 않은 형태
		 * 이차원 배열 == 일차원 배열을 여러개 묶은 형태.
		 * 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없다!.
		 * 행 크기는 생랼이 불가, 반드시 지정해야 하지만
		 * 열크기는 생략이 가능하다. 각행의 열의 길이가 변경이 가능하다.
		 */
		
		int[][] arr = new int[3][];
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr.length);
		//System.out.println(arr[0].length);
		
		arr[0] = new int[2];
		arr[1] = new int [3];
		arr[2] = new int [4];
		
		/*
		 * 1 2 
		 * 3 4 5
		 * 6 7 8 9
		 * 
		 * 
		 * 
		 */
		int value = 1;
		for(int i = 0;i< arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] = %d\n",i,j, arr[i][j]);
			}
		}
	}
	public void method5() {
		//char [][] 가변 배열 생성
		char [][] arr = new char[3][];
		
		/*
		 * a b c
		 * d e 
		 * f g h i
		 */
		
		//char <-> int 자동 형변환 가능.
		//'A' == 65
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[4];
		
		char value = 'a';
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("arr[%d][%d] = %c\n",i,j, arr[i][j]);
			}
		}
	}
	
	public void method6() {
		//int형 2차원 배열을 만들어서
		//0번행에는 국어점수를 3개 입력 받고, 
		//1번행에는 영어점수를 3개 입력 받은 후
		// 각각 반복을 활용해서 출력
		//입력예시 : xx점수를 입력하세요 :
		//출력예시 : xx점수를 : xx xx xx
		
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[2][3];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(i==0) {
					System.out.print("국어점수를 입력하세요 : ");
				}else {
					System.out.print("영어점수를 입력하세요 : ");
				}
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("국어점수 : ");
				
			}else {
				System.out.print("영어점수 : ");
			}
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
