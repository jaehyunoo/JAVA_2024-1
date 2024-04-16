/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 1차원 배열을 생성하고, 묵시적 초기값을 출력한다
 * 		사용자로부터 값을 입력받아 배열에 저장하고, 합과 평균을 출력하시오
 * 
 * 문제분석 : 
 * 
 * 알고리즘 : 
 *			
 */
import java.util.Scanner;
public class ArrayTest01 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int num[] = new int[5]; //배열 선언 및 생성
		int sum = 0;
		
		System.out.println("배열의 길이 : " + num.length);
		System.out.println("배열에 저장된 초기값");
		
		for(int i = 0;i < num.length;i++) {
			
			System.out.print(i + "번지의 값을 입력하시오 : ");
			int number = stdIn.nextInt();
			num[i] = number;
			
			sum = sum + num[i];
			
			// System.out.println("배열의 " + i + "번지의 값 : " + num[i]);
		}
		
		for (int i = 0; i < num.length;i++) {
			System.out.println("배열의 " + i + "번지의 값 : " + num[i]);
		}
		
		System.out.println("배열의 합은 " + sum + "입니다.");
		System.out.println("배열의 평균은 " + sum / num.length + "입니다");
		
		
	}

}
