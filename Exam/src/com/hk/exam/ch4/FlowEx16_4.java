package com.hk.exam.ch4;

public class FlowEx16_4 {

	public static void main(String[] args) {
		int starCnt = 5;
		String star = "";
		for(int i=starCnt; i>0; i--) {						
			for(int z=1; z<i; z++) {
				System.out.print(" ");
			}
			star += "*";
			System.out.println(star);
		}

	}

}
