package com.kh.example.practice6.model.vo;

public class Book {
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	public Book() {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public Book(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println("책명: "+title);
		System.out.println("출판사: "+publisher);
		System.out.println("저자 : "+author);
		System.out.println("가격 : "+price);
		System.out.printf("할인율 : %.1f%%\n",discountRate);
		System.out.println();
		
	}
}
