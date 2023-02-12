package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;
import com.kh.practice.point.model.vo.Rectangle;

public class CircleController {
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		//받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
		// 면적 : PI * 반지름 * 반지름

		c.setX(x); //초기화
		c.setY(y);
		c.setRadius(radius);
		String result = c.toString();
		result += (" / "+(Math.PI * radius * radius));
		return "면적 : "+result;
	}
	
	public String calcCircum(int x, int y, int radius) {
		//받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		// 둘레 : PI * 반지름 * 2
		return "둘레 :"+c.toString()+" / "+(Math.PI * radius * 2);
	}
}
