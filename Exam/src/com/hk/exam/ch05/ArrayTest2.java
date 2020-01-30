package com.hk.exam.ch05;

//2차원 배열
public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[][] arr2 = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 31, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		for(int i=0; i<arr2.length; i++) {
			for(int z=0; z<arr2[i].length; z++) {
				if(z != 0) {
					 System.out.print(", ");
				}
				System.out.print(arr2[i][z]);
			}
			System.out.println();
		}
		
		/*
		for(int i=0; i<(arr2.length * arr2[0].length); i++) {			
			int f = i / arr2[0].length;
			int e = i - (arr2[0].length * f); 
			
			System.out.print(arr2[f][e] + ", ");
			
			if((i + 1) % arr2[0].length == 0) {
				System.out.println();
			}
		}
*/
	}

}
