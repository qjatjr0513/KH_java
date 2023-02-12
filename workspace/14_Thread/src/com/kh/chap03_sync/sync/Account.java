package com.kh.chap03_sync.sync;

// 1개의 Account(계좌)
// 2개의 Atm기에서 돈을 뽑는
public class Account {

	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	/*
	 * 
	 * synchronized(해당 객체를 격리공간으로 지정하는 예약어)
	 * - 동기화 메소드, 동기화블럭에 사용되는 키워드
	 * - 동기화메소드는 메소드 선언에 synchronized키워드를 붙이고 인스턴스, 정적메소드 어디든 사용 가능하다.
	 * - 동기화메소드는 스레드가 메소드를 실행하면 메소드 전체에 즉시 락(LOCK)을 걸고 메소드가 종료되면 락이 풀린다.
	 * - 메소드 전체가 아니라 일부 내용만 락을 걸고 싶다면 동기화블럭을 만들면 된다.
	 */
	
	
	public /*synchronized*/ void withdraw(int money) {
		synchronized(this) {
			String thName = Thread.currentThread().getName();
			System.out.println("현재 잔액은 ? "+balance);
			
			if(money <= balance) {
				balance -= money;
				System.out.printf("[%s] %d원 출금 -> 잔액 : %d원\n", thName, money, balance);
			} else {
				System.out.printf("[%s] %d원 출금시도 >>> 잔액이 부족합니다. \n", thName, money);
			}			
		}
	}
	
	
}
