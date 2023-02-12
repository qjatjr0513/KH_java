package com.kh.chap03_class.model.vo;

//클래스에서 사용 가능한 접근제한자 : public , default(생략가능)
//default인 경우 다른 패키지에서 접근 불가.
public class Person {
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//setter 메서드 : setXXX(낙타표기법)XXX의 첫문자는 대문자!
	public void setId(String id) { //매개변수명은 필드부와 동일하게
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public String info() {
		return id+" "+pwd+" "+name+" "+age+" "+gender+" "+phone+" "+email;
	}
}