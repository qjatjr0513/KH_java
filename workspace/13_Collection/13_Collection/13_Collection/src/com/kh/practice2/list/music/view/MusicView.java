package com.kh.practice2.list.music.view;

import java.util.Scanner;

import com.kh.practice2.list.music.controller.MusicController;
import com.kh.practice2.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력 ");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			switch(num) {
			case 1: addList(); break;
			case 2: addAtZero(); break;
			case 3: printAll(); break;
			case 4: searchMusic(); break;
			case 5: removeMusic(); break;
			case 9: System.out.println("종료"); return;
			default :
				System.out.println("잘못입력하였습니다. 다시 입력해주세요.");
			}			
		}
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		//Music music = new Music(title, singer);
		int result = mc.addList(new Music(title, singer));
		if(result == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
			
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		//Music music = new Music(title, singer);
		int result = mc.addAtZero(new Music(title, singer));
		if(result == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());;
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		
		Music m = mc.searchMusic(title);
		if(m != null) {
			System.out.println(mc.searchMusic(title));
		}else {
			System.out.println("검색한 곡이 없습니다.");
		}
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		
		Music music = mc.removeMusic(title);
		
		mc.removeMusic(title);
		
		if(music != null) {
			System.out.println(music+"을(를) 삭제했습니다.");
		}else {
			System.out.println("삭제할 곡이 없습니다.");
		}
		
		
	}
}
