/*
 * 작성일 : 2024년 4월 12일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 점수를 입력 받아 합계와 평균을 출력하시오.
 * 		음수가 입력되면 점수 입력이 종료됩니다.
 * 		100점 이상의 점수는 계산에 포함되지 않습니다.
 * 
 * 
 * 문제분석 :	계속해서 점수를 입력 받습니다 => 무한반복
 * 			
 * 
 * 알고리즘 : 
 * 			1. 합계와 평균의 초기값을 설정합니다
 * 			2. 무한반복
 * 				2-1. 점수를 입력받습니다
 * 				2-2. 만약 점수가 음수이면 점수입력이 종료됩니다.
 * 				2-3. 그러나 100점보다 큰 수의 점수는 계산에 포함되지 않습니다.
 * 				2-4. 0부터 100사이의 점수는 계산에 포함됩니다
 * 			
 * 
 */





import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int i = 0;
		int sum = 0;
		int num;
		
		while(true) {
			
			System.out.print("정수 입력 : ");
			num = stdIn.nextInt();
			
			if (num < 0) {
				System.out.println("점수의 합계는" + sum + "합계의 평균은 " + ((float)sum / i));
				break;
			}
			
			else if (num > 100) {
				continue;
			}
			
			else {
				sum = sum + num;
				i++;
			}
		}
		
		

	}

}
