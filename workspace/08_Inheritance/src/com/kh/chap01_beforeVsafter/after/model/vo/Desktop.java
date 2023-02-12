package com.kh.chap01_beforeVsafter.after.model.vo;
			
			//후손				조상
			//자손				부모
			//하위				상위
public class Desktop extends Product{
	
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		//받아온 매개변수값을 가지고 부모클래스인 Product에 있는 필드를 초기화해야함.
		
		//1. 부모필드에 직접 접근하여 값을 초기화.(잘 쓰지 않음)
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		//2. 부모클래스의 setter메서드 사용.
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		//3. 부모생성자를 호출.(단, 반드시 첫줄에 작성)
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	//오버라이딩 : 부모클래스의 메소드를 내 입맛대로 바꾸는 것.
	public String information() {
		
		//return super.getBrand() +" "+ super.getpCode()+ " ......get메서드 활용도 가능.
		return super.informatin()+" "+allInOne;
	}
	

}
