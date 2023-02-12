package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		System.out.println(arr); //클래스 이름과 주소값 출력
		System.out.println(arr.length);
		System.out.println(arr[0]);
		
		arr[0] = new Phone();
		System.out.println(arr[0]);
		arr[0].setName("아이폰");
		System.out.println(arr[0].getName());
		
		//System.out.println(arr[1].getName()); //null로 되어있어서 초기화 해야함
		arr[0].setSeries("12pro");
		arr[0].setBrand("애플");
		arr[0].setPrice(1_500_000);
		arr[1] = new Phone("갤럭시", "10", "삼성", 900_000);
		arr[2] = new Phone("아이폰", "11pro", "애플", 1_400_000);
		
		//반복문 돌면서 info()호출해서 console창에 출력.
		//총 가격 : xx원
		//평균 가격 : xx원
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].info());
			sum += arr[i].getPrice();
		}
		System.out.println("총 가격 : "+sum+"원");
		System.out.println("평균 가격 : "+(sum / arr.length)+"원");
	}

}
