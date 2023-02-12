package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee el = new Employee();
		el.setEmpNo(100);
		el.setEmpName("홍길동");
		el.setDept("영업부");
		el.setJob("과장");
		el.setAge(25);
		el.setGender('남');
		el.setSalary(2500000);
		el.setBonusPoint(0.05);
		el.setPhone("010-1234-5678");
		el.setAddress("서울시 강남구");
		
		System.out.printf("empNo : %d\nempName : %s\ndept : %s\njob : %s\nage : %d\ngender : %c\nsalary : %d\nbonusPoint : %f\nphone : %s\naddress : %s", el.getEmpNo(), el.getEmpName(), el.getDept(), el.getJob(), el.getAge(), el.getGender(), el.getSalary(), el.getBonusPoint(), el.getPhone(), el.getAddress());
	}

}
