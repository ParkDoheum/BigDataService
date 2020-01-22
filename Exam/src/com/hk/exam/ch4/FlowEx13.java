package com.hk.exam.ch4;

public class FlowEx13 {

	public static void main(String[] args) {
		//1~10까지의 중첩값을 출력
		int sum = 0;
		for(int i=1; i<=10; i++) {
//			sum = sum + i;		
			sum += i;
		}
		System.out.println(sum);
		
	}

}
