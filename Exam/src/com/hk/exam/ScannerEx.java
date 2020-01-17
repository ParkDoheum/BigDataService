package com.hk.exam;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = scan.nextInt();
		System.out.print("이름을 입력해주세요 : ");
		String name = scan.next();
		
		System.out.println("입력하신 정수는 : " + num + "입니다");
		System.out.println("저는 " + name + " 입니다");
	}
}
