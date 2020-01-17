package com.hk.exam.ch4;

public class FlowEx4 {
	public static void main(String[] args) {
		int score = 95;
		String grade = "";
		
		if(score > 100 || score < 0) {
			System.out.println("잘 못 입력하셨습니다.");
			return;
		}
		
		if(score >= 90) {
			
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		//점수를 입력 받습니다. (score에 저장)
		
		//score 값이 90이상이면 grade에 "A"저장
		//score 값이 80이상이면 grade에 "B"저장
		//score 값이 70이상이면 grade에 "C"저장
		//score 값이 70미만이면 grade에 "D"저장
		
		//"당신의 학점은 (grade값) 입니다."
	}
}






