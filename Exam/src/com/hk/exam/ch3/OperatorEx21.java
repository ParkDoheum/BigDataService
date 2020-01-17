package com.hk.exam.ch3;

public class OperatorEx21 {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 10;
		
		if (num1 != num2) {
			System.out.println("num1과 num2는 다르다");
		}
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str2.equals(str1));
	}
}
