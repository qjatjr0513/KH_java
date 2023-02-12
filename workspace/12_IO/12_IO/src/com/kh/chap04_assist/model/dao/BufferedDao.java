package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
	//BufferedReader(입력) / BufferedWriter(출력)
	
	// 프로그램 -> 파일 
	public void fileSave() {
		//1. 기반스트림(FileWriter)객체를 먼저 생성.
		//보조스트림도 Reader/ Writer , InputStream / OutputStream
		//
		// bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
		
//		BufferedWriter bw = null;
//		try {
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt")); //출력 통로
//			bw.write("안녕하세요");
//			bw.newLine();//개행을 넣어주는 메소드.
//			bw.write("반갑습니다 \n");
//			bw.write("저리가세요");
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		//try ~ with ~ resource 구문 (jdk7버전 이상부터 사용가능)
		/*
		 * [표현법]
		 * try(스트림객체생성;){
		 *	//예외가 발생될법한 구문.
		 *}catch(예외클래스명 e){
		 *	//예외가 발생했을때 실행할 구문.
		 *}
		 * 
		 * 스트림 객체를 try안에 넣어버리면,
		 * 스트림 객체 생성후 해당블록의 구문이 싷행 완료되면, 알아서 자원 반납이 된다.
		 */
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다 \n");
			bw.write("저리좀가세요.");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// 프로그램 <-- 파일
	public void fileRead() {
		
		// FileReader
		// BufferedReader
		
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); //없으면 null 출력
			String value = null; //String 자료형의 기본값은 null
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
