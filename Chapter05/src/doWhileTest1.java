/*
 * 작성일 : 2024년 4월 5일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 1부터 10까지 합을 출력하시오.
 * 
 * 
 */
public class doWhileTest1 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1; // 초기값
		
		do {
			sum += num;
			num++; //증감식
		}while(num <= 10); // 조건식

		System.out.println(sum);
	}

}
