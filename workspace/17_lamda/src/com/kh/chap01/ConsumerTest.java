package com.kh.chap01;

import java.util.function.*;

import com.kh.lamda.Product;

public class ConsumerTest {
	
	/*
	 * Consumer 인터페이스 특징
	 * 1. 주로 소비자역활을 띈 함수를 작성할때 사용.
	 * 2. 매개변수가 있고, 리턴값은 없음.
	 * 3. 내부적으로 accept()메서드 한개만 구현되지 않은형태로 존재
	 */
	// 컨슈머인터페이스 소개
	// 1) Consumer<T> : 인자값 1개
	static Consumer<String> c1 = (str) -> System.out.println(str+"구매 하였습니다.");
	
	// 2) xxxConsumer : xxx인자값1개 리턴x
	static IntConsumer c2 = (point) -> System.out.println("현재 귀하의 계좌잔고는 "+point+"입니다.");
	
	// 3) BiConsumer<T , U > : 인자값 2개를 받음.
	static BiConsumer<String , Integer> c3 = 
			(product , price) -> System.out.println(product+"상품의 가격은 "+price+"입니다.");
	
	// 4)ObjXXXConsumer<T> : T타입인자 1개+ XXX타입 인자값 1개를 가짐.		
	static ObjIntConsumer<Product> c4 = (product , price)
			-> System.out.println(product.getpName()+"의 가격은 "+price);
	public static void main(String[] args) {
		 c1.accept("갤럭시 z플립4");
		 c2.accept(500000);
		 c3.accept("갤럭시 z플립4", 1350000);
		 c4.accept(new Product("갤럭시 z플립4", 0 , 1), 1350000);
	}

}
