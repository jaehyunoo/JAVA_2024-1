/*
 * 작성일 : 2024년 3월 22일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 내포된 if문 실습.
 * 		 점수를 입력받아 학점을 출력하시오.
 * 		 점수는 0~100점 사이 입니다.
 * 		 점수 범위를 벗어나면 "잘못된 점수입니다." 출력하시오.
 * 
 * 문제분석 : 	조건식 연습.
 * 			월을 입력받아 해당 계절을 출력하시오.
 * 			3,4,5월 => 봄
 * 			6,7,8월 => 여름
 * 			9,10,11월 => 가을
 * 			12,1,2월 => 겨울
 */

import java.util.Scanner;
public class ComConditionTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 알고싶은 계절의 달을 입력한다.
		
		System.out.print("달 입력 : ");
		int month = stdIn.nextInt();
		
		if (month >= 1 && month <= 12) {
			
			// 3~5월 봄출력
			if(month >= 3 && month <= 5) {
				System.out.println("봄입니다.");
			}
			
			// 6~8월 여름출력
			else if(month >= 6 && month <= 8) {
				System.out.println("여름입니다.");
			}
			
			// 9~11월 가을출력
			else if(month >= 9 && month <= 11) {
				System.out.println("가을입니다.");
			}
			
			
			// 아니면(나머지는)
			else {
				System.out.println("겨울입니다");
			}
	}
			
	else {
			System.out.println("해당 월은 없습니다.");		
	
	}


	}


}

