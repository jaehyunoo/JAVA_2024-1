/*
 * 작성일 : 2024년 4월 30일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : PlusMinus 클래스 생성.
 * 		더하기, 빼기 계산하는 기능이 있다.
 * 
 * 문제분석 : 
 * 
 * 알고리즘 : 
 *			
 */
public class PlusMinus {
	// 속성 정의
	// 변수 생성
	int plus, minus;
	
	//기능(메소드) 정의
	// plus 기능
	
	public String plus(int num1,int num2) {
		plus = num1 + num2;
		return "두 수의 합은 " + plus;
	}
	
	// minus기능
	public String minus(int num1,int num2) {
		minus = num1 - num2;
		return "두 수의 뺄셈은 " + minus;
	}

}
