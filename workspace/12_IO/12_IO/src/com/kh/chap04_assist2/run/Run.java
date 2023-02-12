package com.kh.chap04_assist2.run;

import com.kh.chap04_assist2.model.dao.ObjectDao;
import com.kh.chap04_assist2.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		// 객체단위로 입출력 할 수 있는 기능을 제공하는 보조 스트림.
		//ObjectInputStream / ObjectOutputStream

		ObjectDao od = new ObjectDao();
		//od.fileSave("phone.txt"); // 객체단위로 기록되어 있어서 깨져보입니다. 단, 정상적으로 기록된것.
		//od.fileRead();
		
		ObjectsDao od2 = new ObjectsDao();
		//od2.fileSave("phoneList.txt");
		od2.fileRead();
	}

}
