package com.hk.exam.ch05;

public class ArrayEx3_1 {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C", "D", "E"};
		
		String[] copyArr = new String[arr.length + 1];
		copyArr[arr.length] = "Z";
		
		for(int i=0; i<arr.length; i++) {
			copyArr[i] = arr[i];
		}
		
		for(String str : copyArr) {
			System.out.println(str);
		}

	}

}
