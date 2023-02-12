package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		while(true) {
//			학생은 최대 3명까지 저장할 수 있습니다.
//			현재 저장된 학생은 M명입니다.
//			사원은 최대 10명까지 저장할 수 있습니다.
//			현재 저장된 사원은 N명입니다
			int arr[] = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은"+arr[0]+"명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은"+arr[1]+"명입니다.");
			
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기 ");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				studentMenu(); 
				break;
			case 2: 
				employeeMenu(); 
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void studentMenu() {
		while(true) {
			System.out.println("1. 학생 추가\n2. 학생 보기 \n9. 메인으로");
			int arr[] = pc.personCount();
			if(arr[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉찾기 때문에 학생 추가 메뉴는 더이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			
			switch(num) {
			case 1:
				if(arr[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					break;
				}
				insertStudent();
				break;
			case 2: 
				printStudent();
				break;
			case 9: 
				System.out.println("메인으로 돌아갑니다.");
				return;
			}
		}
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가 \n2. 사원 보기 \n9. 메인으로");
			int arr[] = pc.personCount();
			if(arr[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉찾기 때문에 사원 추가 메뉴는 더이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				if(arr[1] == 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				insertEmployee();
				break;
			case 2: 
				printEmployee();
				break;
			case 9: 
				System.out.println("메인으로 돌아갑니다.");
				return;
			}
		}
	}
	
	
	public void insertStudent() {
		sc.nextLine();
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("학생 키 : ");
			double height = sc.nextDouble()
					;
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			
			sc.nextLine();
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			int [] arr = pc.personCount();
			if(arr[0] !=3) {
				System.out.println("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
				char ch = sc.nextLine().charAt(0);
				if(ch == 'N' || ch =='n') {
					return;
				}
			}else {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}
				
		}

	}
	
	public void printStudent() {
		Student[] arr = pc.printStudent();
		for(Student std : arr) {
			System.out.println(std);
		}
	}
	
	public void insertEmployee() {
		sc.nextLine();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("사원 부서 : ");
		String dept = sc.nextLine();
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		int [] arr = pc.personCount();
		if(arr[1] !=10) {
			System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			char ch = sc.nextLine().charAt(0);
			if(ch == 'N' || ch =='n') {
				return;
			}
		}else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
			return;
		}
	}
	
	public void printEmployee() {
		Employee[] arr = pc.printEmployee();
		for(Employee emp : arr) {
			System.out.println(emp);
		}
	}
	
}
