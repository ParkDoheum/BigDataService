package com.hk.exam;

public class PrintEx2 {
	public static void main(String[] args) {
		final float PI = 3.16f;

		String a = "" + 1 + 1;
		System.out.println(a);
		String b = 1 + 1 + "";
		System.out.println(b);

		
		System.out.printf("PI는 %.1f입니다 %.3f지롱" + "하하하", PI, 3.333);
		//"PI는 3.16입니다.";
	}
}
