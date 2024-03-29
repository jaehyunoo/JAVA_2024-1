/*
 * 작성일 : 2024년 3월 29일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 두 정수를 입력받아 두 수가 모두 짝수이면 더한 결과를 출력하고,
 * 그렇지 않고 두 수중 하나라도 홀수이면 몇 번째 입력한 수를 짝수로 입력해야 하는지 출력하시오
 * 
 * 
 * 문제분석 : 	짝수는 2로 나눈 나머지가 0이다.
 * 			홀수는 2로 나눈 나머지가 1이다.(0이아니다)
 * 			첫 번째 수를 
 * 			
 *
 *[알고리즘]
 *		1. 두 정수를 입력받는다.
 *		2. 첫번째 if문은 두수가 전부 짝수일때 더한값을 출력하고
 *		3. 그렇지않으면 그안에 if문을 하나 더 작성해서 num1이 홀수이고 num2가 짝수일경우는
 *			첫번째 숫자를 짝수로 입력해야한다고 출력하고 num1이 짝수이고 num2가 홀수일경우
 *			두번째 숫자를 짝수로 입력해야한다고 출력한다
 *		4. 마지막으로 두개다 짝수일경우는 else에다가 입력해서 두수를 전부 바꿔야한다고 출력한다
 */
import java.util.Scanner;

public class SelectiveTest2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
	
		for(int i = 0;i < 5;i++) {
		
		System.out.print("두 개의 정수를 입력하시오(띄어쓰기로 구분) : ");
		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();
		
		int result = 0;
		
			if (num1 % 2 == 0 && num2 % 2 == 0) {
				result = num1 + num2;
				System.out.println("두 정수의 합은 : " + result);
			}
			else {
				if (num1 % 2 == 1 && num2 % 2 == 0)
				{
					System.out.println("첫 번째수를 짝수로 변경해야합니다");
				}
				
				else if (num1 % 2  == 0 && num2 % 2 ==1){
					System.out.println("두 번째수를 짝수로 변경해야합니다");
				}
				
				else{
					System.out.println("두 수를 전부 짝수로 변경해야합니다");
				}
			}
		}
	}

}
