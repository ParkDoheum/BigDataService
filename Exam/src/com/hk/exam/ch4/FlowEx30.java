package com.hk.exam.ch4;

public class FlowEx30 {
	public static void main(String[] args) {		
		//while사용 무한루프
		//1, 2, 3, ..... 계속 중첩 더할껀데 
		//더한 값이 100 이상이 되면 더이상 안 더해지게
		int i=0, sum=0;
		while(true) {
			sum += ++i;
			if(sum>=100) { break;}
		}		
		System.out.printf("i:%d, sum:%d\n", i, sum);
	}
}
