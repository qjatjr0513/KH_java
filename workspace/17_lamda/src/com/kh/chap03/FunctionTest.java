package com.kh.chap03;

import java.util.ArrayList;
import java.util.function.*;

import com.kh.lamda.Product;

public class FunctionTest {
	/*
	 * Function인터페이스 특징
	 * 1. 타입 변환
	 * ex) 컬렉션에서 특정값만 뽑거나, 연산할때 사용됨 (js map)
	 */
	public static void main(String[] args) {
		Product p = new Product("갤럭시 z플립4", 13500000, 1000);
		
		//1) Function<T , U> : T형을 인자로 받아서 U값을 리턴
		// Product객체에서 가격만 빼기
		Function<Product , Integer> function = (product) -> {
			return product.getPrice();
		};
		int price = function.apply(p);
		System.out.println(price);
		
		//2) BiFunction<T, U, R> : T , U 두개를 인자로 받고, R을 리턴
		BiFunction<Integer , Integer , Double> biFunction = (num1 , num2) -> {
			return (double) num1*num2;
		};
		double totalprice = biFunction.apply(p.getPrice(), p.getStock());
		System.out.println("z플립4 100대의 가격은 "+totalprice+"입니다.");
		
		//그외
		//3)xxxFunction<T> : XXX를 인자로 받아서 T형을 리턴.
		//4)XXXtoYYYFunction : xxx를 인자로 받아서 yyy를 리턴
		//5)toXXXFunction<T> : T를 받아서 XXX를 리턴
		//6)toXXXBiFunction<T,U> : T, U를 인자로 받아서 XXX를 리턴.
		
		// 객체배열을 통한 람다식 실습.
		// 1) 핸드폰 객체 배열 리스트 만들기
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 z플립4",1350000, 55));
		pList.add(new Product("갤럭시 z플립3",1000000, 20));
		pList.add(new Product("갤럭시 z폴드4",1800000, 80));
		pList.add(new Product("갤럭시 z폴드3",1400000, 15));
		pList.add(new Product("아이폰 14",2000000, 0));
		
		// 2) 해당상품을 모두~팔게되면 남는 이윤을 계산할수 있는 람다식 생성.(Product.가격 * Product.재고)
		// Product를인수로 받아서 연산을하고, 그 결과를 int으로 반환할수있는 람다식 함수가 필요함.
		ToIntFunction<Product> toIntFunction = product -> {
			return product.getPrice() * product.getStock();
		};
		//4) 일반메서드 호출
		printProduct(pList,toIntFunction);
	}
	// 3) 생성한 람다식 함수를 활용한 객체배열 관리용 일반메서드 생성.
	public static void printProduct(ArrayList<Product> pList, ToIntFunction<Product> toIntFunction) {
		for(Product p : pList) {
			System.out.println(p.getpName()+"의 현재 가격은 "+p.getPrice()+"원 이며, 모두 판매했을때"
					+ "이윤은 "+toIntFunction.applyAsInt(p));
		}
	}

	
	
	
	
	
	
	
}
