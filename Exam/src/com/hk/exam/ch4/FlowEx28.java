package com.hk.exam.ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rValue = (int) (Math.random() * 100) + 1;
		int val = 0;
		do {			
			System.out.print("숫자를 입력해 주세요: ");	
			val = scan.nextInt();
			
			if(val < rValue) {
				System.out.println("UP");
			} else if(val > rValue){
				System.out.println("DOWN");
			}
		}while(val != rValue);

		System.out.println("정답!");
		scan.close();
	}

}






