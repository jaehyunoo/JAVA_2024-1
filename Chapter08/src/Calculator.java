/*
 * 작성일 : 2024년 5월 3일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 클래스 모음
 * 
 * 
 *			
 */

	// 다른클래스에는 public을 붙이지않는다.
	 class PlusMinus {
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
	
	
		// PlusMinus 로부터 상속
	 	// 곱하기 나누기 클래스 생성.
	 	// 더하기, 빼기, 곱하기, 나누기 기능을 다 가지고 있다.
		class MultiDiv extends PlusMinus{
		
		// 속성 정의
		int multi;
		double div;
		
		// multi 기능(메소드)정의
		public String multi(int num1, int num2) {
			multi  = num1 * num2;
			return "두 수의 곱은 " + multi;
		}
		
		// div 기능(메소드)정의
		// 접근 금지. 캡슐화.
			private String div(int num1, int num2) {
				div  = num1 / num2;
				return "두 수를 나눈 몫은 " + div;
			}
		
		
		}

public class Calculator {
	
	

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus(); // + -
		// MultiDiv 클래스로부터 객체 생성.
		MultiDiv md = new MultiDiv(); // + - * /
		
		// 변수 선언.
		String sum,cha,multi,div;
		
		// pm객체를 통해 PlusMinus 클래스에 있는 메소드 호출
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// 객체를 통해서 minus 메소드 호출해서 결과출력
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		// md 객체를 통해서 MultiDiv 클래스에 있는 메소드 호출
		multi = md.multi(10,20);
		System.out.println(multi);
		
		// md 객체를 통해서 더하기 결과 출력
		// 상속받아 사용하기에 plus 메소드 접근 가능.
		// 메세지가 요구하는 메소드가 자신의 클래스에 없으면 상위 클래스에서 메소드를 찾는다.
		sum = md.plus(10, 20);
		System.out.println(sum);
		
		// md 객체를 통해서 div 메소드 호출
		// div메소드가 private로 선언되어 접근 금지
		//div = md.div(5,2); // 오류발생.
		//System.out.println(div);
		

	}
}