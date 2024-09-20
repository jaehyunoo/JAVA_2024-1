/*
 * 나이를 입력받아 출력하시오.
 * 입력 받은 나이가 정수가 아닐 경우 예외처리 하시오.
 */

import java.util.Scanner;

public class ExceptionTest08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.print("나이를 입력하시오 : ");
			int age = stdIn.nextInt();
			
			System.out.println("나이는 " + age);
		} catch (Exception e) {
			System.out.println("나이는 정수를입력해주세요");
		}

	}

}
