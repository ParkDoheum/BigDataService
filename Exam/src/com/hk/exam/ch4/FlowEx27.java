package com.hk.exam.ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 1;
		int sum = 0;
		boolean flag = true;
		while(true) {
			System.out.print("합계를 구할 숫자를 입력(끝내려면 0 입력) :");
			num = scan.nextInt();
			sum = sum + num;
			if(num == 0) {
				break;
			}
		}
		
		System.out.println("종료!! :" + sum);
		
		
		
		//>>100
		//>>200
		//>>300
		//>>0
		
		//합계는 600입니다.

	}

}




