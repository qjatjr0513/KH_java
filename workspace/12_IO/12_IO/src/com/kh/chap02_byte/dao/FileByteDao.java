package com.kh.chap02_byte.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	
	//dao (data access object) : 데이터(data)가 보관되어있는 공간과 직접 접근(access)해서 데이터를 입출력하는 클래스(object).
	
	
	// 프로그램 --> 외부매체(파일)
	// 출력 : 프로그램내의 데이터를 파일로 내보내기(즉, 파일에 저장(기록)하겠다.)
	public void fileSave() {
		
		//FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림.
		
		FileOutputStream fout = null; // 변수 선언 및 null 초기화
		try {
			//1. FileOutputStream 객체 생성 => 해당 파일과 직접 연결되는 통로(스트림)을 만들겠다.
			// 해당 파일이 존재하지 않으면, 해당 파일이 생성되면서 통로가 연결됨.
			//존재하는 파일이라면, 그냥 통로만 연결
			
			fout = new FileOutputStream("a_byte.txt"); //덮어씌우기
			//fout = new FileOutputStream("a_byte.txt", true); //이어쓰기.
			// true를 작성하게 되면 기존 해당 파일이 있을경우 이어서 작성한다.
			// true를 추가하지 않은 생성자는 기존에 해당파일이 있을경우 덮어씌어짐.
			
			// 2. 연결통로로 데이터 출력 : write()메소드 사용.
			// 1byte : -128 ~ 127까지의 숫자.
			fout.write(97); // a
			fout.write(112);// p
			fout.write(112);// p
			fout.write(108);// l
			fout.write(101);// e
			//fout.write('a');  //int->char로 자동 형변환
			
			byte [] b = {99, 100, 101};
			fout.write(b);
			
			byte [] c = {102,103,104,105,106};
			fout.write(c, 0, 3);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		} finally { //어떤 예외가 발생하든, 발생 안하든 반드시 실행할 구문을 작성하는 블럭.
			try {
				// 3. 스트림을 다 사용 했다면 반드시 자원을 반납해야한다.
				fout.close(); //무조건 닫아줘야함
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <-- 외부매체(파일)
	//입력 : 파일로부터 데이터를 가지고 오겠다.
	public void fileRead() {
		
		//FileInputStream 객체 생성 (통로를 열겠다.)
		
		FileInputStream fin = null;
		
		try {
			// 1. a_byte.txt와 프로그램을 연결하는 입력스트림을 열겠다.
			fin = new FileInputStream("a_byte.txt"); //반드시 존재하는 파일로 제시.		
			
			// 2. 통로로 데이터를 입력받기 위한 메서드 read()
			// 1byte 단위로 하나씩 읽어옴.
			
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
			// 파일의 끝을 만나는 순간 fin.read() => -1
			// a p p l e c d e f g h
			// fin.read() => a
			// fin.read() => p
			// fin.read() => p
			// fin.read() => l
			// ....
			
			// 퐁당퐁당 실행.(한글자씩 뽑아짐 -> 한글자씩 건너서 출력됨)
			// a -> 97
//			while(fin.read() != -1){ // 97 != -1, 101 != -1
//				System.out.println(fin.read()); //101, 103
//			}
			
			//권장하는 방법.
			int value = 0;
			
			while((value = fin.read()) != -1) {
				System.out.println((char)value);
				
			}
			
			
//			int value2 = 0;
//			
//			while(value2 != -1) {
//				value2 = fin.read();
//				System.out.println(value2);
//			}
						
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			//3. 다쓴 스트림 자원 반남하기.
			try {
				fin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}
