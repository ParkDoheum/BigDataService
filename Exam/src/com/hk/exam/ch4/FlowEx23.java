package com.hk.exam.ch4;

public class FlowEx23 {

	public static void main(String[] args) {
		//while 이용
		
		int i = 50_000_000;
		
		while(i > 0) {		
			i--;
			System.out.printf("%d - I can do it\n", i);
		}
		//4 - I can do it.
		//3 - I can do it.
		//2 - I can do it.
		//1 - I can do it.
		//0 - I can do it.
		

	}

}
