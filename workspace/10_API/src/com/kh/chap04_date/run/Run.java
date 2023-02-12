package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * java.util.Date 클래스
		 * 	- 날짜와 시간에 대한 정보를 담을수 있는 클래스.
		 * 	- 자바 개발 초창기에 급하게 만든 완성도가 높지 않은 클래스(다국적으로 쓰기도 적합하지 않음.)
		 * 
		 */
		
		// 기본생성자를 통해 Date객체를 생성 -> 현재 날짜 및 시간을 가지고 옴.
		Date today = new Date();
		//System.out.println("기본생성자 : "+today);
		
		// 내가 원하는 날짜
		// 방법 1. 매개변수 생성자를 통해 변경
		// Date date1 = new Date(2022, 7, 18) //Deprecated : 권장하지 않음.
		// 년도 -> 내가 전달한 년도 +1900
		
		
		Date date1 = new Date(2022 - 1900, 7-1, 18);
		//System.out.println(date1);
		
		// 내 입맛대로 출력 형식을 지정하는 방법.
		// java.text.SimpleDateFormat
		
		// 1. 형식을 지정하면서 SimpleDateFormat 객체 생성.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		// 2. sdf 객체에서 제공하는 format 메서드 호출시 Date 객체전달. -> 포맷에 지정된 String으로 변환됨.
		
		String formateDate = sdf.format(date1);
		System.out.println(formateDate);
		
	}

}
