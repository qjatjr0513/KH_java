package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	public void mainMenu() {
		while(true) {
			System.out.println("1. 성적 저장\n2. 성적 출력\n9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			if(num == 1) {
				saveScore();
			}else if(num == 2) {
				readScore();
			}else if(num == 9) {
				System.out.println("프로그램을 종료합니다."); 
				return;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}	
		}
	}
	
	public void saveScore() {	
		int num = 0;
		sc.nextLine();
		while(true) {
			
			System.out.println((++num) +"번째 학생 정보 기록");
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			sc.nextLine();
			System.out.print("수학 점수 : ");
			int math = Integer.parseInt(sc.nextLine());
			
			int sum = kor+eng+math;
			double avg = sum/3;
			scr.saveScore(name, kor, eng, math, sum, avg);

			System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.nextLine().charAt(0);
			if(ch == 'n' || ch =='N') {
				return;
			}
		}
	}
	
	public void readScore() {
		int count = 0; // 몇며의 학생인지 담을 변수.
		int sumAll = 0;
		double avgAll = 0.0;
		
		DataInputStream dis = null;
		try {
			dis = scr.readScore();
			String value = null;
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			while(true) {
				value = dis.readUTF();
				System.out.println(value);
				count++;
				String [] str = value.split("\t");
				sumAll += Integer.parseInt(str[4]);
				// {"민경민", "39" , "59", "79" , "177", "59.0" }
			}
			
		} catch(EOFException e) {
			System.out.println("읽은 횟수 전체 합계 전체 평균");
			System.out.println(count+"\t"+sumAll+"\t"+(count != 0 ? sumAll/count : 0));		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
