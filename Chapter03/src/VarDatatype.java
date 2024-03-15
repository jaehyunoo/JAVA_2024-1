/*
 * 작성일 : 2024년 3월 15일

 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 변수와 자료형
 */
public class VarDatatype {

	public static void main(String[] args) {
		// 상수 선언 => 상수는 무조건 대문자로. 그리고 자료형 앞에 final 추가
		final int MAX = 100;	// 상수
		final double PI = 3.14;	// 상수
		
		//PI = 3.14159;  // 오류 발생. 상수는 한번 값이 결정되면 변할 수 없다.
		
		int r = 5; // 정수
		double pi = 3.14159; // 실수 변수
		String name = "유재현"; // 문자열(쌍따옴표) => String으로 선언
		char blood = 'A'; // 문자(한따옴표)	=> char로 선언(한문자)	
		// char blood1 = 'AB' // 오류 발생. 문자는 1byte
		
		// 원주율 출력
		System.out.println("원주율은 " + PI + "입니다");
		System.out.println("원주율은 " + pi + "입니다");
		
		// 원의 넓이 계산하여 출력
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + ((r * r) * pi) + "입니다");
		
		// 원의 넓이를 계산한다.
		double area = ((r * r) * pi);
		
		// 원의 넓이를 출력한다.
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + area + "입니다");
		
		// 상수를 이용한 원의 넓이 계산
		area = ((r * r) * PI);
		// printf문 사용
		System.out.printf("반지름이 %d인 원의 넓이는 %f입니다.\n", r, area);
		
		// 확대 형 변환의 순서 => byte >> short/char >> int >> long >> float >>double

	}

}
