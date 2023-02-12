package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int [] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice2() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		//역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int [] arr = new int[10];
		for(int i = arr.length; i > 0; i--) {
			arr[i-1] = i;
			System.out.print(arr[i-1]+" ");
		}
//		for(int i = 0; i<arr.length;i++) {
//		arr[i] = arr.length-i;
//		System.out.print(arr[i]+" ");
//	}

	}
	
	public void practice3() {
		//사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		//1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int [] arr = new int[num];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = i+1; 
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() {
		//길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		//배열 인덱스를 활용해서 귤을 출력하세요.
		
		String[] arr= {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		//문자열을 입력 받아 문자 하나하나를 배열에 넣고 
		//검색할 문자가 문자열에 몇 개 들어가 있는지
		//개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		int strLength = str.length();	
		char []arr = new char[strLength];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i); //apple arr[0]: a, arr[1] : p, arr[2] : p, arr[3] : l, arr[4] : e
		}
		
		System.out.print("찾을 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str, ch);
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == ch) {
				count++;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println("i의 개수 : "+count);
	}
	
	public void practice6() {
		//“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 
		//0부터 6까지 숫자를 입력 받아
		//입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		//범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int day = sc.nextInt();
		
		String []arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		if(day>6) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(arr[day]+"요일");
		}
		
//		if(day >= 0 && day <=6) {
//			System.out.println(arr[day]+"요일");
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
	}
	
	public void practice7() {
		//사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		//배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		//그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총합 : " + sum);
	}
	
	public void practice8() {
		//3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//다시 정수를 받도록 하세요
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요");
			practice8();
		} else {
			int[] arr = new int[num];
			for (int i = 0; i < arr.length; i++) {
				if (i <= arr.length / 2) {
					arr[i] = i + 1;
				} else {
					arr[i] = arr.length - i;
				}
			}

			for (int i = 0; i < num; i++) {
				System.out.print(arr[i] + (i != (num - 1) ? ", " : ""));
			}
		}
		//풀이
//		if (num >= 3 && num % 2 == 1) {
//			int[] arr = new int[num];
//			int mid = num / 2 + 1;
//			int value = 0;
//			for (int i = 0; i < num; i++) {
//				if (i < mid) {
//					arr[i] = ++value;
//
//				} else {
//					arr[i] = --value;
//				}
//			}
//			// 1, 2, 3, 2, 1
//			for (int i = 0; i < num; i++) {
//				System.out.print(arr[i] + (i != (num - 1) ? ", " : ""));
//			}
//		} else {
//			System.out.println("다시입력하세요.");
//			practice8();
//		}
	}
	
	public void practice9() {
		//사용자가 입력한 값이 배열에 있는지 검색하여
		//있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요
		Scanner sc = new Scanner(System.in);
		String []arr = {"양념", "후라이드", "간장", "불닭"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
//		for(int i = 0; i<arr.length; i++) {
//			if(chicken.equals(arr[i]) ) {
//				System.out.printf("%s 치킨 배달 가능\n", chicken);
//				return;
//			}
//		}
//		System.out.printf("%s 치킨은 없는 메뉴입니다.\n", chicken);
		
		boolean isTrue = true;
		for(int i = 0; i<arr.length; i++) {
			if(chicken.equals(arr[i]) ) {
				System.out.println(chicken+ "치킨 배달 가능");
				isTrue = false;
				break;
			}
		}
		if(isTrue) {
			System.out.println(chicken+" 치킨은 없는 메뉴입니다.");			
		}
	}
	
	public void practice10() {
		//주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		//단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		int strLength = num.length();
		char[]arr = new char[strLength];
		
		for(int i =0; i<strLength; i++) {
			arr[i] = num.charAt(i);
		}
		char []arr2 = new char[strLength];
		//System.arraycopy(arr, 0, arr2, 0, 7);
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = num.charAt(i);
		}
		//123456-1*****
		for(int i =0; i<strLength; i++) {
			if(i>=8) {
				arr2[i] = '*';				
			}else {
				arr2[i] = arr[i];
			}
		}
		for(int i = 0; i<strLength;i++) {
			System.out.print(arr2[i]);
		}
	}
	
	public void practice11() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		int []arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int []arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
			}
		
		//방법1. 
		/*
		 * Arrays.sort(arr);
		 * 
		 * System.out.println("\n최댓값 : "+arr[arr.length-1]);
		 * System.out.println("최솟값 : "+arr[0]);
		 */
		
		//방법 2.
		int min = arr[0];
		int max = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("\n최댓값 : "+max);
		System.out.println("최솟값 : "+min);
	}
	
	public void practice13() {
		//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int []arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1); //비교하려는 원본값.
			for(int j = 0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;	
					break;// break 없으면 두번 돌아감
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice14() {
		//로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
		int []num = new int[6];
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45+1);
			for(int j = 0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(num);
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	public void practice15() {
		//문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		//문자의 개수와 함께 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char []arr = new char[str.length()];

		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		int length =str.length();
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i<arr.length; i++) {
			//비교할 대상
			char ch = arr[i];
			boolean isTrue = true;
			for(int j = 0; j<i; j++) {
				if(ch == arr[j]) {
					isTrue = false;
					length--;
					break;
				}
			}
			if(isTrue) {
				System.out.print(ch+(i != (arr.length-1) ? ", " : ""));				
			}
		}
		System.out.println("\n문자 개수 : "+ length);
	}
	
	public void practice16() {
		//사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
		//배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
		//단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		//늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
		//사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		String []arr = new String[size];
		
		sc.nextLine();
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d번째 문자열 : ",i+1);
//			System.out.print((i+1)+"번째 문자열 : "); 
			arr[i] = sc.nextLine();
		}
		
		
		
		while (true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0); // y Y. n N

			if (ch == 'y' || ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int size2 = sc.nextInt();

				String[] copy = Arrays.copyOf(arr, arr.length + size2);

				sc.nextLine();
				for (int i = arr.length; i < (arr.length + size2); i++) {
					System.out.printf("%d번째 문자열 : ", i + 1);
//					System.out.print((i+1)+"번째 문자열 : "); 
					copy[i] = sc.nextLine();
				}
				arr = copy.clone(); // copy의 복사본을 arr에 초기화(깊은복사)

			} else if (ch == 'n' || ch == 'N') {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
	}
}
