package com.kh.chap02_abstractAndInterface.part01_interface.model.vo;

public class Baby extends Person implements Basic {//implements Basic => Basic 인터페이스를 구현한다., 다중 구현 가능
		

	
	public Baby(String name, String weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return "Baby ["+super.toString()+"]";
	}
	
	@Override 
	public void eat() {
		super.setWeight(super.getWeight()+ " + 500g 증가.");
		super.setHealth(super.getHealth()+5);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+10);
	}
}
