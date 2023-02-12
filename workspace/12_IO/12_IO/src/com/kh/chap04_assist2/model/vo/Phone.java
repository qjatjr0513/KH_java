package com.kh.chap04_assist2.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ //필드에 있는 코드를 byte로 변환을 해줌
	
	private String name;
	private int price;
	
	public Phone() {
		
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Phone [name ="+name+", price = "+price+"]";
	}
	
}
