package com.kh.chap02_abstractAndInterface.part02_abstract.model.vo;

public class Football extends Sports {
	
	@Override
	public void rule() {
		System.out.println("발로 공을 차서 골대에 넣어야한다.");
	}
}
