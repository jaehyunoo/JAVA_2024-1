/*
 * 작성일 : 2024년 4월 2일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 정수를 입력 받아 정수의 팩토리얼값을 출력하시오.
 * 
 * 
 * 문제분석 : 	팩토리얼은 1부터 입력받은 숫자까지의 곱이다. ex) 5! = 5*4*3*2*1
 * 			입력받은 수부터 1까지 1씩 감소하면서 곱셈을한다.
 * 			팩토리얼 = 팩토리얼 * 수
 * 			
 * 
 * 알고리즘 : 0. 정수를 입력 받는다.
 * 			1. 곱셈의 결과의 초기값을 설정한다
 * 
 * 			2. 입력받은 정수가 1보다 같거나 클때까지만 조건식을 반복한다.
 * 				2-1) 팩토리얼 값을 식으로 정의한다.
 * 				2-2) 입력받은 정수의 값을 1씩 감소한다 (num--;)
 * 			3. 팩토리얼 값을 출력한다.
 *
 */
import java.util.Scanner;
public class WhileTest3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
			// 0. 정수를 입력받는다.
			System.out.print("정수 입력 : ");
			int num = stdIn.nextInt();
			System.out.print(num);
			// 1. 곱셈의 결과의 초기값을 설정한다.
			int gop = 1;
			
			// 2. 입력받은 정수가 1보다같거나 클때까지만 조건식을 반복한다.
			while(num >= 1) {
				
				// 2-1)팩토리얼 값을 식으로 정의한다.
				gop *= num; 
				// 2-2)입력받은 정수의 값을 1씩 감소한다.
				num--;
			}
			// 3. 팩토리얼 값을 출력한다.
			System.out.println("! = " + gop);
				
			
		

	}

}
