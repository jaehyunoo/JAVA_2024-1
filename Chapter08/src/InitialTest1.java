/*
 * 작성일 : 2024년 5월 3일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 : 
 * 
 * 
 *			
 */
class Initial{
	// 멤버 변수. 묵시적 값 설정. 클래스 전체에서 사용.
	// 클래스 내 메소드 밖에 선언
	int number;	// 속성. 멤버변수. 객체변수
	double rate; // 초기값이 없어도된다.
	String name; // 묵시적 값으로 초기값이 지정.
	int[] score;
	
	// 메소드 선언(소문자로 시작)
	public void aMethod() {
		// 메소드 지역변수
		int count = 0; // 반드시 초기값을 지정해야 한다. 초기값 없으면 오류 발생.
		System.out.println("number : " + number);
		System.out.println("count : " + count);
		
	}
}

public class InitialTest1 {

	public static void main(String[] args) {
		
		int var1;	//메인 메소드에서 사용하는 지역 변수.
		double var2;	// 초기 값이 없다.
		
		// 변수에 초기값이 없어 오류 발생함.
		// System.out.println("지역변수 var1의 값은 : " + var1);
		// System.out.println("지역변수 var2의 값은 : " + var2);
		
		Initial ob1 = new Initial(); // 객체 생성
		
		System.out.println("객체 변수 number의 값은 : " + ob1.number);
		System.out.println("객체 변수 rate의 값은 : " + ob1.rate);
		System.out.println("객체 변수 name의 값은 : " + ob1.name);
		System.out.println("객체 변수 score의 값은 : " + ob1.score);
		
		ob1.aMethod(); // 객체를 통해서 클래스에 있는 메소드 호출

	}

}
