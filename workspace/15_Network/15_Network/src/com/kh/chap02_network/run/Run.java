package com.kh.chap02_network.run;

import com.kh.chap02_network.tcp.Server;

public class Run {

	public static void main(String[] args) {
		/*
		 * Tcp(Transmission Control Protocol) 
		 * - 서버, 클라이언트간의 1:1 소켓통신
		 * - 데이터를 교환하기에 앞서서 서버, 클라이언트 연결되어있어야함. (서버가 먼저 실행되어, 클라이언트의 요청을 대기)
		 * - 신뢰성 있는 데이터 전달 가능.
		 * 
		 * ServerSocket
		 * - 서버에서 클라이언트의 요청을 하면 그 요청을 받을때까지 기다리는 클래스.
		 * - 사용법 : ServerSocket server = new ServerSocket(int portNumber)
		 * - 메소드
		 * 	> Socket client = server.accept() 메소드를 통해 클라이언트의 연결을 기다리고 연결이 오면 Socket객체로 반환
		 * 
		 * Socket
		 * - 클라이언트에서 서버에 요청을 하거나, 서버에서 클라이언트의 요청을 받았을때 사용하는 클래스.
		 * - 사용법 ; Socket socket = new socket(String IPaddress, int portNumber)
		 * - 메소드
		 * > OutputStream out = client.getOutputStream()메소드를 통해 데이터를 내보낼 수 있는 OutputStream을 생성 가능.
		 * > InputStream in = client.getInputStream()메소드를 통해 데이터를 읽어올 수 있는 InputStream을 생성 가능.
		 * 
		 * 서버의 연결순서.
		 * 1) 서버의 소켓 객체 생성
		 * 
		 * 2) 클라이언트의 접속 요청을 기다림.
		 * 
		 * 3) 요청이 오면 수락.
		 * 
		 * 4) 클라이언트 정보를 저장.
		 * 
		 * 5) 클라이언트 정보를 통해서 OutputStream생성.
		 * 
		 * 6) 클라이언트 정보를 통해서 InputStream생성
		 * 
		 * 7) 스트림을 통해 읽고쓰기.
		 * 
		 * 8) 통신 종료.
		 * 
		 */
		
		Server s = new Server();
		s.serverStart();
		
		
	}

}
