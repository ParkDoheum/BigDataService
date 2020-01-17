package com.hk.exam;

public class VarEx2 {
	
	/*
	 * 형변환 (강제, 자동)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//byte < short < int < long
		
		byte b1 = 10;
		short s1 = 129; //자동형변환
		
		byte b2 = (byte)s1; //강제형변환
		long l1 = 10L;
		int int1 = (int)10L;
		
		System.out.println("s1 : " + s1);
		System.out.println("b2 : " + b2);
		System.out.println("int1 : " + int1);
		
	}
}

