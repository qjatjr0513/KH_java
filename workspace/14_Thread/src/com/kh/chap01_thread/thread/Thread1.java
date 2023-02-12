package com.kh.chap01_thread.thread;

//	스레드 생성방법
// 	1. Thread 클래스를 상속 받아서 생성.
//	2. Thread 클래스 상속 후에 run()메소드를 오버라이딩해야함.
// 	3. Thread1 객체를 생성한 후, start()메서드를 호출해야함.
public class Thread1 extends Thread{
	//쓰레드 실행시 run메소드가 호출됨.
	//따라서 작업하고자 하는 코드를 반드시 run이라는 메소드 안에 작성을 해야한다.
	// 즉, run 메소드를 오버라이딩(재정의)해줘야 한다는 말.
	
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(getName()+"["+i+"]");
			// getName() : 쓰레드의 이름을 반환하는 녀석.
			//			   순차적으로 Thread-0, Thread-1 이런식으로 이름이 붙음.
		}
	}
}

