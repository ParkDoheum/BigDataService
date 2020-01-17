package com.hk.exam;

public class PrintEx1 {
	public static void main(String[] args) {
		int age = 35;
		String location = "서울";
				
		System.out.println(
				"저의 나이는 "	+ age + "세이고, 사는 곳은 " 
				+ location + "입니다."
		);
		
		System.out.printf("저는 %d세이고, %s에 삽니다.", age, location);
		
		/*
		System.out.println();
		System.out.print("");		
		System.out.printf("", "");
		
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		*/
	}
}
