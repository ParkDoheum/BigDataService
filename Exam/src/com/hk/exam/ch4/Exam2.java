package com.hk.exam.ch4;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성별을 입력 : ");
		String sex = scan.next();
		
		System.out.print("몸무게를 입력 : ");
		int weight = scan.nextInt();
	
		if("남".equals(sex) || "여".equals(sex)) {			
			int s_weight = 100;	//	
			if("여".equals(sex)) { s_weight = 50; }
			
			if(weight > s_weight) {
				System.out.println("비만!");
			} else if(weight < s_weight) {
				System.out.println("저체중!");
			} else {
				System.out.println("정상");
			}
		} else {
			System.out.println("잘 못 입력하셨습니다!!");
		}
		
	}
}
