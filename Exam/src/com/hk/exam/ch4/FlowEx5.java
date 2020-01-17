package com.hk.exam.ch4;

public class FlowEx5 {

	public static void main(String[] args) {
		

		//score 값이 90이상이면 grade에 "A"저장
		//98점 이상이면 opt 에 "+"를 저장
		//94점 미만이면 opt 에 "-"를 저장
		//나머지 opt 에 "0"를 저장
		
		//score 값이 80이상이면 grade에 "B"저장
		//88점 이상이면 opt 에 "+"를 저장
		//84점 미만이면 opt 에 "-"를 저장
		//나머지 opt 에 "0"를 저장
		
		//score 값이 70이상이면 grade에 "C"저장
		
		
		//"당신의 학점은 (grade값)(opt값) 입니다."
		
		
		//점수 받는다
		int score = 72;
		String grade = "";
		String opt = "0";
				
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else {
			grade = "C";
		}
		
		int oneValue = score % 10;
		if(oneValue >= 8) {
			opt = "+";
		} else if(oneValue < 4) {
			opt = "-";
		}
		
		System.out.printf("당신의 학점은 %s%s 입니다.", grade, grade.equals("C") ? "" : opt);

	}

}
