package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.Account;
import com.kh.chap03_sync.sync.Atm;

public class Run {

	public static void main(String[] args) {
		Account acc = new Account();
		Runnable run1 = new Atm(acc);
		Runnable run2 = new Atm(acc);
	
		Thread th1 = new Thread(run1, "ATM1");
		Thread th2 = new Thread(run2, "ATM2");
		
		th1.start();
		th2.start();
		
		// 동기화 되어있지 않으면 값이 마구마구 섞여버림.
		// 즉, 앞의 쓰레드가 실행되는 동안은 다른 쓰레드가 같은 자원에 접근하면 안됨.(동기화 필요)
		// 동기화란 ?
		// 멀티쓰레딩 프로그램에서 스레드간의 공유자원에 대한 처리를 의미한다.
		// 공유자원에 대한 사용순서를 정해주는 것. 공유자원에 대한 LOCK을 획득한 스레드만 접근이 가능하다.
		
		// 동기화 방법
		// 1. synchronized 메소드로 메소드를 작성하면됨.
		// 2. 메소드 내부에 synchronized작성.
		
		
		
	}

}
