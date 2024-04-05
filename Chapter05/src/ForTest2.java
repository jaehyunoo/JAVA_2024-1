/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 알고싶은 단을 입력받아 구구단을 출력하시고
 * 
 * 
 * 문제분석 : 단은 고정이다. 입력 받는다.
 * 			곱하는 수는 1부터 9까지 1씩 증가한다.
 * 			곱셈의 결과는 단 *수 이다.
 * 			구구단 곱셈의 과정이 하나씩 출력되야 한다.
 * 
 * 알고리즘 : 1. 단을 입력받는다.(정수)
 * 			2. 곱하는 수는 1부터 9까지 반복하면서 1씩 증가시킨다. for(초기값;조건식;증감식)
 *				2-1. 반복문안에서 곱하는 수가 증가할때 마다 연산시켜 구구단의 값을 출력한다
 *			
 *
 */

import java.util.Scanner;
public class ForTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 단을 입력받는다.
		System.out.print("단 입력 : ");
		int dan = stdIn.nextInt();
		
		// 2. 곱하는 수는 1부터 9까지 반복하면서 1씩 증가시킨다
		for(int i = 1;i <=9; i++) {
			// 2-1. 반복문안에서 곱하는 수가 증가할때 마다 연산시켜 구구단의 값을 출력한다.
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		
		

	}

}
