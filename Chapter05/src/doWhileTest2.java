/*
 * 작성일 : 2024년 4월 5일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : do while문
 * 
 * 
 * 문제분석 : 	do while문 안에 switch문 연습.
 * 			월을 입력받아 해당 계절을 출력하시오.
 * 			3,4,5월 => 봄
 * 			6,7,8월 => 여름
 * 			9,10,11월 => 가을
 * 			12,1,2월 => 겨울
 */

import java.util.Scanner;

public class doWhileTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		int month;
		
		do {
			System.out.print("월 입력(종료 = 0) : ");
			month = stdIn.nextInt();
				switch(month) {
					case 3:
					case 4:
					case 5:
						System.out.println("봄입니다.");
						break;
					case 6:
					case 7:
					case 8:
						System.out.println("여름입니다.");
						break;
					case 9:
					case 10:
					case 11:
						System.out.println("가을입니다.");
						break;
					case 12:
					case 1:
					case 2:
						System.out.println("겨울입니다.");
						break;
					case 0:
						System.out.println("프로그램 종료!");
						break;
					default:
						System.out.println("1부터 12사이의 숫자만 입력해주세요");
				}
				/*
				if(month == 12 || month == 1 || month == 2) {
					System.out.println(month + "는 겨울입니다.");
				}
				else if(month == 3 || month == 4 || month == 5) {
					System.out.println(month + "는 봄입니다.");
				}
				else if(month == 6 || month == 7 || month == 8) {
					System.out.println(month + "는 여름입니다.");
				}
				else if(month == 9 || month == 10 || month == 11) {
					System.out.println(month + "는 가을입니다.");
				}
				else if(month == 0) {
					System.out.println("프로그램 종료 !");
				}
				else {
					System.out.println("1부터 12사이의 숫자만 입력해주세요");
				}
				*/
			
		}while(month != 0);

	}

}
