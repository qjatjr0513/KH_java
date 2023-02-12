package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원 ");
		System.out.println("2. 사각형 ");
		System.out.println("3. 끝내기 ");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		//if문 방법 
		if(num == 1) {
			circleMenu();
		}else if(num == 2) {
			rectangleMenu();
		}else if(num == 3) {
			return;
		}else {
			mainMenu();
		}
		
		//switch문 방법
//		while(true) {
//			System.out.println("===== 메뉴 =====");
//			System.out.println("1. 원 ");
//			System.out.println("2. 사각형 ");
//			System.out.println("3. 끝내기 ");
//			System.out.print("메뉴 번호 : ");
//			int num = sc.nextInt();
//			switch(num) {
//			case 1:
//				circleMenu();
//				break;
//			case 2:
//				rectangleMenu();
//				break;
//			case 3:
//				System.out.println("종료합니다.");
//				break;
//			default :
//				System.out.println("잘못입력하였습니다.");
//				mainMenu();
//				break;
//			}
//			return;
//		}
	}
	
	public void circleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 원 둘레 ");
		System.out.println("2. 원 넓이 ");
		System.out.println("3. 메인으로 ");
		System.out.print("메뉴 번호 : ");
		int num2 = sc.nextInt();
		//if문 방법 
		if(num2 == 1) {
			calcCircum();
		}else if(num2 == 2) {
			calcCircleArea();
		}else if(num2 ==3) {
			mainMenu();
		}else {
			circleMenu();
		}
			
		//switch문 방법
//		switch(num2) {
//		case 1: 
//			calcCircum();
//			break;
//		case 2:
//			calcCircleArea();
//			break;
//		case 3:
//			mainMenu();
//			break;
//		default :
//			System.out.println("잘못입력하였습니다.");
//			circleMenu();
//			break;	
//		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레 ");
		System.out.println("2. 사각형 넓이 ");
		System.out.println("3. 메인으로 ");
		System.out.print("메뉴 번호 : ");
		int num3 = sc.nextInt();
		//if문 방법 
		if(num3 == 1) {
			calcPerimeter();
		}else if(num3 == 2) {
			calcRectArea();
		}else if(num3 ==3) {
			mainMenu();
		}else {
			rectangleMenu();
		}
		
		//switch문 방법
//		switch(num3) {
//		case 1: 
//			calcPerimeter();
//			break;
//		case 2:
//			calcRectArea();
//			break;
//		case 3:
//			mainMenu();
//			break;
//		default :
//			System.out.println("잘못입력하였습니다.");
//			circleMenu();
//			break;
//		}
	}
	
	public void calcCircum() {
		System.out.print("x좌표 : ");
		int x = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcCircum(x, y, radius)); //반환형이 String형이라서 println문으로 출력
	
	}
	
	public void calcCircleArea() {
		System.out.print("x좌표 : ");
		int x = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x좌표 : ");
		int x = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x좌표 : ");
		int x = sc.nextInt();
		System.out.print("y좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.println("면적 : "+rc.calcArea(x, y, height, width));
	}
}
