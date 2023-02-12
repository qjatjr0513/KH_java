package com.kh.chap02_String.controller;

public class D_StringBufferAndBuilder {
	/*
	 * 	String은 불변클래스.
	 * 	StringBuffer과  StringBuilder은 Mutable(변하는) 클래스
	 * 
	 * 	String클래스는 문자열 연산이 빈번하게 일어나는 알고리즘에서 메모리이슈가 있어서,
	 * 	그것을 해결하기 위해 StringBuilder와 StringBuffer클래스가 나옴.
	 * 
	 * 	StringBuilder와 StringBuffer은 기본적으로 동일한 메서드를 지닌다.
	 * 	차이점은 '동기화'유무
	 * 	추후 배우게될 'Thread'개념이 적용되어있음.
	 * 
	 * 	StringBuffer은 멀티스레드 환경에서 유용.
	 * 	StringBuilder은 단일스레드 환경에서 유용.
	 * 
	 */
	
	public void method() {
		String str = "Hello";
		str += "World";
		
		StringBuffer sb = new StringBuffer("Hello"); //원래 주소(되도록이면 StringBuffer를 사용해야함(대부분 멀티스레드로 개발하기 때문))
		System.out.println("변경전 sb주소값 : "+System.identityHashCode(sb));
		sb.append("World,"); //새로 생성하지않고 원래 주소 그대로 사용(가장 많이 사용됨)
		System.out.println("변경후 sb주소값 : "+System.identityHashCode(sb));//주소값 동일
		
		StringBuilder sb2 = new StringBuilder("Hello");
		System.out.println("변경전 sb2주소값 : "+System.identityHashCode(sb2));
		sb2.append("World"); //이것도 주소값 변하지 않음
		System.out.println("변경후 sb2주소값 : "+System.identityHashCode(sb2)); //주소값 동일
		
		//유용한 메서드들.
		//내가 원하는 인덱스의 문자를 없애주는 메서드.
		//sb.deleteCharAt(sb.length() -1); //sb의 길이를 반환하는 메서드. //마지막 ,없애줄 때 사용
		System.out.println(sb);
		
		System.out.println("o의 마지막 위치는 ? "+sb.lastIndexOf("o"));
		
		// StringBuilder.delete(int start, int end)
		//문자열의 start부터 end의 문자까지 삭제시키는 메서드
		sb.delete(0, sb.length()-1); 
		
		System.out.println(sb);
	}
}
