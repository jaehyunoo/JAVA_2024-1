abstract class Figure1 { // 추상클래스
	abstract void draw();  // 추상메서드
}

interface Shape1{ // 인터페이스
	public void computeArea(double a, double b); 
}

class Triangle3 extends Figure1 implements Shape1{
	void draw() { // 메소드 오버라이딩
		System.out.println("삼각형을 그리는 기능");
	}
	public void computeArea(double a, double h) { // 메소드오버라이딩
		System.out.println("삼각형의 넓이 : " + (a * h / 2));
	}
}
class Polydraw1 {
	public void pdraw(Figure1 f) {
		f.draw();
	}
	public void pcomputeArea(Shape1 s, double a, double b) {
		s.computeArea(a, b);
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		Polydraw1 p = new Polydraw1();
		
		Figure1 fg1 = new Triangle3(); // 추상 , 형변환 => 다형성
		Shape1 sp1 = new Triangle3(); // 인터페이스 , 형변환 => 다형성
		
		p.pdraw(fg1);
		p.pcomputeArea(sp1, 4, 4);

	}

}
