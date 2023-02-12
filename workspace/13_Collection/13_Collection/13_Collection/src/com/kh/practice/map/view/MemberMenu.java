package com.kh.practice.map.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.kh.chap03_map.model.vo.Snack;
import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		System.out.println("========== KH 사이트 ==========");
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입\n2. 로그인\n3. 같은 이름 회원 찾기\n9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: joinMembership(); break;
			case 2: logIn(); break;
			case 3: sameName(); break;
			case 9: System.out.println("프로그램 종료"); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}			
		}
	}
	
	public void memberMenu() {
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복

		while(true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기\n2. 이름 바꾸기\n3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch(num) {
			case 1: changePassword(); break;
			case 2:	changeName(); break;
			case 3: System.out.println("로그아웃 되었습니다."); return;
			default : System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}			
		}
	}
	
	public void joinMembership() {
//		회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은
//		Member객체에 담고 id와 객체는 MemberController(mc)의 joinMembership()로 보냄.
//		받은 결과에 따라 true면 “성공적으로 회원가입 완료하였습니다.”,
//		false면 “중복된 아이디입니다. 다시 입력해주세요.” 출력

		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			Member m = new Member(password, name);
			boolean result = mc.joinMembership(id, m);
			
			if(result) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				return;
			}else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요");
			}
		}
	}
	
	public void logIn() {
//		아이디와 비밀번호를 사용자에게 받아 mc의 logIn()메소드로 넘겨 줌
//		반환 값 있으면 “OOO님, 환영합니다!” 출력 후 로그인 된 화면으로(memberMenu()),
//		없으면 “틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.” 출력 후 반복

		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			if(name != null) {
				System.out.println(name+"님 환영합니다!");
				memberMenu();
				return;
			}else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}			
		}
	}
	
	public void changePassword() {
//		아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 chagePassword()로 보냄.
//		받은 결과 값이 true면 “비밀번호 변경에 성공했습니다.”, 
//		false면 “비밀번호 변경에 실패했습니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 :");
			String newPw = sc.nextLine();
			
			boolean result = mc.changePassword(id, oldPw, newPw);
			
			if(result == true) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			}else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}			
		}
	}
	
	public void changeName() {
//		아이디와 비밀번호를 받아 mc의 logIn()으로 넘겨 현재 저장되어 있는 이름을 받고
//		사용자에게 현재 저장되어 있는 이름을 출력하여 보여줌. 
//		변경할 이름을 받아 mc의 chageName()로 id와 함께 넘기고
//		“이름 변경에 성공하였습니다.” 출력
//		만일 logIn()로부터 저장되어 있는 이름을 받지 못 했다면
//		“이름 변경에 실패했습니다. 다시 입력해주세요” 출력 후 반복
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			String name = mc.logIn(id, password);
			
			if(name != null) {
				System.out.println("현재 설정된 이름 : "+name);
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.");
				return;
			}else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			}			
		}
	}
	
	public void sameName() {
//		검색할 이름을 받고 mc의 sameName()메소드로 넘김.
//		반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력

		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		TreeMap<String, Member> tm = mc.sameName(name);
		
		Set<Entry<String, Member>> entrySet = tm.entrySet();
		//해설
//		for(Entry<String, Member> en : entrySet) {
//			System.out.println(en.getValue().getName()+"-"+en.getKey());
//		}
		//내가 한 방법
		Iterator<Entry<String, Member>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<String, Member> entry = it.next();
			System.out.println(entry.getValue().getName()+"-"+entry.getKey());
		}
	}
}
