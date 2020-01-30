package com.hk.exam.ch05;

import java.util.Scanner;

public class ArrayEx3_3 {

	public static void main(String[] args) {
		//값을 입력해 주세요 (종료: 0): 3
		//값을 입력해 주세요 (종료: 0): 100
		//값을 입력해 주세요 (종료: 0): 5
		//값을 입력해 주세요 (종료: 0): 0
		
		//3, 100, 5
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[100];
		int i = 0;
		while(true) {
			System.out.print("값을 입력해 주세요 (종료: 0): ");
			int num = scan.nextInt();
			if(num == 0) { break; }
			arr[i++] = num;
		}
		
		for(int z=0; z<(i-1); z++) {
			if(z != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[z]);			
		}
	}

}








