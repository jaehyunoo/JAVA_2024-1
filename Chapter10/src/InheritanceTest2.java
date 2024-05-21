/*
 * 작성일 : 2024년 5월 21일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :  상속과 우선순위
 */
class B1 {
	public int x = 500;
	public int y = 1000;
}

class B2 extends B1 {
	public String x = "오늘은 화요일 입니다.";
	// 이 클래스에는 x(B2),y가 있다.
}
public class InheritanceTest2 {

	public static void main(String[] args) {
		B1 b1 = new B1();
		System.out.println("객체 b1에 들어 있는 x, y 값 : " + b1.x + ", " + b1.y);
		
		B2 b2 = new B2();
		System.out.println("객체 b2에 들어 있는 x, y 값 : " + b2.x + ", " + b2.y);
	}

}
/*
* 같은 이름으로 선언된 멤버 변수의 경우 상위 클래스의 멤버 변수는 가려진다.
* 즉 하위 클래스의 멤버 변수가 우선순위이다.
*/