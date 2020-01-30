package com.hk.exam.ch05;

//버블 정렬
public class ArrayEx3_5 {

	public static void main(String[] args) {
		//20개의 정수값 저장할 수 있는 배열 생성하시구요.
		//1~20 숫자를 각각 순차적으로 넣어주세요.
		int[] arr = new int[20];
				
		for(int i=0; i<arr.length ; i++) {
			arr[i] = i+1;
		}
			
		for(int i=0; i<arr.length; i++) {
			int rVal = (int)(Math.random() * arr.length) ;
			
			int temp = arr[i];
			arr[i] = arr[rVal];
			arr[rVal] = temp;
		}		
		
		
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		
	}

}




