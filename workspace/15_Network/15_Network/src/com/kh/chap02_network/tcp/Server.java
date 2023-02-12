package com.kh.chap02_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	public void serverStart() {
		
		// 1) 포트번호 설정
		int port = 3000;
		
		ServerSocket server = null;
		
		try {
			// 2) 서버 소켓 객체생성
			server = new ServerSocket(port);
			System.out.println("서버시작...");
			
			
			
			while(true) {
				// 3) 클라이언트 정보를 저장.
				System.out.println("클라이언트 대기중...");
				Socket client = server.accept(); // Socket == 클라이언트와 통신할 수 있는 소켓 객체
				// 4, 5) 연결된 클라이언트와 입출력 스트림 생성.
				OutputStream os = client.getOutputStream(); // 클라이언트로 값을 "출력"하는 스트림
				InputStream in = client.getInputStream(); // 클라이언트로 값을 "입력"하는 스트림
				
				// 5, 6) 보조스트림으로 성능 개선.
				// 클라이언트로부터 전달된 값을 한줄 단위로 읽어들이기 위한 입력용 스트림
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				//클라이언트에게 값을 한줄 단위로 출력하는 스트림.
				PrintWriter pw = new PrintWriter(os, true); // 데이터 출력할때, print(), println() 메소드를 가지고 있음.
				
				// 7) 스트림을 통해 읽고 쓰기
				
				while(true) {
					
					String message = br.readLine();
					Scanner sc = new Scanner(System.in);
					if(message == null || "exit".equals(message)) {
						System.out.println("클라이언트 접속 종료");
						break;
					}else {
						System.out.println(client.getInetAddress().getHostAddress()+"가 보낸 메세지 : "+ message);
						System.out.print("클라이언트에 보낼 내용 : ");
						String str = sc.nextLine();		
						
						pw.println(str);
						pw.flush();
						
						//pw.println("메세지 받기 성공");
						//pw.flush(); // 현재 스트림에 남아있는 데이터들을 강제로 내보내는 메소드. (close메소드 호출되면 자동으로 flush호출)
					}
					
				}
				// 8) 통신종료.
				br.close();
				pw.close();
				client.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
