/*
 * 작성일 : 2024년 3월 26일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : swith case 문
 * 
 * 
 * 문제분석 : 	swith문 연습.
 * 			월을 입력받아 해당 계절을 출력하시오.
 * 			3,4,5월 => 봄
 * 			6,7,8월 => 여름
 * 			9,10,11월 => 가을
 * 			12,1,2월 => 겨울
 */

import java.util.Scanner;
public class SwitchTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 알고싶은 계절의 달을 입력한다.
		
		System.out.print("달 입력 : ");
		int month = stdIn.nextInt();
		// String MtoS
		
		switch (month) // 괄호안은 정수식과 정수값이 들어감
		{
			// if(month == 12 || month == 1 || month == 2 )
			case 12:
			case 1:
			case 2:
				System.out.println("겨울입니다");
				// MtoS = "겨울입니다.";
				break;
			
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다");
				// MtoS = "봄입니다.";
				break;
				
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다");
				// MtoS = "여름입니다.";
				break;
			
			case 9:
			case 10:
			case 11:
				System.out.println("가을입니다");
				// MtoS = "가을입니다.";
				break;
			
			default:
				System.out.println("1~12월을 벗어난 달입니다.");
				// MtoS = "1~12월을 벗어난 달입니다.";
				break;
			
		
		}
		// System.out.println(MtoS);

	}

}
