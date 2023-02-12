package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//다형성을 적용시킨경우.
public class ElectronicController2 {

	private Electronic[] elec = new Electronic[3];
	
	
	// desktop, notebook, tablet
	//방법1.
	private int count = 0;
	public void insert(Electronic any) {
		elec[count]  = any;
		count++;
	}
	
	//방법2
//	public void insert(Electronic any, int index) {
//		elec[index]  = any;
//	
//	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	
	public Electronic[] select() { //위쪽 Electronic[]이랑 다른 메소드
		return elec;
	}
}
																															