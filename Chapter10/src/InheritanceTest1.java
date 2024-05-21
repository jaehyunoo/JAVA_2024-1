/*
 * 작성일 : 2024년 5월 21일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :  상속과 한정자
 */
class A{
	public int aa = 1; // 멤버변수이면서 모두 접근 가능.
}
// A 클래스를 상속 받음
class B extends A { // 이 클래스에는 aa, bb, bb()가 있다.
	private int bb = 2; // 멤버변수. B클래스에서만 접근 가능
	public int bb() { // 메소드. 모두 접근 가능.
		return bb;  // 이 메소드를 이용하여 외부에서는 접근이 불가능한 bb를 사용할 수 있다.
	}
}

class C extends B {
	// 이 클래스에는 aa, bb, cc, bb()가 있다.
	int cc = 3; // 한정자 없음. 같은 패키지 내에서만 접근 가능.
}
public class InheritanceTest1 {

	public static void main(String[] args) {
		C objc = new C(); // 객체 생성
		System.out.println("cc의 값은 : " + objc.cc); //3 
		// System.out.println("bb의 값은 : " + objc.bb);// 오류발생 . bb는 private로 선언이 되어서
		System.out.println("bb의 값은 : " + objc.bb());  // 메소드로 접근해서 bb출력
		System.out.println("aa의 값은 : " + objc.aa);
	}

}
