package com.kh.chap03_override.model.vo;

public class Book /*extends object*/{
	private String title;
	private String author;
	private int price;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	/*
	 * 	오버라이딩 //생산성을 높이기 위해서 사용.
	 * 	- 상속받고 있는 부모클래스의 메소드를 자식클래스에서 재정의(재작성) 하는것
	 * 	- 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미(자식메소드가 우선권을 지님)
	 * 
	 * 	오버라이딩 성립 조건
	 * 	- 부모메소드의 메소드명과 동일.
	 * 	- 매개변수 자료형, 갯수, 순서가 동일(매개변수명과는 무관함)
	 * 	- 반환형 동일. // 오버로딩과 다름
	 * 	- 부모메소드의 접근제한자 보다 길거나 공유 범위가 커야함.
	 * 	ex) 부모 메소드의 접근제한자가 protected라고 한다면 자식은 public, protected여야함.
	 * 	=>규약의 개념이 들어가있음(재정의하려면 요정도 규칙은 지켜야 한다는것.)
	 * 
	 * 	@Override 어노테이션
	 * 	- 생략가능(명시를 안해도 부모메소드와 형태가 같으면 오버라이딩이 된것임.)
	 * 	- 어노테이션을 붙이는 이유?
	 * 	  > 잘못 기술했을 경우 오류를 알려주기 때문에 다시 한번 검토할 수 있게 유도한다.
	 *	  > 혹시라도 부모메소드가 후에 수정되었을 경우 오류로 알려주기 때문에 검토할 수 있게끔 유도한다.
	 * 	  > 이메소드가 오버라이딩 된 메소드라는 걸 알리기 위한 목적으로도 사용된다.(가장 많이 사용)
	 */
	
	@Override 
	public String toString() {
		return "title : "+title+" author : "+author+" price : "+price;
	}
}
