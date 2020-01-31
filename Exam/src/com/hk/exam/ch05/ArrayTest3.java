package com.hk.exam.ch05;

public class ArrayTest3 {

	public static void main(String[] aaaa) {
		int[][] arr2 = {
				{100, 98, 70},
				{50, 26, 22},
				{30, 31, 30},
				{80, 90, 45},
				{50, 50, 50}
		};
		
		System.out.printf("  \t 합계 \t 평균 \n");
		int total = 0;
		int cnt = 0;
		for(int i=0; i<arr2.length; i++) {
			int eachTotal = 0;
			for(int z=0; z<arr2[i].length; z++) {
				eachTotal += arr2[i][z];
				cnt++;
			}
			double eachAvr = (double)eachTotal / arr2[i].length;
			total += eachTotal;
			System.out.printf("%d \t %d \t %.2f\n", i, eachTotal, eachAvr);
		}
		double totalAvr = (double)total / cnt;
		System.out.printf("종합 \t %d \t %.2f\n", total, totalAvr);

	}

}
