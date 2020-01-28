package com.hk.exam.ch05;

public class ArrayEx3_2 {

	public static void main(String[] args) {
		String[] arr = {"가", "나", "다", "라", "마", "바", "z"};
		
		String temp = arr[arr.length - 1];
		arr[arr.length - 1] = arr[0];
		arr[0] = temp;
		
		for(String str : arr) {			
			System.out.println(str);
		}
		
	}

}
