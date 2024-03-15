/*
 * 작성일 : 2024년 3월 15일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 연산과 자료형
 * 		두개의 정수를 입력 받아 평균을 계산하는 프로그램.
 * 
 * 		1. 두 정수를 입력 받는다.
 * 		2. 평균을 계산한다.
 * 		3. 평균을 출력한다
 */

//라이브러리 포함
import java.util.Scanner;

public class DataTypeOper {

	public static void main(String[] args) {
		// 두 정수 입력받기
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		//System.out.print("두개의 정수를 입력하시오(스페이스바로 구분) : ");
		
		// 첫 번째 정수 값 받기
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = stdIn.nextInt();
		// 두 번째 정수 값 받기
		System.out.print("두 번째 정수 입력 : ");
		int num2 = stdIn.nextInt();
		
		// 평균 계산
		double avg1 = (num1 + num2) / 2;
		double avg2 = (num1 + num2) / 2.0;
		
		
		// 교수님이 하신 평균출력
		System.out.println("정수 연산 : " + num1 + " + " + num2 + " = " + avg1);
		System.out.println("실수 연산 : " + num1 + " + " + num2 + " = " + avg2);
		
		// 평균 출력
		System.out.println(num1 + "와 " + num2 + "의 평균은 " + avg2 + "입니다");
		
		// 확대 형 변환은 값의 손실이 발생되지 않고 저장이되고 자동으로 형 변환이 발생한다. ex) byte a, (int)a
		// 축소 형 변환은 값의 손실이 발생된다. ex) int a , (byte)a
		

	}

}
