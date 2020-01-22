package com.hk.exam.ch4;

public class ExamFor {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d, ", i);
		}		
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				System.out.printf("%d", i);	
			} else {
				System.out.printf("%d, ", i);	
			}
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			System.out.print(i);
			if(i<10) {
				System.out.print(", ");	
			}
		}
		System.out.println();
		for(int i=1; i<=10; i++) {
			if(i>1) { //if(i !=1)
				System.out.print(", ");	
			}
			System.out.print(i);			
		}
	}
}








