package com.hk.exam.ch05;

public class ArrayEx3_6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		//1~30 사이의 랜덤한 수를 중복되지 않게 arr에 10개 담는다.
		int i=0; 
		while(i<arr.length) {
			arr[i] = (int) (Math.random() * 10) + 1;
			int j=0;
			while(j<i) {
				if(arr[j++] == arr[i]) {
					i--;
					break;
				}
			}
			i++;
		}
		
		
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			
			
			for(int z=0; z<i; z++) {
				if(arr[z] == arr[i]) {
					i--;
					break;
				}
			}
		}
		*/
		/*
		//while, for문을 활용한 방법
		int i = 0;
		while(i < arr.length) {
			int rVal = (int) (Math.random() * 10) + 1;
			
			boolean isOk = true;
			for(int z=0; z<i; z++) {
				if(arr[z] == rVal) {
					isOk = false;
					break;
				}
			}
			
			if(isOk) { 
				arr[i++] = rVal;
			}
		}
		*/
		
		//이름 붙은 반복문을 활용한 반복
		/*
		int i = 0;
		Parent: while(i < arr.length) {
			int rVal = (int) (Math.random() * 10) + 1;
			
			for(int z=0; z<i; z++) {
				if(arr[z] == rVal) {
					continue Parent;
				}
			}
			arr[i++] = rVal;
		}
		 */				
		
		for(int v : arr) {
			System.out.print(v + ", ");
		}

	}

}
