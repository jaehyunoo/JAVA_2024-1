/*
 * 작성일 : 2024년 3월 26일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 세 자리의 십진수를 입력받아 각자리의 숫자들이 짝수인지 홀수인지 판단.
 * 
 * 
 * 문제분석 : 	짝수는 2로 나눈 나머지가 0이다.
 * 			홀수는 2로 나눈 나머지가 1이다.(0이아니다)
 * 			세자리 수 : 100 ~ 999
 *			예를들어 123을 입력했다면
 *			100의 자리 1은 홀수입니다.
 *			10의 자리 2는 짝수입니다.
 *			1의 자리 3은 홀수입니다. 출력한다.
 *			
 *			100의 자리, 10의 자리, 1의 자리를 구분해야 한다.
 *			힌트) 나누기와 나머지 연산자를 활용한다.
 *
 *[알고리즘]
 *		1. 세 자리수를 입력받는다
 *		2. 백의자리는 세자리수 % 100, 십의자리는 세자리수에서 100으로 나눈 나머지의 / 10, 일의자리는 세자리수에서 10으로나눈 나머지
 */


import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
	
		
		System.out.print("세 자리 십진수를 입력하시오 : ");
		int num = stdIn.nextInt();
		int hnum = (num / 100);  // 백의자리수 변수저장
		int tnum = (num % 100) / 10; // 십의자리수 변수저장
		int onum = (num % 10); // 일의자리수 변수저장
		
		if (num >= 100 && num <= 999) {
			
			// 백의자리수 짝수 홀수 판단
			if (hnum % 2 == 1) {
				System.out.println(num + "의 백의자리 수 " + hnum + "은 홀수입니다." );
			}
			else {
				System.out.println(num + "의 백의자리 수 " + hnum + "은 짝수입니다." );
			}
			
			// 십의자리수 짝수 홀수 판단
			if (tnum % 2 == 1) {
				System.out.println(num + "의 십의자리 수 " + tnum + "은 홀수입니다." );
			}
			else {
				System.out.println(num + "의 십의자리 수 " + tnum + "은 짝수입니다." );
			}
			
			// 일의자리수 짝수 홀수 판단.
			if (onum % 2 == 1) {
				System.out.println(num + "의 일의자리 수 " + onum + "은 홀수입니다." );
			}
			else {
				System.out.println(num + "의 일의자리 수 " + onum + "은 짝수입니다." );
			}
		}
		
		else {
			System.out.println("숫자를 잘못입력하셨습니다");
			}
			
			
		

	}

}
