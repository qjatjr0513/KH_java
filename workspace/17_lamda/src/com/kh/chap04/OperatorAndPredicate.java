package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.kh.lamda.Product;

public class OperatorAndPredicate {
	//Operator인터페이스 특징
	//1. 단순연산시 사용
	//2.받아온 타입 혹은 인자를통해 계산을하고 해당타입 그대로 반환
	
	//Predicate 특징
	//1. 매개변수로 넘어온 값을 검증할때 사용
	//2. 받아온 타입을 확인하고 boolean값을 반환
	
	
	
	
	public static void main(String[] args) {
		
		//Predicate<t> : T형을 인자로 받아서 true,false값을 리턴
		// Product클래스를 인자로 받고 재고가있으면 true , 없으면 false반환
		Predicate<Product> checkStock = product -> product.getStock() > 0;
		
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 z플립4",1350000, 55));
		pList.add(new Product("갤럭시 z플립3",1000000, 20));
		pList.add(new Product("갤럭시 z폴드4",1800000, 80));
		pList.add(new Product("갤럭시 z폴드3",1400000, 15));
		pList.add(new Product("아이폰 14",2000000, 0));
		
		for(Product p : pList) {
			if(checkStock.test(p)) {
				System.out.println(p.getpName()+"상품은 현재 재고가 있습니다.");
			}else {
				System.out.println(p.getpName()+"상품은 현재 재고가 없습니다.");
			}
		}
	}

}
