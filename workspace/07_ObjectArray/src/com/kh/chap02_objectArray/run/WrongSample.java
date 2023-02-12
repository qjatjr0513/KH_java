package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {
	
	public static void main(String[] args) {
		
		Phone [] arr = new Phone[3];  //3칸짜리 객체배열 선언
		
		//for(int i = 0; i<=arr.length; i++) {//i<=arr.length -> java.lang.ArrayIndexOutOfBoundsException(i값 0,1,2,3)
			//arr[i] = new Phone(); 
			//System.out.println(arr[i].getName()); //java.lang.NullPointerException
			
			//첫번째 문제점 : 단지 Phone 객체 3개를 담기 위한 공간을 셋팅만 했을 뿐
			//				각 인덱스별 Phone객체를 생성하지 않아 null이 담긴상태.
			//				null임에도 불구하고 접근하려했기 때문에 NullPointerException 발생
			
			//두번째 문제점 : 부적절한 index가 제시되므로 ArrayIndexOutOfBoundsException 발생.
			//				해결방법은 for(int i = 0; i< arr.length; i++)로 수정하면 됨.
		//}
		
		// 수정된 코드
		for(int i = 0; i<arr.length; i++) { //i 값 0,1,2
			arr[i] = new Phone(); //각 인덱스별 Phone객체를 생성
			System.out.println(arr[i].getName()); 
		}
	}
}