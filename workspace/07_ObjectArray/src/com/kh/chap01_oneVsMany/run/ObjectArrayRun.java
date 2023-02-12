package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Book[] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("책 제목 : ");
			String title = sc.nextLine();
			
			System.out.print("책 저자 : ");
			String author = sc.nextLine();
			
			System.out.print("책 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("책 출판사 : ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].info());
		}
		
		//사용자에게 검색할 도서 제목을 입력받아.
		//각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려줌
		
		//만약 일치하는 도서를 찾지 못한 경우 "검색된 도서가 없습니다" 출력
		//일치하는 도서를 발견하면 도서의 번호도 함께 출력.
		//출력예시
		// XX 책의 가격 : XXXX원, 위치 : X번째.
		
		System.out.print("검색할 책 : ");
		String searchBook = sc.nextLine();
		
		boolean isFind = false;//책을 찾았는지 검사
		for(int i = 0; i<arr.length; i++) {
			if(searchBook.equals(arr[i].getTitle())) {
				isFind = true;
				System.out.printf("%s책의 가격 : %d, 위치 : %d번째.", arr[i].getTitle(), arr[i].getPrice(), (i + 1));
				break;
			}		
		}
		 //!isFind -> 찾지 못하면 실행됨
		if(!isFind) {System.out.println("\n검색된 도서가 없습니다.");
			
		}
	}
}
