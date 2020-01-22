package com.hk.exam.ch4;

import java.util.Scanner;

public class FlowEx28_1 {

	public static void main(String[] args) {
		//1~100사이의 랜덤값 생성 (34)
		//랜덤값을 맞추는 게임
		//값입력 : 20
		//UP
		
		//값입력: 50
		//DOWN
		
		//값입력: 34
		//정답!!!

		int rValue = (int) (Math.random() * 100) + 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		int val = scan.nextInt();
		
		while(val != rValue) {
			if(val < rValue) {
				System.out.println("UP");
			} else {
				System.out.println("DOWN");
			}
			System.out.print("숫자를 입력해 주세요: ");	
			val = scan.nextInt();
		}
		
		System.out.println("정답!");
		scan.close();
	}

}











