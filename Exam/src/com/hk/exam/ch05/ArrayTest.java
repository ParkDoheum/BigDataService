package com.hk.exam.ch05;

public class ArrayTest {
	public static void main(String[] args) {
		int[] intArr = new int[50];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = i+1;
		}
		System.out.println(intArr[0]);
		
		int[] intArr2 = {5,7,10,11,20};
		
		int[] intArr3 = new int[5];
		intArr3[0] = 5;
		intArr3[1] = 7;
		intArr3[2] = 10;
		intArr3[3] = 11;
		intArr3[4] = 20;
		
	}
}
