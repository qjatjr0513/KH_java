package com.kh.practice_student.controller;

import com.kh.chap02_objectArray.model.vo.Phone;
import com.kh.practice_student.model.vo.Student;

public class StudentController {
	private Student[] sArr = new Student[5];
	public final int CUT_LINE = 60; //대문자는 상수 = final 붙이기
	
	
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {	//getter메서드
		return sArr;
	}
	
	public int sumScore() {
		int sum = 0;
		// Student : student[]
		for(Student student : sArr){
			sum += student.getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] dArr = new double[2];
		dArr[0] = sumScore();
		dArr[1] = sumScore() /sArr.length;
		return dArr;// 종료시 dArr은 사라짐
	}
	
}
