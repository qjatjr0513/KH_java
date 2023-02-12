package com.kh.chap02;

import java.util.function.*;

import com.kh.lamda.Product;

public class SupplierTest {
	/*
	 * Supplier인터페이스 특징
	 * 1. 주로 생산자 역활을 띈 함수를 작성할때 사용.
	 * 2. 매개값 없고 리턴값은 있음.
	 * 3. 내부적으로 getXXX()메서드 존재.
	 */
	
	//1) Supplier<T> : T형 반환
	static Supplier<Product> supplier = () -> {return new Product("갤럭시z플립4",100000,100);};
	
	//2) xxxSuplier : xxx형 반환
	static BooleanSupplier isTrue = () -> false;
	
	public static void main(String[] args) {
		System.out.println(supplier.get().getpName());
		
		System.out.println("z플립4 살가치가 있습니가? "+isTrue.getAsBoolean());
	}
}
