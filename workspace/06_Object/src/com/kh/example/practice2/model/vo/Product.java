package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	public void  setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	public String getName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	public void information() {
		System.out.println("이름 : "+getName());
		System.out.println("가격 : "+getPrice());
		System.out.println("브랜드 : "+getBrand());
	}
}
