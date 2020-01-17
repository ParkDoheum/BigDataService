package com.hk.exam.ch3;

public class OperatorEx19 {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		System.out.printf("%d을 %d로 나누면, ", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d", (x / y), (x % y));

		System.out.println();
		int num = 3;

		if (num % 2 == 0) {
			System.out.printf("%d는 짝수이다.", num);
		} else {
			System.out.printf("%d는 홀수이다.", num);
		}
		
		//절대값 만들기
		int abs = 5;
		if(abs < 0) {
			abs *= -1;
		}		
		System.out.printf("abs : %d\n", abs);
		
		

	}
}
