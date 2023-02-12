package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		Car c = new Car("k5", 20.8, "자동차", 4);
		Ship s = new Ship("원양어선", 3, "어선", 1);
		Airplane a = new Airplane("보잉 774", 0.02, "여객기", 16, 5);
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
	}

}
