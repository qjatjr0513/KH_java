package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pd = new Product();
		pd.setpName("아이폰");
		pd.setPrice(1700000);
		pd.setBrand("애플");
		
		pd.information();
	}

}
