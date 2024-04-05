/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 정수를 입력하시오 : 5
 * ★
 * ★★
 * ★★★
 * ★★★★
 * ★★★★★
 * 
 * 
 * 문제분석 : 첫번째 반복문에서 
 * 
 * 알고리즘 : 
 *			
 */

import java.util.Scanner;

public class nestedLoopTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		
		
		// 1. 정수를 입력받는다.
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		for(int i = 1; i <= num; i++){
			
				for(int j = 1; j <= i;j++) {
					System.out.print("★");
				}
				
			System.out.print("\n");
		}
			

	}

}
