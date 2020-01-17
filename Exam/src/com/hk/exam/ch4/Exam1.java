package com.hk.exam.ch4;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("몸무게를 입력해 주세요 : ");
		int weight = scan.nextInt();
		
		final int STAND_WEIGHT = 50;
		
		if(weight > STAND_WEIGHT) {
			System.out.println("비만");		
		} else if(weight < STAND_WEIGHT) {
			System.out.println("저체중");
		} else {
			System.out.println("정상");
		}
		
		scan.close();
	}
}
