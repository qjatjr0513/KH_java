package com.kh.practice.dimension;

import java.util.Scanner;

public class DiemensionPractice {
	
	public void practice1() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
//		ex.
//		(0, 0)(0, 1)(0, 2)
//		(1, 0)(1, 1)(1, 2)
//		(2, 0)(2, 1)(2, 2)

		String [][]arr = new String[3][3];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+","+j+")";
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		
		int [][]arr = new int[4][4];
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public void practice3() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		
		int[][]arr = new int [4][4];
		int num = 16;
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public void practice4() {
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요.
		int [][]arr =new int[4][4];
	
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				
				// 행들의 합
				arr[i][arr[i].length - 1] += arr[i][j];
				// 열들의 합
				arr[arr.length - 1][j] += arr[i][j];

				// 가로세로합
				arr[arr.length - 1][arr[i].length - 1] += arr[i][j] * 2;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr[i].length; j++) {
	            System.out.print(arr[j][i] + " ");
	         }
	         System.out.println();
	      }
	}
	
	public void practice5() {
		//(int) (Math.random()*26 + 65)
		//A~Z
		//->26개
		//65 <= 랜덤한값. < 91
		Scanner sc = new Scanner(System.in);
		int row = 0;
		int column = 0;
		while(true) {
			System.out.print("행크기 : ");
			row = sc.nextInt();
			if(!(row >= 1 && row<=10)) {
				System.out.println("반드시 1 ~ 10사이의 정수를 입력해야 합니다.");
				continue; //while값의 위쪽으로 가서 계속 입력을 받음
			}
			break; //행의 값을 제대로 입력했다면 반복문 벗어남
		}
		
		while(true) {
			System.out.print("열크기 : ");
			column = sc.nextInt();
			if(!(column >= 1 && column<=10)) {
				System.out.println("반드시 1 ~ 10사이의 정수를 입력해야 합니다.");
				continue;
			}
			break;
		}
		
		char[][] cArr = new char[row][column];
		for(int i = 0; i<cArr.length; i++) {
			for(int j = 0; j<cArr[i].length; j++) {
				//0 0, 0 1, 1 0, 1 1, 2 0, 2 1 
				cArr[i][j] = (char)((int) (Math.random()*26 + 65));
			}
		}
		
		for(int i = 0; i<cArr.length; i++) {
			for(int j = 0; j<cArr[i].length; j++) {
				System.out.print(cArr[i][j] +" ");
			}
			System.out.println();
		}
	}
	public void practice6() {
	      
	      String[][] strArr = { 	{"이", "까", "왔", "앞", "힘"},
	                        		{"차", "지", "습", "으", "냅"}, 
	                        		{"원", "열", "니", "로", "시"}, 
	                        		{"배", "심", "다", "좀", "다"}, 
	                        		{"열", "히", "! ", "더", "!! "}};
	      
	      //(0 , 0) , (1 , 0) , (2 , 0) , (3 , 0) , (4 , 0)
	      //(0 , 1) , (1 , 1) , (2 , 1) , (3 , 1) , (4 , 1)
	      for(int i = 0; i<strArr.length; i++) {
	    	  for(int j = 0; j<strArr[i].length; j++) {
	    		  System.out.print(strArr[i][j]+" ");
	    	  }
	    	  System.out.println();
	      }
	      

	   }
	
		public void practice9() {
			String[] sArr = { "강건강", "남나나", "도대남", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

			String[][] sArr1 = new String[3][2];
			String[][] sArr2 = new String[3][2];

			for (int i = 0; i < sArr1.length; i++) { // 0 1 2
				for (int j = 0; j < sArr1[i].length; j++) {// 0 1
					sArr1[i][j] = sArr[j + (i * 2)]; // 조건문이 동일하기 때문에 한줄로 표현
//	    		  if(j ==0) {
//	    			  sArr1[i][j] = sArr[(i*2)];
//	    		  }else {
//	    			  sArr1[i][j] = sArr[(j+(i*2))];
//	    		  } 

				}
			}
			for (int i = 0; i < sArr2.length; i++) { // 0 1 2
				for (int j = 0; j < sArr2[i].length; j++) {// 0 1
					sArr2[i][j] = sArr[6 + j + (i * 2)];
				}
			}

			System.out.println("== 1분단 ==");
			for (int i = 0; i < sArr1.length; i++) {
				for (int j = 0; j < sArr1[i].length; j++) {
					System.out.print(sArr1[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("== 2분단 ==");
			for (int i = 0; i < sArr2.length; i++) {
				for (int j = 0; j < sArr2[i].length; j++) {
					System.out.print(sArr2[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("=============================");

			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 학생 이름을 입력하세요 : ");
			String name = sc.nextLine();

			int boon = 1;
			int row = 0;
			String dir = "왼쪽";
			for (int i = 0; i < sArr1.length; i++) {
				for (int j = 0; j < sArr1[i].length; j++) { // 0(왼쪽) 1(오른쪽)
					if (name.equals(sArr1[i][j])) {
						row = i + 1;
						dir = j == 0 ? "왼쪽" : "오른쪽";
					}
				}
			}

			for (int i = 0; i < sArr2.length; i++) {
				for (int j = 0; j < sArr2[i].length; j++) { // 0(왼쪽) 1(오른쪽)
					if (name.equals(sArr2[i][j])) {
						boon = 2;
						row = i + 1;
						dir = j == 0 ? "왼쪽" : "오른쪽";
					}
				}
			}

			System.out.printf("검색하신 %s 학생은 %d분단 %d 번째 줄 %s에 있습니다.", name, boon, row, dir);
		}
}


