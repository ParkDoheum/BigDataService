package com.hk.exam.ch05;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] copyArr = new int[5];
		
		
		
		for(int i=0; i<arr.length; i++) {
			copyArr[i] = arr[i];
		}
		
		System.out.println(arr == copyArr);
		System.out.println(arr[1]);
		System.out.println(copyArr[1]);

	}

}
