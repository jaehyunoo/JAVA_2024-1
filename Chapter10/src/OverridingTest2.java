/*
 * 작성일 : 2024년 5월 24일
 * 작성자 : 컴퓨터소프트웨어공학부 202095061 유재현
 * 설명 :  메소드 오버라이딩
 */
class OT2a {
	// 매개 변수가 1개인 메소드 생성.
	public void show(String str) {
		System.out.println("상위 클래스 메소드 show() 수행 : " + str);
	}
}

class OT2b extends OT2a {	// 상속됨.
	
	// 메소드 이름이 같고, 매개변수의 타입과 개수가 같다.
	// 오버라이딩 = 상위 클래스의 메소드를 재정의 한 것.
	public void show(String s) {
		System.out.println("하위 클래스 메소드 show() 수행 : " + s);
	}
	// 이 클래스는 매개 변수가 있는 메소드와 없는 메소드 2개가 있다.
}
public class OverridingTest2 {

	public static void main(String[] args) {
		OT2b otb = new OT2b();
		otb.show("쉽다 자바"); // 상위 클래스의 메소드를 사용하지 못함. - 하위 클래스에서 재정의 한 메소드 호출
		
		OT2a ota = new OT2a();
		ota.show("어렵다 자바"); // 상위 클래스 메소드 호출.

	}

}
