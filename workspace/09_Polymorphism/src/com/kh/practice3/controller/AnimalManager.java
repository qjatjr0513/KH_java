package com.kh.practice3.controller;

import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		animals[0] =new Dog("호두", "골든 리트리버", 30);
		animals[1] = new Cat("코코", "브리티쉬숏헤어", "양천구", "회색");
		animals[2] =new Dog("체리", "말티즈", 10);
		animals[3] = new Cat("코우코", "브리티쉬숏헤어", "목동", "회색");
		animals[4] =new Dog("치즈", "말티즈", 5);
		
		for(Animal animal : animals) {
			animal.speak();// 동적 바인딩
			//항상 자손객체에 재정의된 메소드를 찾아간다.
		}
	}

}
