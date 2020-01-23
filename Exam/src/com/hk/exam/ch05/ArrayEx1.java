package com.hk.exam.ch05;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] arr = {50, 60, 70, 80, 90};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		for(int i : arr) {
			System.out.println(i);
		}
		
		String[] names = {"권종범", "김강일", "김건태"};
		for(String nm : names) {
			System.out.println(nm);
		}
		System.out.println();
		for(int i=0; i<names.length; i++ ) {
			System.out.println(names[i]);
		}
		
		//정수값 5개를 저장할 수 있는 정수형 배열 생성
		//0 : 50
		//1 : 60
		//2 : 70
		//3 : 80
		//4 : 90
		
		//for문을 활용하여 각 방의 값을 출력해주세요
		//ex ) 
		//i:0 > 50
		//i:1 > 60
		//.....

	}

}




