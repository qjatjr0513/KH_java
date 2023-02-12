package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	private int tire;
	private int wing;
	
	public Airplane() {
		
	}
	
	public Airplane(String name, double milage, String kind, int tire, int wing) {
		super(name, milage, kind);
		this.tire = tire;
		this.wing = wing;
	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public String information() {
		return super.information()+" "+tire+" "+wing;
	}
	
	public void howToMove() {
		System.out.println("날개로 움직인다.");
	}
}
