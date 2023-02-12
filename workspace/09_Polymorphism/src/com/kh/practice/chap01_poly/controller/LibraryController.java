package com.kh.practice.chap01_poly.controller;

import java.util.Arrays;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	
	
	public Book[] serachBook(String keyword) {
		Book[] origin = new Book[5];
		int count = 0;
		for(int i = 0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) { //contains는 문자열 안에 키워드가 포함되어있으면 true, 없으면 false
				origin[count++] = bList[i]; 
			}
		}
		Book[] copys = Arrays.copyOf(origin, count);// count 까지 배열 복사
		return copys; 	
	}
	
	public int rentBook(int index) {
		int result = 0;
		if(bList[index] instanceof AniBook) {
			if(((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		}else {
			if(((CookBook)bList[index]).isCoupon()) {
				int couponcount = mem.getCouponCount();
				mem.setCouponCount(++couponcount);
				result = 2;
			}
		}
		return result;
	}
}
