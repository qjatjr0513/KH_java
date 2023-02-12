package com.kh.practice.score.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreDAO {
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		//매개변수들을 DataOutputStream을 통해 파일에 저장.
		//처음보는 클래스 문제해결방법.
		// 1. 해당 클래스에서 사용가능한 메소드들을 찾아본다.
		// 2. 메소드를 사용한 후 실행결과를 통해 확인.
		// 3. 실행결과 에러가 난다면 다른것으로, 에러가 안난다면 결과가 정상적으로 진행되었는지 확인.(출력문이나, 파일자체를 확인)
		// 4. 도저히 안되겠으면 구글검색.
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.txt", true))){
			String str = name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg;
			dos.writeUTF(str);
			// writeUTF를 통해 저장한 결과 한글 제대로 저장된것을 확인함.
			//아래 내용도 정상적으로 저장되게끔 바꿔주면.
//			dos.writeChar(kor);
//			dos.writeChar(eng);
//			dos.writeChar(math);
//			dos.writeChar(sum);
//			dos.writeDouble(avg);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public DataInputStream readScore() throws FileNotFoundException {
		//파일을 DataInputStream을 통해 읽어옴.
		DataInputStream dis = null;
		try{
			dis = new DataInputStream(new FileInputStream("score.txt"));
		return dis;
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return dis;
	}
}
