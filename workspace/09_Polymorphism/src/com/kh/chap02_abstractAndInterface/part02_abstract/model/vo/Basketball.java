package com.kh.chap02_abstractAndInterface.part02_abstract.model.vo;

public class Basketball extends Sports{
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 잡아서 골대에 넣어야한다.");
		
	}
}
