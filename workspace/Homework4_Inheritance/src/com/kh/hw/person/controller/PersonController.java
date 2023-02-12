package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;


public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];

	public int[] personCount() {
		int[] arr = new int[2];
		arr[0] = s.length; //3값을 넣음
		for(int i = 0; i<s.length ; i++) {
			if(s[i] == null) {
				arr[0] = i; //null이면 i로 초기화해서 값이 변경됨.
				break;
			}
		}
		arr[1] = e.length;
		for(int i = 0; i<e.length ; i++) {
			if(e[i] == null) {
				arr[1] = i;
				break;
			}
		}
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		//학생객체 배열중 null값인 곳이 빈곳이다.
		for(int i = 0; i<s.length; i++) { //0 1 2
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
