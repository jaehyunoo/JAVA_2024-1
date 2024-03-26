/*
 * 작성일 : 2024년 3월 26일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 조건식 연습.
 * 		 숫자와 연산자를 입력 받아
 * 		사칙연산 프로그램을 작성하시오
 * 		입력 방식 : 3 + 4 (띄어쓰기로 구분)
 * 		
 * 
 * 
 * 
 * 문제분석 : 	숫자 연산자 숫자를 입력 받아
 * 			해당 연산자에 따른 결과를 출력한다.
 *
 */
import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
	
		
		System.out.print("띄어쓰기로 구분해서 계산식을 입력하시오( ex. 3 + 4 ) : ");
		
		int num1 = stdIn.nextInt();
		String str = stdIn.next();
		int num2 = stdIn.nextInt();
		
		char op = str.charAt(0); // 한문자를 바로입력받기는 어려우므로 문자열로입력받아 문자열의 0번지를 변수에 저장한다.
		double result = 0;
		
		
		
		switch (op)
		{
			case '+':
				result = num1 + num2;
				break;
				
			
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
				result = num1 * num2;
				break;
				
				
			
			case '/':
				 if (num2 != 0) {
	                    result = (float)num1 / num2;
	                } 
				 else {
	                    System.out.println("0으로 나눌 수 없습니다.");
	                    while(true) {
	                    	System.out.print("다시 입력하시오 : ");
	                    	num2 = stdIn.nextInt();
	                    	
	                    	if (num2 != 0) {
	                    		result = (float)num1 / num2;
	                    		break;
	                    	}
				 		}
	            }
				break;
				
			
			default:
				System.out.println("잘못된 연산자입니다");
				break;
		
		
		
		}
		
		System.out.println("결과 = " + result);
		
		

	}

}
