package com.hk.exam.ch05;

public class ArrayEx5_1 {

	public static void main(String[] args) {
		int[] arr = new int[30];
				
		int z = 0;
		while(arr[arr.length-1] == 0) {
			arr[z++] = z * 2;			
		}
		
		for(int i=0; i<arr.length; i++) {			
			System.out.printf("%d - %d\n", i, arr[i]);
		}

	}

}
