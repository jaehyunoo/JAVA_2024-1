/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 1부터 입력받은 값까지 합을 출력하시오.
 * 
 * 
 * 문제분석 :	1부터(초기값)
 * 			입력받은값까지(무한반복으로 할경우 입력받은 값보다 커질때 반복문 종료)
 * 			입력 받은값보다 작을 경우에는 1씩 증가(증감식)
 * 			하면서 합계를 계산한다.
 * 			sum = sum + 입력받은값 공식
 * 			sum = 0 초기값 지정이 반드시 필요하다.
 * 
 * 알고리즘 : 
 * 			0. sum = 0 , i = 1으로 초기값을 지정한다.
 * 			1. 정수를 입력받는다
 * 			2. 무한반복한다.
 * 				2-1. 만약 i 가 입력받은 값보다 커질경우 반복문을 종료시키고 합계를 출력시킨다
 * 				2-2. i가 입력받은 값보다 커지지않을경우면 합계에 i를 더해준다.
 */

import java.util.Scanner;

public class BreakTest01 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		int num;
		int i = 1;
		int j,k;
		
		
		for(j = 1; j < 10; j++) {
			for(k = 1; k < j; k++) {
				if(k > 6) {
					break;
				}
				System.out.print("♥");
			}
			System.out.println();
		}
		
		
		System.out.print("정수를 입력하시오 : ");
		num = stdIn.nextInt();
		
		
		while(true) {
			
			// 2-1. 만약 i 가 입력받은 값보다 커질경우 반복문을 종료시키고 합계를 출력시킨다
			if(i > num) {
				System.out.println("1부터 " + num + "까지의 합은 : " + sum);
				break;
			}
			// 2-2. i가 입력받은 값보다 커지지않을경우면 합계에 i를 더해준다.
			else {
				sum = sum + i;
				i++;
			}
			
			
				
			}
			
		}
}
