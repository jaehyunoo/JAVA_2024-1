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

public class SwitchTest2 {

	public static void main(String[] args) {
Scanner stdIn = new Scanner(System.in);
		
		// 알고싶은 계절의 달을 입력한다.
		
		System.out.print("월을 입력하세요(영문자,첫 문자는 대문자로) : ");
		String month = stdIn.next();
		String  MtoS;
		
		switch (month) // 괄호안은 정수식과 정수값이 들어감
		{
			// if(month == 12 || month == 1 || month == 2 )
			case "December":
			case "January":
			case "February":
				MtoS = "겨울입니다.";
				break;
			
			case "March":
			case "April":
			case "May":
				MtoS = "봄입니다.";
				break;
				
			case "June":
			case "July":
			case "August":
				MtoS = "여름입니다.";
				break;
			
			case "September":
				System.out.print("멋진 9월과 ");
			case "October":
				System.out.print("아름다운 10월과 ");
			case "November":
				System.out.print("낙엽의 11월은 ");
				MtoS = "가을입니다.";
				break;
			
			default:
				MtoS = "1~12월을 벗어난 달입니다.";
				break;
			
		
		}
		 System.out.println(MtoS);

	}


	}

