package com.kh.chap01_oneVsMany.model.vo;

public class Book {
	
	//도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	//기본생성자 
	public Book() {
		
	}
	//매개변수 생성자 (4개값 모두 들어감)
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	//각 필드에 대한 setter/ getter메서드
	//setter 메서드
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPublisher (String publisher) {
		this.publisher = publisher;
	}
	
	//getter 메서드
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getPublisher() {
		return publisher;
	}
	//모든 필드를 하나의 문자열로 합치는 info 메서드
	public String info() {
		return title +" "+ author +" "+ price +" "+ publisher;
	}
}
