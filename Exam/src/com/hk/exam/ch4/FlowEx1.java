package com.hk.exam.ch4;

public class FlowEx1 {
	//if문, 조건식
	public static void main(String[] args) {		
		/*
		 * A > B : A가 B보다 초과
		 * A >= B : A가 B보다 이상
		 * 미만
		 * 이하
		 * 
		 */
		int num1 = 5;
		
		/*		
		if(num1 >= 5) {
			System.out.println("num1이 5보다 크다");
		} else {
			System.out.println("num1이 5보다 작다");
		}
		*/
		
		int num2 = 3;
		
		if(num1 == 5) {
			System.out.println("num1이 5이다");		
		} else if (num2 < 5) {
			System.out.println("num1이 5보다 작다");
		} else {
			System.out.println("num1이 5보다 크다");
		}
		
		
	}
}
