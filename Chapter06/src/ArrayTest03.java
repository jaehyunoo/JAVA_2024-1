/*
 * 작성일 : 2024년 4월 16일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성하시오.
 * 		사용자로 부터 정수를 하나 입력받아 그 정수가 어디에 몇개 있는지 출력하시오.
 * 		입력한 값이 배열에 없다면 "입력한 값이 없습니다"를 출력하시오
 * 
 * 문제분석 : 배열을 생성한다
 * 			반복문을 이용해 정수 값을 저장하여 생성하시오.
 * 			이중 반복문을 이용해
 * 			while로 무한반복으로 정수를 하나 입력받고 
 * 			그안에 for문을 이용해 정수가 어디에 몇개있는지 입력한 값이 존재하지 않을 경우에는 입력한 값이 없습니다를 출력
 * 
 * 알고리즘 : 1. 배열에 값 저장하여 선언 ( 배열에 저장된 값 출력 )
 * 			2. 찾고 싶은 정수를 입력 받는다
 * 			3. 배열의 길이 까지 반복하면서
 * 				3-1. 같은 수가 있으면 몇번지 인지 출력하고 sum을 1 증가시킨다.
 * 			4. sum이 0이면
 * 				4-1. 일치하는 값이 없다.
 * 			5. 아니면(sum에 개수가 있으면)
 * 				5-1. 입력한수가 몇개 있다를 출력.
 *			
 */
import java.util.Scanner;
public class ArrayTest03 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int[] num = {10,20,20,30,40,50,60,70,80};
		
		while(true) {
			System.out.print("정수를 입력하시오(종료 : -1) : ");
			int find = stdIn.nextInt();
			if (find == -1) {
				System.out.println("프로그램 종료!");
				break;
			}
			int sum = 0;
			
			
				for(int i = 0;i < num.length;i++) {
					
					if (find == num[i]) {
						System.out.println("입력하신 정수값은 " + i + "번지에 있습니다");
						sum = sum + 1;
						}
				}
				
			if(sum == 0) {
				System.out.println("입력한 값이 없습니다");
			}
				
			else {
				System.out.println("입력하신 정수값의 총 개수는 " + sum + "입니다");
			}
			
			
			
		}

	}

}
