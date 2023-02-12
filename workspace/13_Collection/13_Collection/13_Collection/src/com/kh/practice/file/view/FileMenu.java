package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기\n2. 노트 열기\n3. 노트 열어서 수정하기\n9. 끝내기 ");
			System.out.print("메뉴 번호 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}			
		}
	}
	
	public void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요\nex끝it 이라고 입력하면 종료됩니다.");
	
		StringBuilder sb = new StringBuilder();
		//안녕하세요.
		//반갑습니다.
		//끝이에요.
		while(true) {
			System.out.print("내용 : ");
			String msg = sc.nextLine();
			if(msg.equals("ex끝it")) {
				break;
			}
			sb.append(msg+"\n");
		}
		while(true) {
			System.out.println("저장할 파일 명을 입력해주세요(ex. myFile.txt) :");
			String file = sc.nextLine();
			
			if(fc.checkName(file)) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				char ch = sc.nextLine().charAt(0);
				if(ch == 'y'|| ch == 'Y') {
					continue;
				} 
			}
			fc.fileSave(file, sb);
			break;
		}
	}
	
	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		
		if(fc.checkName(file)) {
			System.out.println(fc.fileOpen(file));
		}else {
			System.out.println("없는 파일입니다.");
		}
	}
	
	public void fileEdit() {
		System.out.print("수정할 파일 명 :");
		String file = sc.nextLine();	
		
		if(fc.checkName(file)) {
			System.out.println("파일에 저장할 내용을 입력하세요\nex끝it 이라고 입력하면 종료됩니다.");
			
			StringBuilder sb = new StringBuilder();

			while(true) {
				System.out.print("내용 : ");
				String msg = sc.nextLine();
				if(msg.equals("ex끝it")) {
					break;
				}
				sb.append(msg+"\n");
			}
			fc.fileEdit(file, sb);
		}else {
			System.out.println("없는 파일입니다.");
		}

	}
}
