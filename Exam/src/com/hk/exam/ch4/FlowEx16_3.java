package com.hk.exam.ch4;

public class FlowEx16_3 {
	public static void main(String[] args) {
		int starCount = 5;
		for(int i=starCount; i>0; i--) {
			for(int z=1; z<=starCount; z++) {
				if(z<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
