package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] arr = new int [6]; 
	private int random;
	private int index;
	public Lotto() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		this.index = arr[index];
	}

	public void setIndex(int index) {
		this.index = arr[index];
	}
	
	
	public int getIndex(int index) {
		return arr[index];
	}
	
	public void information() {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(getIndex(i)+" ");
		}
	}
}
