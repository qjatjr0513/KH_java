package com.kh.third;

public class MethodTest {
	public void printA() {
		System.out.println("printA 실행중!");
		printB();
	}
	public void printB() {
		System.out.println("printB 실행중!");
		printC();
	}
	public void printC() {
		System.out.println("printC 실행중!");
	}
}
