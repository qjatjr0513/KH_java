package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//프로그램 --> 외부매체(파일)
	public void fileSave() {
		
		//FileWriter : 파일로 데이터를 2byte 단위로 출력하는 스트림을 연결.
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt");
			
			fw.write("와 ! IO재밌다~");
			fw.write('a');
			fw.write(' ');
			
			char[] cArr = {'k','i','w','i'};
			fw.write(cArr);
		}catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		
		//FileReader : 파일로부터 데이터를 2byte단위로 입력받는 스트림.
		
		
		try (FileReader fr = new FileReader("b_char.txt")){
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
