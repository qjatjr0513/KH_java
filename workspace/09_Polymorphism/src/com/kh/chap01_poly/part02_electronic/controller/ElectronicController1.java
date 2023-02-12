package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용전 컨트롤러
public class ElectronicController1 {
	
	//용산전자상가에 새로 오픈한 가게.
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	//이런 방법도 있음
//	public void insertDesk() {
//		desk = new Desktop("삼성", "데탑", 1200000, "Geforce 1070");
//	}
	
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}										
	
}
