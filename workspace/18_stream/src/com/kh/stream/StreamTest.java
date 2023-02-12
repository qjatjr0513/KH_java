package com.kh.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	/*
	 * Stream?
	 * 스트림은 배열 및 컬렉션에 저장된 요소에 하나씩 접근하여 해당 값을 람다식으로 처리하는 반복자
	 * => jQuery의 each메서드와 비슷한 녀석.
	 * 컬렉션이 요소를 할당하고 관리하는데 목적이 있다면,
	 * 스트림은 요소를 검색, 필터링하거나 값을 처리하는데 목적이 있음.
	 * 
	 * 스트림 특징
	 * 1) 메서드의 매개변수에 람다식 사용가능
	 * 2) 식이 간결해짐. => enum시간에 람다식 쓰기전 메서드 vs 사용한후 메서드 비교
	 * 3) 컬렉션 및 배열을 통한 연산 결과를 얻어오기 용이함.
	 * 
	 */
	public static void main(String[] args) {
		// 스트림 사용방법
		
		// 배열에서의 stream 사용방법.
		String[] sArr = {"삼겹살","깻잎","쌈장","마늘"};
		
		// 1) stream() 메서드를 통한 스트림 객체 선언.
		Stream<String> strStream = Arrays.stream(sArr);
		
		// 2) forEach반복문을 통해 배열요소에 하나씩 접근.
		strStream.forEach(str -> System.out.println(str));
		
		// int형 배열을 선언하여 연산테스트
		int[] iArr = {1,3,5,7,9};
		
		// 1) stream() 메서드를 통해 스트림객체 선언.
		IntStream istream= Arrays.stream(iArr);
		
		// 2) forEach 반복문을 통해 배열 요소에 하나씩 접근
		int sum = 0; // 지역변수 sum 선언. int 배열을 반복하면서 해당 변수에 값을 추가하고 싶음.
		String test = "지역변수"; // 단순히 출력할 용도.
		
		istream.forEach((num) ->{
			System.out.println(test);
			//sum += num; // 에러남
			System.out.println(sum + num);
			/*
			 * 람다식에서 지역변수를 사용하려면 그 값이 final이거나 사실상 값이 할당된 후 바뀌지 않아서 final처럼 사용되는 경우에만 사용가능.
			 * 람다캡쳐링 즉, 지역변수의 값이 람다식 내부에서 바뀌면 안됨.
			 */
		});
		
		// 컬렉션에서 stream 사용방법
		ArrayList<Product> pList = new ArrayList<Product>();
	      pList.add(new Product("갤럭시 z플립4",135,5,"삼성"));
	      pList.add(new Product("갤럭시 z플립3",135,5,"삼성"));
	      pList.add(new Product("갤럭시 z폴드4",100,5,"삼성"));
	      pList.add(new Product("갤럭시 z폴드3",133,5,"삼성"));
	      pList.add(new Product("아이폰 14",200,5,"애플"));
		
		// 1) stream()메서드를 통해 스트림 객체 선언.
		 Stream<Product> proStream = pList.stream();
		 
		 //2) forEach메서드를 통한 각 요소 접근.
		 proStream.forEach(product -> System.out.println(product));
	}

}
