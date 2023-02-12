package com.kh.chap01_thread.thread;

//	스레드 생성방법
//	2. Runnable 인터페이스를 구현하는 방법.
//	  -Runnable 인터페이스의 run()메소드 오버라이딩.
public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+"["+i+"]");
		}
	}
}
