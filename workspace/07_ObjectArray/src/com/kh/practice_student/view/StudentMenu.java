package com.kh.practice_student.view;

import com.kh.chap02_objectArray.model.vo.Phone;
import com.kh.practice_student.controller.StudentController;
import com.kh.practice_student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		Student[] sArr2 = ssm.printStudent(); //getter 메서드처럼 값을 받음
		
		for(Student std : sArr2 ) {
			System.out.println(std.inform());
		}
		
		System.out.println("========== 학생 성적 출력 ==========");
		double [] dArr = ssm.avgScore(); //사라진 dArr을 여기서 선언
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		System.out.println("학생 점수 합계 : "+(int)dArr[0]);
		
		System.out.println("학생 점수 평균 : "+dArr[1]);
		
		System.out.println("========== 성적 결과 출력 ==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력		
		for(Student std : sArr2 ) {
			if(std.getScore() < ssm.CUT_LINE ) {
				System.out.println(std.getName()+"학생은 재시험대상입니다.");
			}else {
				System.out.println(std.getName()+"학생은 통과입니다.");
			}
		}	
	}
}

