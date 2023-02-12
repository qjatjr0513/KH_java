package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book bk1 = new Book("어린왕자", "프랑스", "앙투안 드 생택쥐페리");
		Book bk2 = new Book("어린왕자", "프랑스", "앙투안 드 생택쥐페리",25000, 10);
		bk1.inform();
		bk2.inform();
	}

}
