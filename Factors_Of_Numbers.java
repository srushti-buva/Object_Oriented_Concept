package com.tka;

public class Factors_Of_Numbers {
	public static void main(String[] args) {
		int num = 12;
		for(int i = 1; i<= 100;i++) {
			if(num % i ==0) {
				System.out.println(i);
			}
		}
	}

}
