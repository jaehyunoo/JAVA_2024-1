/*
 * 두 정수를 입력 받아 나눗셈의 결과 출력.
 */


import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = stdIn.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		System.out.println("나눗셈 결과 : " + num1 / num2);

	}

}
