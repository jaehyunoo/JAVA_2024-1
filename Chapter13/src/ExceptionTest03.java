/*
 * 두 정수를 입력 받아 나눗셈의 결과 출력.
 * 0으로 나눌 경우 예외처리.
 * 입력받는 수가 정수가 아닐 경우 예외 처리 => 실수, 문자를 입력 할 수 있다.
 * 
 * 예외가 발생하는 부분은 입력 받는 부분과 나눗셈 하는 부분이다.
 * 이 부분을 모두 try로 묶어줘야한다.
 */


import java.util.*;


public class ExceptionTest03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	
		
		try {
			System.out.print("첫 번째 수 입력 : ");
			int num1 = stdIn.nextInt();
			
			System.out.print("두 번째 수 입력 : ");
			int num2 = stdIn.nextInt();
			
			System.out.println("나눗셈 결과 : " + num1 / num2);
			
		} catch (ArithmeticException e) {
			System.out.println("나누는 수는 0이면 안됩니다");
		} catch (NumberFormatException e) {
			System.out.println("입력할 수는 정수만 입력하세요");
		}  catch (Exception e) {
			System.out.println(e + "예외가 발생하였습니다.");
		} finally { // 생략가능. 무조건 실행
			System.out.println("프로그램 종료");
		}

	}

}
