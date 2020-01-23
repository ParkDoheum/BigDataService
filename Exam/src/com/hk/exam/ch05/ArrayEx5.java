package com.hk.exam.ch05;

public class ArrayEx5 {

	public static void main(String[] args) {		
		int[] score = {100, 88, 100, 100, 90};		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		double avg = (double)sum / score.length;		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
	}
}
